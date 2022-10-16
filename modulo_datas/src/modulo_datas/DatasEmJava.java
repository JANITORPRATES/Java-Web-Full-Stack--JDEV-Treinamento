package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = formatoData.parse("18/10/2022");
		
		Date dataAtualHoje = formatoData.parse("16/10/2022");
		
		/*Se a data 1 é maior que a data 2*/
		if(dataVencimentoBoleto.after(dataAtualHoje)) {//Posterior ou maior ou depois da data atual
			System.out.println("O boleto não está vencido");
		}else {
			System.out.println("O boleto está vencido - URGENTE");
		}
	}

}
