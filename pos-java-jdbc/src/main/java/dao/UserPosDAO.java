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
			crud_C.setLong(1, objetoUserPosJava.getId());
			crud_C.setString(2, objetoUserPosJava.getNome());
			crud_C.setString(3, objetoUserPosJava.getEmail());
			crud_C.execute();
			connection.commit();// Salva no banco de dados
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
}
