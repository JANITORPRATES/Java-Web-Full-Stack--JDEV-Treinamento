package curso.javaSE;

public class MediaAluno {

	public static void main(String[] argumentos) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 80;
		int nota4 = 10;

		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

		//Condições lógicas com IF e ELSE
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		/*Operadores ternários ?: são para micro validações*/
		
		//String saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		
		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ?
				"Aluno em recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		

	}

}
