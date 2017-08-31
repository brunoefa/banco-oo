package br.com.senai.controller;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.model.dao.ClienteDao;
import br.com.senai.utilitarios.Util;
import br.com.senai.view.ClienteView;

public class ClienteController {

	private ClienteView cv;
	private ClienteDao dao;
	
	public ClienteController() {
		cv = new ClienteView();
		dao = new ClienteDao();
	}
	
	public void iniciar() {
		String opcao = cv.exibirMenuCliente();
		if (opcao.equals("1")) {
			cadastrarCliente();
		} else if (opcao.equals("2")) {
			listarClientes();
		} else if (opcao.equals("3")) {
			buscarPorCpf();
		} else if (opcao.equals("4")) {
			excluirCliente();
		} else if (opcao.equals("5")) {
			alterarCliente();
		}
	}
	
	public void cadastrarCliente() {
		Cliente cliente = cv.capturarCliente();
		dao.salvar(cliente);
		Util.continuar("Cliente cadastrado com sucesso!");
	}
	
	public void listarClientes() {
		ArrayList<Cliente> listaClientes = dao.buscarTodos();
		cv.listarClientes(listaClientes);
	}
	
	public Cliente buscarPorCpf() {
		Cliente clienteEncontrado = null;
		String cpf = cv.capturarCpf();
		clienteEncontrado = dao.buscarPorCpf(cpf);
		if (clienteEncontrado != null) {
			mostrarCliente(clienteEncontrado);
		}else{
			Util.continuar("Nenhum cliente foi encontrado");
		}
		return clienteEncontrado;
	}
	
	public void mostrarCliente(Cliente c) {
		cv.mostrarCliente(c);
	}
		
	public void alterarCliente() {
		Cliente cliente = buscarPorCpf();
		if (cliente != null) {
			cliente.setNome(cv.capturarNome());
			dao.atualizar(cliente);
			Util.continuar("Cliente alterado com sucesso");
		}
	}
	
	public void excluirCliente() {
		Cliente cliente = buscarPorCpf();
		dao.excluir(cliente);
		Util.continuar("Cliente removido com sucesso");
	}
}
