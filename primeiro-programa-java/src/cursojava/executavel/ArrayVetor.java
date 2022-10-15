package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.8,8.7,5.6,9.8};
		
		/*Cria��o do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("J�nitor");
		aluno.setNomeEscola("Jdev Treinamentos");
		
		//Cria��o da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina.setDisciplina("L�gica de programa��o");
		disciplina.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
	}

}
