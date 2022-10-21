package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = 
				new FileInputStream(new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo.csv"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoa> listaPessoas = new ArrayList();
		
		while(lerArquivo.hasNext()) {
			
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split(";");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				listaPessoas.add(pessoa);
				
			}
			
		}//Fim while
		
		System.out.println(listaPessoas);
		
		for(Pessoa p : listaPessoas) {
			System.out.println(p);
		}
	}

}
