package curso.javaSE;

public class DiaSemana {
	
	//SWITCH CASE: OPERAÇÕES EXATAS
	
	public static void main(String[] argumentos) {
		
		int dia = 3;
		
		switch (dia) {
		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
			
		default:
			System.out.println("Outro dia qualquer");
			break;
		}
		
	}
	
}
