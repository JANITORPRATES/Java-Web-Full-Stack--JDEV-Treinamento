package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5432/posjava";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static { //bloco de inicialização roda antes do construtor e só roda uma vez
		conectar();		
	}
	
	public SingleConnection() {
		conectar();
	}
	
	private static void conectar() {
		try {
			if(connection == null) {/*conexão é aberta uma vez e mantida, só abre uma vez 
									o que abre e fecha várias vezes é a sessão*/
				Class.forName("org.postgresql.Driver");//Carrega os drivers do postgresql
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);//não salva automaticamente depois na aplicação a gente decide quando efetivamente salva os isert's, deletes etc
				System.out.println("Conectou com sucesso");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
}
