package br.com.senai.controller;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;
import br.com.senai.model.dao.ClienteDao;
import br.com.senai.utilitarios.Util;
import br.com.senai.view.ClienteView;

public class ClienteController {

	public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
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
			buscarCliente();
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
	
	public Cliente buscarCliente() {
		Cliente clienteEncontrado = null;
		String cpf = cv.capturarCpf();
		for (Cliente cliente : listaClientes) {
			if (cliente.getCpf().equals(cpf)) {
				clienteEncontrado = cliente;
				mostrarCliente(cliente);
				break;
			}
		}
		if (clienteEncontrado == null) {
			Util.continuar("Nenhum cliente foi encontrado");
		}
		return clienteEncontrado;
	}
	
	public void mostrarCliente(Cliente c) {
		cv.mostrarCliente(c);
	}
		
	public void alterarCliente() {
		Cliente cliente = buscarCliente();
		if (cliente != null) {
			cliente.setNome(cv.capturarNome());
			Util.continuar("Cliente alterado com sucesso");
		}
	}
	
	public void excluirCliente() {
		Cliente cliente = buscarCliente();
		if (cliente != null) {
			listaClientes.remove(cliente);
			Util.continuar("Cliente removido com sucesso");
		}
	}
	
	public static ArrayList<Conta> gerarListaContas() {
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		for (Cliente c : listaClientes) {
			listaContas.add(c.getConta());
		}
		return listaContas;
	}
}
