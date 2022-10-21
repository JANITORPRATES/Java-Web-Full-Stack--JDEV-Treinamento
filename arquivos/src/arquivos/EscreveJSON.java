package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

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
		
		String jsonUsuario = new Gson().toJson(usuarios);
		
		System.out.println(jsonUsuario);
		
		FileWriter fileWriter = new FileWriter(new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\fileJson.json"));
		
		fileWriter.write(jsonUsuario);
		fileWriter.flush();
		fileWriter.close();
	}

}
