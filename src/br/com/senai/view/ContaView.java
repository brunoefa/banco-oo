package br.com.senai.view;

import br.com.senai.utilitarios.Util;

public class ContaView {

	public String exibirMenuConta() {
		Util.limpar();
		Util.escreva("Menu Conta");
		Util.escreva("-----------------");
		Util.escreva("1. Cadastrar Conta");
		Util.escreva("2. Listar Contas");
		Util.escreva("5. Listar Contas por Ag�ncia");
		Util.escreva("3. Buscar Conta por CPF");
		Util.escreva("3. Buscar Conta por N�mero");
		Util.escreva("5. Excluir Conta");
		Util.escreva("6. Alterar Conta");
		Util.escreva("0. Voltar");
		Util.escreva("");
		Util.escreva("Informe a op��o desejada: ");
		return Util.leia();
	}
}
