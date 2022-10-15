package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] argumentos) {

		double[] notas = { 8.8, 9.7, 7.6, 6.8 };
		double[] notasLogica = { 7.8, 8.7, 5.6, 9.8 };

		/* Cria��o do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("J�nitor");
		aluno.setNomeEscola("Jdev Treinamentos");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Palloma");
		aluno2.setNomeEscola("Adm Treinamentos");

		// Cria��o da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("L�gica de programa��o");
		disciplina2.setNota(notasLogica);

		// Cria��o da disciplina
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso Virada Financeira");
		disciplina3.setNota(notas);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Fii's do zero");
		disciplina4.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		aluno2.getDisciplinas().add(disciplina3);
		aluno2.getDisciplinas().add(disciplina4);

		/*----------------------------------------------------------*/

		Aluno[] arrayAlunos = new Aluno[2];

		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;

		for (int pos = 0; pos < arrayAlunos.length; pos++) {

			System.out.println("\nNome do aluno �: " + arrayAlunos[pos].getNome());

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("\nNome da disciplina �: " + d.getDisciplina());

				for (int posNota = 0; posNota < d.getNota().length; posNota++) {
					System.out.println("A nota n�mero: " + posNota + " � igual = " + d.getNota()[posNota]);
				}

			}
		}

	}

}
