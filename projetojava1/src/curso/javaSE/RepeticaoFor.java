package curso.javaSE;

public class RepeticaoFor {
	
	public static void main(String[] paramentros) {
		
		//Estrutura de repeticao FOR e BREAK
		
		for (int numero = 0; numero <= 10; numero++) {
			if(numero == 3) {
				System.out.println("Obaaa, encontrei o numero 3");
				System.out.println("estou parando de executar");
				break;
			}
		}
		
		//Estrutura de repeticao FOR e CONTINUE
		
		for (int i = 0; i <= 10; i++) {
			if(i == 3 || i == 6 || i == 9) {
				System.out.println("Obaaa, encontrei o numero " + i);
				continue;
			}
			
			System.out.println("Processando laço de repetição");
		}
		
	}

}
