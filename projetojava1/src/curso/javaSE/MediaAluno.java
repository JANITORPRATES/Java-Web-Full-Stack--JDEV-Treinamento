package curso.javaSE;

public class MediaAluno {

	public static void main(String[] argumentos) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 80;
		int nota4 = 10;

		double media = (nota1 + nota2 + nota3 + nota4) / 4.0;

		//Condi��es l�gicas com IF e ELSE
		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupera��o: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}
		
		/*Operadores tern�rios ?: s�o para micro valida��es*/
		
		//String saidaResultado = media >= 70 ? "Aluno aprovado" : "Aluno reprovado";
		
		String saidaResultado = media >= 70 ? "Aluno aprovado" : (media >= 40 && media <= 69) ?
				"Aluno em recupera��o" : "Aluno reprovado";
		
		System.out.println(saidaResultado);
		

	}

}
