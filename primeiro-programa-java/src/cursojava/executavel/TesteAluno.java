package cursojava.executavel;

import cursojava.classes.Aluno;

public class TesteAluno {
	
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] parametros) {
		
		
		Aluno aluno1;/*Objeto ainda n�o existe na mem�ria*/
		aluno1 = new Aluno(); //agora passa a existir na mem�ria
		
		/*new Aluno() � uma inst�ncia (cria��o do Objeto)
		 * aluno1 � uma refer�ncia para o objeto Aluno*/
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("Jos�", 50);
		
	}

}
