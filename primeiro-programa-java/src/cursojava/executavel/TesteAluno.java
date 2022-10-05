package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class TesteAluno {
	
	/*Main � um m�todo auto execut�vel em Java*/
	public static void main(String[] parametros) {
		
		/*String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual � o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da m�e?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula");
		String serie = JOptionPane.showInputDialog("Qual a serie");
		String escola = JOptionPane.showInputDialog("Nome da escola");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");
		
		
		Aluno aluno1;//Objeto ainda n�o existe na mem�ria
		aluno1 = new Aluno(); //agora passa a existir na mem�ria
		
		//new Aluno() � uma inst�ncia (cria��o do Objeto)
		 // aluno1 � uma refer�ncia para o objeto Aluno
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeEscola(escola);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println(aluno1.toString());
		System.out.println(aluno1);//Internamente chama o metodo toString()
		System.out.println("M�dia do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/
		
		//Equals e hashcode (Diferenciar e comparar objetos)
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("J�nitor");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("J�nitor");
		
		//Na vida real aluno1 e aluno2 s�o exatamente o mesmo aluno
		//No java aluno1 e aluno2 s�o 2 objetos diferentes
		/*Se a gente quiser que no nosso c�digo que a regra de neg�cio desse sistema
		 * que esses dois objetos devem ser considerados iguais, a gente tem que 
		 * sobrescrever os met�dos Equals hascode */
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		}else {
			System.out.println("Alunos n�o s�o iguais");
		}
	}

}
