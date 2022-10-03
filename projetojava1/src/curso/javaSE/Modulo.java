package curso.javaSE;

import javax.swing.JOptionPane;

public class Modulo {
	
	public static void main(String[] paramentos) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		int carroNumero = Integer.parseInt(carros);
		int pessoaNumero = Integer.parseInt(pessoas);
		
		int divisao = carroNumero / pessoaNumero;
		int resto = carroNumero % pessoaNumero; /*M�dulo: Resto da divis�o % */

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divis�o?");
		
		if(resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Divis�o para cada pessoa deu " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divis�o � " + resto);
		}
	}

}
