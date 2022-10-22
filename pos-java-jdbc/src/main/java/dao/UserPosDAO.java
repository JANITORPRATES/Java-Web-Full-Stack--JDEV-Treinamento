package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.SingleConnection;
import model.UserPosJava;

public class UserPosDAO {

	private Connection connection;
	
	public UserPosDAO() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(UserPosJava objetoUserPosJava) {
		String sql = "INSERT INTO userposjava (id, nome, email) VALUES (?, ?, ?)";
		try {
			PreparedStatement crud_C = connection.prepareStatement(sql);
			crud_C.setLong(1, 3);
			crud_C.setString(2, "Palloma Guimarães");
			crud_C.setString(3, "palloma.cle@hotmail.com");
			crud_C.execute();
			connection.commit();// Salva no banco de dados
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
