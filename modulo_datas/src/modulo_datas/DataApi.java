package modulo_datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataApi {
	
	public static void main(String[] args) {
		
		/*Nova API de data a partir do Java 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " 
					+ dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		System.out.println("Dia da semana: " + dataAtual.getDayOfWeek().name());
		
		System.out.println("Dia do m�s: " + dataAtual.getDayOfMonth());
		
		System.out.println("Dia do ano: " + dataAtual.getDayOfYear());
		
		System.out.println("M�s: " + dataAtual.getMonth());
		
		System.out.println("Ano: " + dataAtual.getYear());
		
	}
	

}
