package cursojava.thread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {
	
	public TelaTimeThread() { /*Executa o que tiver dentro no momento da abertura ou execu��o*/
		setTitle("Minha tela de time com Thread");
		setSize(new Dimension(300, 300));
		setLocationRelativeTo(null);//centraliza na tela
		setResizable(false);//permite ou n�o redimensionar a tela
		/*Primeira parte conclu�da*/
		
		
		
		
		//Sempre ser� o �ltimo comando
		setVisible(true);/*Torna a tela vis�vel para o usu�rio*/
	}

}
