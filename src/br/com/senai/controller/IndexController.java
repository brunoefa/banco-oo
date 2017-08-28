package br.com.senai.controller;

import br.com.senai.utilitarios.Util;
import br.com.senai.view.IndexView;

public class IndexController {

	public static void main(String[] args) {
		String opcao = "";
		while (!opcao.equals("0")) {
			IndexView m = new IndexView();
			opcao = m.exibirMenuPrincipal();
			
			if (opcao.equals("1") ) {
				new ClienteController().iniciar(); 
			} else if (opcao.equals("2") ) {
				new ContaController().iniciar();
			} else if (opcao.equals("3") ) {
				new TransacaoController().iniciar(); 
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
