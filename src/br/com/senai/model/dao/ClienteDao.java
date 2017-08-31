package br.com.senai.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.utilitarios.Util;

public class ClienteDao {

	private Connection connection;
	
	public ClienteDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void salvar(Cliente cliente) {
		String sql = "INSERT INTO CLIENTE (nome, cpf) VALUES (?,?);";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			Util.escrevaErro(e.getMessage());
			throw new RuntimeException();
		}		
	}
	
	public void excluir(Cliente cliente) {
		String sql = "DELETE FROM cliente WHERE id = ?;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, String.valueOf(cliente.getId()));
			ps.execute();
			ps.close();
		} catch (Exception e) {
			Util.escrevaErro(e.getMessage());
			throw new RuntimeException();
		}	
	}
	
	public void atualizar(Cliente cliente) {
		String sql = "UPDATE CLIENTE set nome = ? WHERE id = ?;";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, String.valueOf(cliente.getId()));
			ps.execute();
			ps.close();
		} catch (Exception e) {
			Util.escrevaErro(e.getMessage());
			throw new RuntimeException();
		}	
	}
	
	public ArrayList<Cliente> buscarTodos() {
		String sql = "SELECT * FROM cliente";
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Cliente c = new Cliente();
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				listaClientes.add(c);
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		return listaClientes;
	}

	public Cliente buscarPorCpf(String cpf) {
		String sql = "SELECT * FROM cliente WHERE cpf = ? LIMIT 1";
		Cliente c = new Cliente();
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, cpf);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setId(rs.getInt("id"));
				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
			}
			ps.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			throw new RuntimeException();
		}
		return c;
	}
	
}
