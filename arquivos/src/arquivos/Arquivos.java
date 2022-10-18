package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		for(int i = 1; i <= 10; i++) {
			escreverNoArquivo.write("Texto da minha linha " + i + "\n");
		}
		escreverNoArquivo.flush();
		escreverNoArquivo.close();

	}

}
