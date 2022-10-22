package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
				connection.rollback();//reverte a operação
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	public List<UserPosJava> listar() throws SQLException{
		List<UserPosJava> lista = new ArrayList<UserPosJava>();
		
		String sql = "SELECT * FROM userposjava;";
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet crud_R = statement.executeQuery();
		
		while(crud_R.next()) {
			UserPosJava userposjava = new UserPosJava();
			userposjava.setId(crud_R.getLong("id"));
			userposjava.setNome(crud_R.getString("nome"));
			userposjava.setEmail(crud_R.getString("email"));
			lista.add(userposjava);
		}
		
		return lista;
		
	}
}//Fim da classe
