package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Date data = new Date();
		
		System.out.println("Data em milisegundos: " + data.getTime());
		
		System.out.println("Dia do mês: " + data.getDate());
		
		System.out.println("Dia da semana: " + data.getDay());
		
		System.out.println("Hora do dia: " + data.getHours());
		
		System.out.println("Minuto da hora: " + data.getMinutes());
		
		System.out.println("Segundos: " + data.getSeconds());
		
		System.out.println("Ano: " + (data.getYear() + 1900));
		
		/*---------------------- Simple Date Format -----------------------*/
		
		SimpleDateFormat formatoSimplesData = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao e String: " + formatoSimplesData.format(data));
		
		formatoSimplesData = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato para banco de dados: " + formatoSimplesData.format(data));
		
		System.out.println("Objeto Date: " + formatoSimplesData.parse("1985-09-22 07:20.10"));
		
		formatoSimplesData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto Date (Palloma): " + formatoSimplesData.parse("28/02/1993"));
		
	}

}
