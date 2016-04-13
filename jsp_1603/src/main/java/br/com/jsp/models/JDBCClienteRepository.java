package br.com.jsp.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;




@Primary
@Repository
public class JDBCClienteRepository implements ClienteRepository {
	
	@Autowired
	private ConexaoBD conexaoBD;

	@Override
	public void inserir(Cliente cliente) {
		Connection con;
		con = conexaoBD.obterConexao();
		
		String sql = "INSERT INTO clientes " +
					 "(nome,cpf,dataNascimento,sexo,senha,ofertas)" +
					 "VALUES (?,?,?,?,PASSWORD(?),?)";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setLong(2, cliente.getCpf());
			ps.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getSenha());
			ps.setBoolean(6, cliente.getReceberOfertaPorEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException("Ocorreu um erro ao inserir o cliente: "+
					e.getMessage());
		}

	}

}
