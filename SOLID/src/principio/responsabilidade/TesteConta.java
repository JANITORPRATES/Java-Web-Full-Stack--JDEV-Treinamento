package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		
		/*tudo que eu preciso está dentro do objeto bancaria não precisa de informações
		 * externas mas se por exemplo precisasse gerar um relatório aí neste caso teria
		 * que criar outra classe com outra responsabilidade.
		 * Exemplo: enviar SMS não é função da ContaBancaria teria que fazer via serviço
		 * externo.
		 * Resumindo se tudo que precisa está dentro do objeto então tem que fazer o metódo dentro
		 * dele desde que a responsabilidade seja condizente com o objeto*/
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Jânitor");
		
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
