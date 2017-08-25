package br.com.senai.view;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.utilitarios.Util;

public class ClienteView {

	public Cliente capturarCliente() {
		Util.limpar();
		Util.escreva("Cadastro de cliente");
		Util.escreva("");
		
		Util.escreva("Nome:");
		String nome = Util.leia();
		Util.escreva("CPF:");
		String cpf = Util.leia();
		
		Cliente c = new Cliente(nome, cpf);
		return c;
	}
	
	public void mostrarCliente(Cliente c) {
		Util.limpar();
		Util.escreva("Visualizar " + c.getPrimeroNome());
		Util.escreva("");
		Util.escreva("Nome: " + c.getNome());
		Util.escreva("CPF: " + c.getCpf());
		Util.continuar();
	}
	
	public String exibirMenuCliente() {
		Util.limpar();
		System.out.println("Menu Clientes");
		System.out.println("-----------------");
		System.out.println("1. Cadastrar Cliente");
		System.out.println("2. Listar Clientes");
		System.out.println("3. Buscar Cliente");
		System.out.println("4. Excluir Cliente");
		System.out.println("5. Alterar Cliente");
		System.out.println("0. Voltar");
		System.out.println("");
		System.out.println("Informe a opção desejada: ");
		return Util.leia();
	}

	public void listarClientes(ArrayList<Cliente> listaClientes) {
		Util.limpar();
		System.out.println("Listar Clientes");
		System.out.println("-----------------");		
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente.getCpf() + " - " + cliente.getNome());
		}
	}	
	
}
