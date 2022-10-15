package cursojava.executavel;

public class ArrayVetor {
	
	public static void main(String[] argumentos) {
		
		//Exite vários tipos de Array
		int[] inteiros = new int[10];
		float[] floats = new float[10];
		
		
		
		/*maneiras de atribuir valores ao Array*/
		
						  // 0    1    2    3
		double[] valores = {9.5, 8.5, 6.8, 100};
		
		//Para passar vários tipos de dados para um Array a gente usa um arry de string
		
		String[] valores1 = new String[4];
		
		valores1[0] = "Janitor";
		valores1[1] = "90";
		valores1[2] = "Curso Java";
		valores1[3] = "janitorcacule@hotmail.com";
		
		//Outra forma é passar diretamente
		String[] valores2 = {"Janitor", "90", "Curso Java", "janitorcacule@hotmail.com"};
		
		
		for(int pos = 0; pos < valores2.length; pos++) {
			System.out.println("Valor na posição "+ pos + " é igual = "  + valores2[pos]);
		}
		
	}

}
