package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class TesteAluno {

	/* Main é um método auto executável em Java */
	public static void main(String[] parametros) {

		try {
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		//PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) { /*Vou travar o autorizar somente quem realmente tem o contrato 100% legitmo*/

			List<Aluno> alunos = null; //new ArrayList<Aluno>() - correção do erro

			HashMap<String, List<Aluno>> maps = new HashMap<>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
				/*
				 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
				 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
				 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
				 * JOptionPane.showInputDialog("Qual é o CPF?"); String mae =
				 * JOptionPane.showInputDialog("Nome da mãe?"); String pai =
				 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
				 * JOptionPane.showInputDialog("Data da matricula"); String serie =
				 * JOptionPane.showInputDialog("Qual a serie"); String escola =
				 * JOptionPane.showInputDialog("Nome da escola");
				 */
				Aluno aluno1;// Objeto ainda não existe na memória
				aluno1 = new Aluno(); // agora passa a existir na memória
				List<Disciplina> listaDisciplinas = aluno1.getDisciplinas();

				// new Aluno() é uma instância (criação do Objeto)
				// aluno1 é uma referência para o objeto Aluno
				aluno1.setNome(nome);
				/*
				 * aluno1.setIdade(Integer.valueOf(idade));
				 * aluno1.setDataNascimento(dataNascimento); aluno1.setNomeMae(mae);
				 * aluno1.setNomePai(pai); aluno1.setRegistroGeral(rg);
				 * aluno1.setNumeroCpf(cpf); aluno1.setNomeEscola(escola);
				 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
				 */

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + "?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					listaDisciplinas.add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == JOptionPane.YES_OPTION) {

					int continuarRemover = JOptionPane.YES_OPTION;
					int tamanho;
					while (continuarRemover == JOptionPane.YES_OPTION) {
						tamanho = listaDisciplinas.size();
						String disciplinRemover = "";
						if (tamanho == 1) {
							escolha = JOptionPane.showConfirmDialog(null, "Resta apenas a disciplina "
									+ listaDisciplinas.get(0).getDisciplina() + "\n tem certeza que quer remover?");
							if (escolha == JOptionPane.YES_OPTION) {
								listaDisciplinas.remove(0);
								continuarRemover = JOptionPane.NO_OPTION;
							}else {
								continuarRemover = JOptionPane.NO_OPTION;
							}

						} else {
							String opcoesDisciplinas = "";
							for (int i = 0; i < tamanho; i++) {
								opcoesDisciplinas += (i + 1) + " - " + listaDisciplinas.get(i).getDisciplina() + "\n";
							}

							disciplinRemover = JOptionPane
									.showInputDialog("Qual disciplina deseja remover:\n" + opcoesDisciplinas);
							int opcao = Integer.valueOf(disciplinRemover).intValue();
							if (opcao > 0 && opcao <= tamanho) {
								listaDisciplinas.remove(opcao - 1);
								continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
							} else {
								JOptionPane.showMessageDialog(null, "Opção inválida!!");
							}

						}

					} // Fim do while

				}

				alunos.add(aluno1);

			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {// Separei em listas

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno); // alunosAprovados.add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno); // alunosRecuperacao.add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno); // alunosReprovados.add(aluno);
				}
			}

			System.out.println("------------------- Lista dos Aprovados ---------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println("------------------- Lista dos Reprovados ---------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}

			System.out.println("------------------- Lista dos Recuperação ---------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Aluno " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
						+ " com média de = " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
		
		//aqui
	}catch (Exception e) {
		
		e.printStackTrace(); // Imprime erro no console Java
		
		//Mensagem do erro ou causa
		System.out.println("Mensagem: " + e.getMessage());
		
		for(int i = 0; i < e.getStackTrace().length; i++) {
			System.out.println("\nClasse que ocorreu o erro: " + e.getStackTrace()[i].getClassName());
			System.out.println("\nMétodo que ocorreu o erro: " + e.getStackTrace()[i].getMethodName());
			System.out.println("\nLinha que ocorreu o erro: " + e.getStackTrace()[i].getLineNumber());
			System.out.println("\nNome da classe que gerou a exceção: " + e.getClass().getName());
		}
		JOptionPane.showMessageDialog(null, "Erro ao processar notas");
	}

	}// Fim do main
}// Fim da classe
