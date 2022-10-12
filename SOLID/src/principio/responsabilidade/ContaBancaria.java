package principio.responsabilidade;

public class ContaBancaria {

	//o objeto tem que fazer o processamento dentro dele pr�prio desde que 
	//tudo ele precisa esteja dentro dele
	private String descricao;
	
	private double saldo = 8000;
	
	//como o saldo que � o que eu preciso est� disponivel aqui logo o met�do 
	//deve ser feito na pr�pria classe ContaBancaria
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
	
	
}
