package cursojava.executavel;

import cursojava.classes.Aluno;

public class TesteAluno {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] parametros) {
		
		
		Aluno aluno1;/*Objeto ainda não existe na memória*/
		aluno1 = new Aluno(); //agora passa a existir na memória
		
		/*new Aluno() é uma instância (criação do Objeto)
		 * aluno1 é uma referência para o objeto Aluno*/
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
	}

}
