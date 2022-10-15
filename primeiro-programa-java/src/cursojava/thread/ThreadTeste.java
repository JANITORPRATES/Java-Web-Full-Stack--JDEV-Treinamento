package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadTeste {
	
	public static void main(String[] parametros) throws InterruptedException {
		
		/*Thread processando em paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/*============================ DIVISAO DAS THREADS =========================================*/
		
		/*Thread processando em paralelo do envio de nota fiscal*/
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		
		/*C�digo do sistema do usu�rio continua o fluxo de trabalho*/
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
		/*Fluxo do sistema, cadastro de venda, uma emiss�o d enota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}//Fim do main
	
	
	private static Runnable thread2 = new Runnable() {
        public void run() {
        	//C�digo da rotina
			
			/*C�digo da rotina que eu quero executar em paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}// D� um tempo
			}
			//Fim do c�digo em paralelo
	}
        
    };
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			//C�digo da rotina
			
			/*C�digo da rotina que eu quero executar em paralelo*/
			for(int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio com um tempo de parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina, por exemplo envio autom�tico de e-mail");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}// D� um tempo
			}
			//Fim do c�digo em paralelo
		}
	};

}//Fim da classe
