package br.com.senai.controller;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.utilitarios.Util;
import br.com.senai.view.ClienteView;

public class ClienteController {

	private static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	private ClienteView cv;
	
	public ClienteController() {
		cv = new ClienteView();
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
		listaClientes.add(cliente);
		Util.continuar("Cliente cadastrado com sucesso!");
	}
	
	public void listarClientes() {
		cv.listarClientes(listaClientes);
		Util.continuar();
	}
	
	public void buscarCliente() {
		Util.continuar("Implementar...");
	}
	
	public void mostrarCliente() {
		Util.continuar("Implementar...");
	}
	
	public void alterarCliente() {
		Util.continuar("Implementar...");
	}
	
	public void excluirCliente() {
		Util.continuar("Implementar...");
	}
}
