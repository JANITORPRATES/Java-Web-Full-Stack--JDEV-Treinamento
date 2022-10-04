package cursojava.executavel;

import cursojava.classes.Aluno;

public class TesteAluno {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] parametros) {
		
		
		Aluno aluno1;/*Objeto ainda não existe na memória*/
		aluno1 = new Aluno(); //agora passa a existir na memória
		
		/*new Aluno() é uma instância (criação do Objeto)
		 * aluno1 é uma referência para o objeto Aluno*/
		
		aluno1.setNome("Jânitor");
		aluno1.setIdade(37);
		aluno1.setDataNascimento("22/09/1985");
		aluno1.setNomeMae("Lindinalva");
		aluno1.setNomePai("Tadeu");
		aluno1.setRegistroGeral("111536");
		aluno1.setNumeroCpf("016765");
		aluno1.setNomeEscola("JDev Treinamentos");
		aluno1.setDataMatricula("01/10/2022");
		aluno1.setSerieMatriculado("1");
		
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascido em = " + aluno1.getDataNascimento());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		System.out.println("--------------------------------------------------------------------");
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Palloma");
		aluno2.setIdade(29);
		aluno2.setDataNascimento("28/02/1993");
		
		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Nascido em = " + aluno2.getDataNascimento());
				
		/*--------------------------------------------------------------------*/
		
		Aluno aluno3 = new Aluno();
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
	}

}
