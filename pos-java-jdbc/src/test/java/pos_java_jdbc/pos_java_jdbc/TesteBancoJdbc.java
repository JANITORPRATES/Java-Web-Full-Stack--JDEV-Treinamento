package pos_java_jdbc.pos_java_jdbc;

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
}
