package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		/* Array pode ser de todos os tipos de dados e objetos tamb�m
		 * Array sempre deve ter a quantidade de posi��es definidas */
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos +  1) + " � = " + notas[pos]);
		}
	}

}
