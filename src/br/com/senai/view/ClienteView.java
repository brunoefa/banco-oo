package br.com.senai.view;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.utilitarios.Util;

public class ClienteView {

	public Cliente capturarCliente() {
		Util.limpar();
		Util.escreva("Cadastro de cliente");
		Util.escreva("-----------------");
		Util.escreva("");

		Util.escreva("Nome:");
		String nome = Util.leia();
		Util.escreva("CPF:");
		String cpf = Util.leia();

		return new Cliente(nome, cpf);
	}

	public void mostrarCliente(Cliente c) {
		Util.limpar();
		Util.escreva("Visualizar Cliente");
		Util.escreva("-----------------");
		Util.escreva("");
		Util.escreva("Nome:" + c.getNome());
		Util.escreva("CPF:" + c.getCpf());
		Util.continuar();
	}

	public String exibirMenuCliente() {
		Util.limpar();
		Util.escreva("Menu Clientes");
		Util.escreva("-----------------");
		Util.escreva("1. Cadastrar Cliente");
		Util.escreva("2. Listar Clientes");
		Util.escreva("3. Buscar Cliente");
		Util.escreva("4. Excluir Cliente");
		Util.escreva("5. Alterar Cliente");
		Util.escreva("6. Consultar saldo");
		Util.escreva("7. Gerar extrato");
		Util.escreva("0. Voltar");
		Util.escreva("");
		Util.escreva("Informe a opção desejada: ");
		return Util.leia();
	}

	public void listarClientes(ArrayList<Cliente> listaClientes) {
		Util.limpar();
		Util.escreva("Listar Clientes");
		Util.escreva("-----------------");
		for (Cliente cliente : listaClientes) {
			Util.escreva(cliente.getCpf() + " - " + cliente.getNome());
		}
		Util.escreva("");
		Util.continuar(listaClientes.size() + " cliente(s) encontrado(s)");
	}

	public String capturarCpf() {
		Util.limpar();
		Util.escreva("Buscar Cliente");
		Util.escreva("-----------------");
		Util.escreva("Informe o CPF");
		return Util.leia();
	}

	public String capturarNome() {
		Util.limpar();
		Util.escreva("Alterar Cliente");
		Util.escreva("-----------------");
		Util.escreva("Informe o novo nome");
		return Util.leia();
	}

}
