package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Jânitor");
		pessoa1.setEmail("janitorcacule@hotmail.com");
		pessoa1.setIdade(37);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Palloma");
		pessoa2.setEmail("palloma.cle@hotmail.com");
		pessoa2.setIdade(29);
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Nalva");
		pessoa3.setEmail("nalva@hotmail.com");
		pessoa3.setIdade(58);
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		/*Pode vir do banco de dados ou qualquer fonte de dados*/
		File arquivo = new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {
			escreverNoArquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
			
		}
		escreverNoArquivo.flush();
		escreverNoArquivo.close();

	}

}
