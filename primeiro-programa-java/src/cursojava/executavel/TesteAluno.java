package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class TesteAluno {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] parametros) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		
		Aluno aluno1;//Objeto ainda não existe na memória
		aluno1 = new Aluno(); //agora passa a existir na memória
		
		//new Aluno() é uma instância (criação do Objeto)
		 // aluno1 é uma referência para o objeto Aluno
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		
		Disciplina disc1 = new Disciplina();
		disc1.setDisciplina("Banco de dados");
		disc1.setNota(80);
		
		Disciplina disc2 = new Disciplina();
		disc2.setDisciplina("Java");
		disc2.setNota(90);
		
		Disciplina disc3 = new Disciplina();
		disc3.setDisciplina("Html");
		disc3.setNota(97);
		
		Disciplina disc4 = new Disciplina();
		disc4.setDisciplina("JavaScript");
		disc4.setNota(85);
		
		aluno1.getDisciplinas().add(disc1);
		aluno1.getDisciplinas().add(disc2);
		aluno1.getDisciplinas().add(disc3);
		aluno1.getDisciplinas().add(disc4);
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}//Fim do main
}//Fim da classe

