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
														//posição   1 , 2 
		String sql = "INSERT INTO userposjava (nome, email) VALUES (?, ?)";
		try {
			PreparedStatement crud_C = connection.prepareStatement(sql);
			crud_C.setString(1, objetoUserPosJava.getNome());//substitui o ? na posição 1
			crud_C.setString(2, objetoUserPosJava.getEmail());//substitui o ? na posição 2
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
	
	public UserPosJava buscar(Long id) throws SQLException{
		UserPosJava retorno = new UserPosJava();
		
		String sql = "SELECT * FROM userposjava WHERE id = " + id;
		
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet crud_R = statement.executeQuery();
		
		while(crud_R.next()) {//retorna apenas um ou  nenhum
			retorno.setId(crud_R.getLong("id"));
			retorno.setNome(crud_R.getString("nome"));
			retorno.setEmail(crud_R.getString("email"));
		}
		
		return retorno;
	}
	
	public void atualizar (UserPosJava userposjava) {
													
		String sql = "UPDATE userposjava SET nome = ? WHERE id = " + userposjava.getId();
		
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, userposjava.getNome());
			
			statement.execute();
			connection.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}//Fim atualizar()
	
	
	public void deletar(Long id) {
		String sql = "DELETE FROM userposjava WHERE id = " + id;
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			connection.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}//Fim da classe
