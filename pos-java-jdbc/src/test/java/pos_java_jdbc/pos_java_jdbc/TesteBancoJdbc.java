package pos_java_jdbc.pos_java_jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

//import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.UserPosJava;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		//SingleConnection.getConnection();
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava userposjava = new UserPosJava();
		
		userposjava.setId(4L);
		userposjava.setNome("Tadeu Prates");
		userposjava.setEmail("tadeu@gmail.com");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			List<UserPosJava> lista = dao.listar();
			
			for (UserPosJava userposjava : lista) {
				System.out.println(userposjava);
				System.out.println("--------------------------------");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initBuscar() {
		UserPosDAO dao = new UserPosDAO();
		
		try {
			UserPosJava userposjava = dao.buscar(3L);
			System.out.println(userposjava);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
