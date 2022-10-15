package cursojava.excecao;

public class ExcecaoProcessaNota extends Exception{

	public ExcecaoProcessaNota(String erro) {
		super("Vixe um erro no processamento do arquivo ao processar as notas " + erro);
	}
}
