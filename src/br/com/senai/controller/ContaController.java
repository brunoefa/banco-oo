package br.com.senai.controller;

import br.com.senai.view.ContaView;

public class ContaController {

	private ContaView cv;
	
	public ContaController() {
		cv = new ContaView();
	}
	
	public void iniciar() {
		cv.exibirMenuConta();
	}
}
