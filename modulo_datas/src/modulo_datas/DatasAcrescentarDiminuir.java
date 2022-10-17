package modulo_datas;

import java.time.LocalDate;

public class DatasAcrescentarDiminuir {
	
	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
		
		System.out.println("Menos 1 ano: " + (dataBase = dataBase.minusYears(1)));
		
		System.out.println("Menos 1 mes: " + (dataBase = dataBase.minusMonths(1)));
		
		System.out.println("Menos 20 dias: " + (dataBase = dataBase.minusDays(20)));
	}

}
