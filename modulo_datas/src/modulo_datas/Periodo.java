package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class Periodo {
	
	public static void main(String[] args) {
		
		//LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		//LocalDate dataNova = LocalDate.of(2021, 7, 4);
		
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");
		LocalDate dataNova = LocalDate.parse("2021-10-11");
		
		System.out.println("Data antiga é maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias " + periodo.getDays());
		
		System.out.println("Quantos meses " + periodo.getMonths());
		
		System.out.println("Quantos Anos " + periodo.getYears());
		
		System.out.println("Período é: " + periodo.getYears() + " anos " + periodo.getMonths()
				+ " meses " + periodo.getDays() + " dias.");
		
		System.out.println("Somente meses " + periodo.toTotalMonths());
	}

}
