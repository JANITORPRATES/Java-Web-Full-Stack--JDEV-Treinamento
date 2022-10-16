package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Calendar calendario = Calendar.getInstance();
		
		Date data = new Date();
		
		System.out.println("Data em milisegundos: " + data.getTime());
		System.out.println("Calendar em milisegundos: " + calendario.getTimeInMillis());
		
		System.out.println("Dia do mês: " + data.getDate());
		System.out.println("Calendar dia do mês: " + calendario.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + data.getDay());
		System.out.println("Calendar dia da semana: " + calendario.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Hora do dia: " + data.getHours());
		System.out.println("Calendar hora do dia: " + calendario.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + data.getMinutes());
		System.out.println("Calendar minuto da hora: " + calendario.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + data.getSeconds());
		System.out.println("Calendar segundos: " + calendario.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (data.getYear() + 1900));
		System.out.println("Calendar ano: " + calendario.get(Calendar.YEAR));
		
		/*---------------------- Simple Date Format -----------------------*/
		
		SimpleDateFormat formatoSimplesData = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao e String: " + formatoSimplesData.format(data));
		System.out.println("Calendar data atual em formato padrao e String: " + 
		formatoSimplesData.format(calendario.getTime()));
		
		formatoSimplesData = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato para banco de dados: " + formatoSimplesData.format(data));
		System.out.println("Calendar data em formato para banco de dados: " + formatoSimplesData.format(calendario.getTime()));
		
		System.out.println("Objeto Date: " + formatoSimplesData.parse("1985-09-22 07:20.10"));
		
		formatoSimplesData = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Objeto Date (Palloma): " + formatoSimplesData.parse("28/02/1993"));
		
	}

}
