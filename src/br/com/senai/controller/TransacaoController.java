package br.com.senai.controller;

import br.com.senai.view.TransacaoView;

public class TransacaoController {

	private TransacaoView tv;
	
	public TransacaoController() {
		tv = new TransacaoView();
		tv.exibirMenuTransacao();
	}
}
