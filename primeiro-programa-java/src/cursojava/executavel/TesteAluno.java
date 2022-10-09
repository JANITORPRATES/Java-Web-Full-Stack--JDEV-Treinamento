package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class TesteAluno {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] parametros) {
		/*
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
		*/
		Aluno aluno1;//Objeto ainda não existe na memória
		aluno1 = new Aluno(); //agora passa a existir na memória
		
		//new Aluno() é uma instância (criação do Objeto)
		 // aluno1 é uma referência para o objeto Aluno
		/*
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);*/

		System.out.print("aqui");
		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == JOptionPane.YES_OPTION) {
			String disciplinRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinRemover).intValue() - 1);
		}
		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}//Fim do main
}//Fim da classe

