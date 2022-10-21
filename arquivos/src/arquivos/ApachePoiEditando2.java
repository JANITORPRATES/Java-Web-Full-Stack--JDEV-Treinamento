package arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiEditando2 {

	public static void main(String[] args) throws IOException {

		File file = new File("E:\\CODIGOS\\Java-Web-Full-Stack-JDEV-Treinamento\\arquivos\\src\\arquivos\\arquivo_Excel.xls");
		FileInputStream entrada = new FileInputStream(file);
		
		HSSFWorkbook hssfworkbook = new HSSFWorkbook(entrada); //Prepara a entrada do arquivo xsl excel
		HSSFSheet planilha = hssfworkbook.getSheetAt(0);//Pegando a planilha
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		while(linhaIterator.hasNext()) {//Enquanto tiver linha
			Row linha = linhaIterator.next(); //Dados da pessoa na linha
			
			String valorCelula = linha.getCell(0).getStringCellValue();
			
			linha.getCell(0).setCellValue(valorCelula + " NÃO PODE EDITAR NA MÃO O arquivo_Excel.xls");
		}
		
		entrada.close();
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfworkbook.write(saida);
		saida.flush();
		saida.close();
		
		System.out.println("Planilha atualizada");
	}

}
