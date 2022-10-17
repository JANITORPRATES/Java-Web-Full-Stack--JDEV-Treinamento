package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DuracaoExata {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant iFinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, iFinal);
		
		System.out.println("Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		
		System.out.println("Dura��o em horas: " + duracao.toHours());
		
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		
		System.out.println("Dura��o em dias: " + duracao.toDays());
	}

}
