package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		/* Array pode ser de todos os tipos de dados e objetos tamb�m
		 * Array sempre deve ter a quantidade de posi��es definidas */
		double[] notas = new double[5];
		
		/*Atribuir valor nas posi��es do arrays*/
		notas[0] = 8.5;
		notas[1] = 7.6;
		notas[2] = 6.8;
		notas[3] = 9.5;
		
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos +  1) + " � = " + notas[pos]);
		}
	}

}
