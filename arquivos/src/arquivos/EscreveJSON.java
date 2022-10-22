package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {

		Usuario usuario1 = new Usuario();
		usuario1.setNome("Jânitor");
		usuario1.setCpf("016765");
		usuario1.setLogin("janitor");
		usuario1.setSenha("123");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Palloma");
		usuario2.setCpf("045234");
		usuario2.setLogin("palloma");
		usuario2.setSenha("123");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String jsonUsuario = gson.toJson(usuarios);
		
		System.out.println(jsonUsuario);
		
		File arquivo = new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\fileJson.json");
		
		//FileWriter fileWriter = new FileWriter(arquivo);
		
		OutputStreamWriter fileWriter = new OutputStreamWriter(new FileOutputStream(arquivo), "UTF-8");
				
		fileWriter.write(jsonUsuario);
		fileWriter.flush();
		fileWriter.close();
		
		
		//======================= LENDO O ARQUIVO JSON ====================================
		
		FileReader fileReader = new FileReader(arquivo);
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> jSonToListaUsuarios = new ArrayList<Usuario>();
		
		for(JsonElement jsonElement : jsonArray) {//cada JsonElement vai ser um JSon
		
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			jSonToListaUsuarios.add(usuario);
			
		}
		
		System.out.println("Leitura do arquivo JSON: " + jSonToListaUsuarios);
	}

}
