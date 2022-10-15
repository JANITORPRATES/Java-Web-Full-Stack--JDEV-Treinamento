package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.8,8.7,5.6,9.8};
		
		/*Criação do aluno*/
		Aluno aluno = new Aluno();
		aluno.setNome("Jânitor");
		aluno.setNomeEscola("Jdev Treinamentos");
		
		//Criação da disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
		System.out.println("--------------- Disciplinas do aluno ----------------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("\nDisciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			double notaMax = 0.0;
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] < notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
			}
			System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + " é " + notaMax);
		}
	}

}
