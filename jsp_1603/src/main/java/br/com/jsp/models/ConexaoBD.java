package br.com.jsp.models;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Component;



@Component
public class ConexaoBD {
	private final String CONNECTION_STRING = "jdbc:mysql://localhost/lojajdbc?user=root&password=root";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException |
				 IllegalAccessException |
				 ClassNotFoundException e) {
			throw new RuntimeErrorException(null, "Não foi possivel carregar o driver MySQL" + 
				 e.getMessage());
		}
	}
	
	public Connection obterConexao () {
		try {
			return DriverManager.getConnection(CONNECTION_STRING);
		} catch (Exception e){
			throw new RuntimeException("Não foi possivel obter a conexão com o banco de dados" + 
					e.getMessage());
		}
	}
}
