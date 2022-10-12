package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		/*tudo que eu preciso est� dentro do objeto bancaria n�o precisa de informa��es
		 * externas mas se por exemplo precisasse gerar um relat�rio a� neste caso teria
		 * que criar outra classe com outra responsabilidade.
		 * Exemplo: enviar SMS n�o � fun��o da ContaBancaria teria que fazer via servi�o
		 * externo.
		 * Resumindo se tudo que precisa est� dentro do objeto ent�o tem que fazer o met�do dentro
		 * dele desde que a responsabilidade seja condizente com o objeto*/
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do J�nitor");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
	}

}
