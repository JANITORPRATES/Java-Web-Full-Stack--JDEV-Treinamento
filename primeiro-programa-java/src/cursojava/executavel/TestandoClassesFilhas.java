package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] argumentos) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Janio");
		aluno.setNomeEscola("Jdev - treinamentos");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Geraldo");
		diretor.setRegistroGeral("12365544");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Egidio");
		secretario.setExperiencia("Administração");
		secretario.setNumeroCpf("1236655");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario Aluno é : " + aluno.salario());
		System.out.println("Salario Diretor é : " + diretor.salario());
		System.out.println("Salario Secretario é : " + secretario.salario());
	}
}
