package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadTeste {
	
	public static void main(String[] parametros) throws InterruptedException {
		
		/*Thread processando em paralelo*/
		new Thread() {
			
			public void run() {//Executa o que nós queremos
				//Código da rotina
				
				/*Código da rotina que eu quero executar em paralelo*/
				for(int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio com um tempo de parada ou com um tempo determinado */
					System.out.println("Executando alguma rotina, por exemplo envio automático de e-mail");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}// Dá um tempo
				}
				//Fim do código em paralelo
				
			}
			
		}.start();/*Start liga a thread que fica processando paralelamente por trás*/
		
		
		/*Código do sistema do usuário continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
		/*Fluxo do sistema, cadastro de venda, uma emissão d enota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
