package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasCalendar {

	public static void main(String[] args) throws ParseException {

		Calendar calendario = Calendar.getInstance(); //Pega a data atual

		/*Simular que a data vem do banco de dados*/
		calendario.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("16-10-2022"));//Definindo uma data qualquer
		
		calendario.add(Calendar.DAY_OF_MONTH, 4);//acrescenta 4 dias 
		
		System.out.println("Somando 4 dias a partir da data 16-10-2022: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		
		calendario.add(Calendar.DAY_OF_MONTH, 40);//Data de hoje mais 40 dias 
		
		System.out.println("Somando 40 dias a partir da data (16-10-2022 + 4 = 20-10-2022) : " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		
		calendario.add(Calendar.MONTH, 1);
		
		System.out.println("Somando o mês, a partir da data 29-10-2022: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
	
		calendario.add(Calendar.YEAR, 1);
		
		System.out.println("Somando um ano, a partir da data 29-11-2022: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
	
	}

}
