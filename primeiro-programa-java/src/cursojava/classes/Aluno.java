package cursojava.classes;

/*Esta é nossa classe/objeto que representa o Aluno*/
public class Aluno {
	
	/*Esses são os atributos do Aluno*/
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
	
	public Aluno() { /*Cria os dados na memória - Sendo o padrão do Java.
	Caso não tenha o java cria esse construtor implicitamente em tempo de execução*/
				
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
