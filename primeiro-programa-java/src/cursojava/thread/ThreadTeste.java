package cursojava.thread;

public class ThreadTeste {
	
	public static void main(String[] parametros) throws InterruptedException {
		
		for(int pos = 0; pos < 10; pos++) {
			
			/*Quero executar esse envio com um tempo de parada ou com um tempo determinado */
			System.out.println("Executando alguma rotina, por exemplo envio autom�tico de e-mail");
			
			Thread.sleep(1000);// D� um tempo
		}
		
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
	}

}
