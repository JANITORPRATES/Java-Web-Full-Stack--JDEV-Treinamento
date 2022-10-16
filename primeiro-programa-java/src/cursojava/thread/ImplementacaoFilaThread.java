package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila =
					new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void adiciona(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Fila rodando");
		
		while(true) {
			
			synchronized (pilha_fila) {/*Bloquea o acesso a esta lista por outro processo isso garante
			que só a minha thread vai acessar essa lisata*/
				
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) {//Enquanto conter dados na lista irá processar
					
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();//Pega o objeto atual
					/* Processar 10 mil notas fiscal
					 * Gerar uma lista enorme de PDF
					 * Gerar um envio em massa de email*/
					System.out.println("-----------------------------------------------");
					
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					
					iteracao.remove();
					
					try {
						Thread.sleep(100);//Dar um tempo pra descarga de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}//Fim while
			}
			
			try {
				Thread.sleep(1000);// Processou toda a lista dá um tempo pra limpeza de memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
