package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] argumentos) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Janio - Aluno");
		aluno.setNomeEscola("Jdev - treinamentos");
		aluno.setIdade(16);
		
		Diretor diretor = new Diretor();
		diretor.setNome("Geraldo - Diretor");
		diretor.setRegistroGeral("12365544");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setNome("Egidio - Secretario");
		secretario.setExperiencia("Administra��o");
		secretario.setNumeroCpf("1236655");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario Aluno � : " + aluno.salario());
		System.out.println("Salario Diretor � : " + diretor.salario());
		System.out.println("Salario Secretario � : " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa � demais = " + pessoa.getNome()
		+ " e o sal�rio � de = " + pessoa.salario());
	}
}
