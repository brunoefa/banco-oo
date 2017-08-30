package br.com.senai.view;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;
import br.com.senai.utilitarios.Util;

public class ContaView {

	public String exibirMenuConta() {
		Util.limpar();
		Util.escreva("Menu Conta");
		Util.escreva("-----------------");
		Util.escreva("1. Cadastrar Conta");
		Util.escreva("2. Listar Contas");
		Util.escreva("3. Listar Contas por Agência");
		Util.escreva("4. Buscar Conta por CPF");
		Util.escreva("5. Buscar Conta por Número");
		Util.escreva("6. Excluir Conta");
		Util.escreva("7. Alterar Conta");
		Util.escreva("0. Voltar");
		Util.escreva("");
		Util.escreva("Informe a opção desejada: ");
		return Util.leia();
	}
	
	public Conta capturarConta(Cliente c) {
		Util.limpar();
		Util.escreva("Cadastro de Conta");
		Util.escreva("-----------------");
		Util.escreva("");

		Util.escreva("Número:");
		String numero = Util.leia();
		Util.escreva("Agencia:");
		String agencia = Util.leia();

		return new Conta(numero, agencia, c);
	}

	public void mostrarConta(Conta c) {
		Util.limpar();
		Util.escreva("Visualizar Conta");
		Util.escreva("-----------------");
		Util.escreva("");
		Util.escreva(c.getCliente().getNome() + " - " + c.getCliente().getCpf());
		Util.escreva("Agência:" + c.getAgencia());
		Util.escreva("Número:" + c.getNumero());
		Util.continuar();
	}

	public void listarContas(ArrayList<Conta> listaContas) {
		Util.limpar();
		Util.escreva("Listar Contas");
		Util.escreva("-----------------");
		for (Conta conta : listaContas) {
			Util.escreva(conta.getCliente().getCpf() + " - " + conta.getAgencia() + " - " + conta.getNumero());
		}
		Util.escreva("");
		Util.continuar(listaContas.size() + " conta(s) encontrada(s)");
	}

}
