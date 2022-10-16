package modulo_datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasChronoUnit {

	public static void main(String[] args) {
		
		//Total de dias (DAYS), semanas(WEEK), anos (YEARS) de uma data até hoje
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2022-10-10"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
	}
}
