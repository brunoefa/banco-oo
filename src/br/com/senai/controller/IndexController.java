package br.com.senai.controller;

import br.com.senai.utilitarios.Util;
import br.com.senai.view.MenuView;

public class IndexController {

	public static void main(String[] args) {
		String opcao = "";
		while (!opcao.equals("0")) {
			MenuView m = new MenuView();
			opcao = m.exibirMenuPrincipal();
			
			if (opcao.equals("1") ) {
				new ClienteController(); 
			} else {
				encerrarPrograma();
			}
		}
	}
	
	private static void encerrarPrograma() {
		Util.limpar();
		Util.escreva("Programa encerrado.");
	}

}
