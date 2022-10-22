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
		
		userPosDAO.salvar(userposjava);
	}
}
