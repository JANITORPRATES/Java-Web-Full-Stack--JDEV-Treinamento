package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] argumentos) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Janio");
		aluno.setNomeEscola("Jdev - treinamentos");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Geraldo");
		diretor.setRegistroGeral("12365544");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Egidio");
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("1236655");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
	}
}
