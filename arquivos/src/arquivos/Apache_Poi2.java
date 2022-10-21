package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Apache_Poi2 {

	public static void main(String[] paramentos) throws IOException {
		
		FileInputStream entrada = new FileInputStream(new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo_Excel.xls"));
		
		HSSFWorkbook escreverPlanilha = new HSSFWorkbook(entrada);//Prepara o arquivo excel para ler
		
		HSSFSheet planilha = escreverPlanilha.getSheetAt(0);//Pega a primeira planilha do arquivo_Excel.xls
		
		Iterator<Row> linhaIterator =  planilha.iterator();
		
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		
		while(linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			
			Iterator<Cell> celulas = linha.iterator();
			
			Pessoa pessoa = new Pessoa();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				
				switch(cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
				
			}
			
			listaPessoa.add(pessoa);
			
		}
		
		entrada.close();//Terminou de ler o arquivo excel 
		
		for(Pessoa p : listaPessoa) { //Poderia gravar num banco de dados por exemplo
			System.out.println(p);
		}
		
		
		
	}//Fim main
}
