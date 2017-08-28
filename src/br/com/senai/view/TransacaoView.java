package br.com.senai.view;

import br.com.senai.utilitarios.Util;

public class TransacaoView {

	public String exibirMenuTransacao() {
		Util.limpar();
		Util.escreva("Menu Transação");
		Util.escreva("-----------------");
		Util.escreva("1. Registrar Transação");
		Util.escreva("2. Listar Transações");
		Util.escreva("3. Listar Transações por CPF");
		Util.escreva("4. Listar Transações por Conta");
		Util.escreva("5. Listar Transações por Agência");
		Util.escreva("6. Listar Transações por Data");
		Util.escreva("0. Voltar");
		Util.escreva("");
		Util.escreva("Informe a opção desejada: ");
		return Util.leia();
	}
}
