package curso.javaSE;

public class RepeticaoWhile {

	public static void main(String[] argumentos) {
		/* Estrutura de repeti��o while */
		
		int numero = 0;
		
		while (numero <= 60) { // Verifica e depois executa
			
			System.out.println("O numero atual �: " + numero);
			numero++;
		}
		
		/*----------------------------------------*/
		
		int numero2 = 0;
		do { //Primeiro executa e depois verifica
			
			System.out.println("O numero atual �: " + numero2);
			numero2++;
		} while (numero2 <= 60);
		
	}
}
