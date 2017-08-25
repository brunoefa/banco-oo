package br.com.senai.view;

import br.com.senai.utilitarios.Util;

public class MenuView {

	public String exibirMenuPrincipal() {
		Util.limpar();
		System.out.println("Menu Principal");
		System.out.println("-----------------");
		System.out.println("1. Cliente");
		System.out.println("2. Conta");
		System.out.println("3. Transação");
		System.out.println("0. Sair");
		System.out.println("");
		System.out.println("Informe a opção desejada: ");
		return Util.leia();
	}
	
}
