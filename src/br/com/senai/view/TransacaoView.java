package br.com.senai.view;

import br.com.senai.utilitarios.Util;

public class TransacaoView {

	public String exibirMenuTransacao() {
		Util.limpar();
		Util.escreva("Menu Transa��o");
		Util.escreva("-----------------");
		Util.escreva("1. Registrar Transa��o");
		Util.escreva("2. Listar Transa��es");
		Util.escreva("3. Listar Transa��es por CPF");
		Util.escreva("4. Listar Transa��es por Conta");
		Util.escreva("5. Listar Transa��es por Ag�ncia");
		Util.escreva("6. Listar Transa��es por Data");
		Util.escreva("0. Voltar");
		Util.escreva("");
		Util.escreva("Informe a op��o desejada: ");
		return Util.leia();
	}
}
