package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasParcelasMensais {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataInicial);
		
	     for (int parcela = 1; parcela <= 12; parcela++) {
	    	 calendario.add(Calendar.MONTH, 1);

	            System.out.println("Parcela numero: " + parcela + " vencimento é em : "
	                    + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));

	        }
	}
}
