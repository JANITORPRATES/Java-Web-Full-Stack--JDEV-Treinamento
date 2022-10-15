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
		disciplina2.setDisciplina("L�gica de programa��o");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("--------------- Disciplinas do aluno ----------------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("\nDisciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina s�o: ");
			
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " � igual = " + d.getNota()[pos]);
			}
		}
	}

}
