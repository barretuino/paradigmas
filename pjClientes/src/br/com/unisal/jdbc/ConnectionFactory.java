package br.com.unisal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe de Conexão com o Banco de Dados
 * @author Prof. Paulo Barreto
 * @date 19/10/2013
 */
public class ConnectionFactory {
	public static Connection getConnection() 
						throws SQLException{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			return
				DriverManager.getConnection(
					"jdbc:mysql://localhost/unisal",
					"root","admin");
		}catch(ClassNotFoundException erro){
			throw new SQLException(erro.getMessage());
		}
	}
}
