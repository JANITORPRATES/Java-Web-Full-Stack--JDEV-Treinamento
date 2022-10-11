package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class TesteAluno {
	
	/*Main é um método auto executável em Java*/
	public static void main(String[] parametros) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <= 2; qtd++) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
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
		List<Disciplina> listaDisciplinas = aluno1.getDisciplinas();
		
		//new Aluno() é uma instância (criação do Objeto)
		 // aluno1 é uma referência para o objeto Aluno
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);*/

		for(int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			listaDisciplinas.add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == JOptionPane.YES_OPTION) {
			
			int continuarRemover = JOptionPane.YES_OPTION;
			int tamanho;
			while(continuarRemover == JOptionPane.YES_OPTION) {
				tamanho = listaDisciplinas.size();
				String disciplinRemover = "";
				if(tamanho == 1) {
					escolha = JOptionPane.showConfirmDialog(null, "Resta apenas a disciplina "+ listaDisciplinas.get(0).getDisciplina() 
					+ "\n tem certeza que quer remover?");
					if(escolha == JOptionPane.YES_OPTION) {
						listaDisciplinas.remove(0);
						continuarRemover = JOptionPane.NO_OPTION;
					}
					
				}else {
					String opcoesDisciplinas = "";
					for(int i = 0; i < tamanho; i++) {
						opcoesDisciplinas += (i + 1) + " - " + listaDisciplinas.get(i).getDisciplina() + "\n";
					}
					
					disciplinRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover:\n" + opcoesDisciplinas);
					int opcao = Integer.valueOf(disciplinRemover).intValue();
					if(opcao > 0 && opcao <= tamanho) {
						listaDisciplinas.remove(opcao - 1);
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
					}else {
						JOptionPane.showMessageDialog(null, "Opção inválida!!");
					}
							
					
				}
				
				//listaDisciplinas.remove(Integer.valueOf(disciplinRemover).intValue() - posicao);
				//posicao++;
				
				
			}//Fim do while
			
		}
		
		alunos.add(aluno1);
	}
		
		for(Aluno aluno : alunos) {
			System.out.println(aluno);
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
			System.out.println("\n_____________________________________________\n");
		}
		

	}//Fim do main
}//Fim da classe

