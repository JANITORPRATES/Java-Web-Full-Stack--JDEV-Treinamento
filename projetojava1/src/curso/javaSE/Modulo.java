package curso.javaSE;

import javax.swing.JOptionPane;

public class Modulo {
	
	public static void main(String[] paramentos) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		int carroNumero = Integer.parseInt(carros);
		int pessoaNumero = Integer.parseInt(pessoas);
		
		int divisao = carroNumero / pessoaNumero;
		int resto = carroNumero % pessoaNumero; /*Módulo: Resto da divisão % */

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if(resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Divisão para cada pessoa deu " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisão é " + resto);
		}
	}

}
