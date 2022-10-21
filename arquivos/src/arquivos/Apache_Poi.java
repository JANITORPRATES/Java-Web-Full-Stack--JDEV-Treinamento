package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Apache_Poi {

	public static void main(String[] paramentos) throws IOException {
		
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
		
		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Maria");
		pessoa4.setEmail("maria@hotmail.com");
		pessoa4.setIdade(52);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		File arquivo = new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo_Excel.xls");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		HSSFWorkbook escreverNaPlanilha = new HSSFWorkbook();//Prepara a entrada do arquivo excel pra ler
		HSSFSheet linhasPessoa = escreverNaPlanilha.createSheet("Planilha de pessoas");
		
		int numeroLinha = 0;
		
		for(Pessoa p : pessoas) {
			Row linha = linhasPessoa.createRow(numeroLinha++);//Criando a linha na planilha
			
			int celula = 0;
			
			Cell celulaNome = linha.createCell(celula++); //célula 1
			celulaNome.setCellValue(p.getNome());
			
			Cell celulaEmail = linha.createCell(celula++);//célula 2
			celulaEmail.setCellValue(p.getEmail());
			
			Cell celulaIdade = linha.createCell(celula++);//célula 3
			celulaIdade.setCellValue(p.getIdade());
			
		}//Terminou de montar a planilha
		
		FileOutputStream saida = new FileOutputStream(arquivo);
		escreverNaPlanilha.write(saida);//Escreve a planilha no arquivo
		
		saida.flush();
		saida.close();
		
		System.out.println("A planilha foi criada");
		
	}//Fim main
}
