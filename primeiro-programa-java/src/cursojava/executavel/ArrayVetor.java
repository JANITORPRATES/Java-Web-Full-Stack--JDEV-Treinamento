package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		/* Array pode ser de todos os tipos de dados e objetos também
		 * Array sempre deve ter a quantidade de posições definidas */
		double[] notas = new double[5];
		
		/*Atribuir valor nas posições do arrays*/
		notas[0] = 8.5;
		notas[1] = 7.6;
		notas[2] = 6.8;
		notas[3] = 9.5;
		
		System.out.println("nota 1 = " + notas[0]);
		System.out.println("nota 2 = " + notas[1]);
		System.out.println("nota 3 = " + notas[2]);
		System.out.println("nota 4 = " + notas[3]);
		System.out.println("nota 5 = " + notas[4]);
		
	}

}
