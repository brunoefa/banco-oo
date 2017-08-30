package br.com.senai.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		
	}
	
	public void atualizar(Cliente cliente) {

	}
	
	public ArrayList<Cliente> buscarTodos() {
		return null;
	}
	
}
