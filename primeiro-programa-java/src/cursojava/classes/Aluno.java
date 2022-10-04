package cursojava.classes;

/*Esta � nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses s�o os atributos do Aluno*/
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() { /*Cria os dados na mem�ria - Sendo o padr�o do Java.
	Caso n�o tenha o java cria esse construtor implicitamente em tempo de execu��o*/
				
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
