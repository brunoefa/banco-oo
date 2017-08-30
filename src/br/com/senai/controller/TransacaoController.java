package br.com.senai.controller;

import java.util.ArrayList;

import br.com.senai.model.Transacao;
import br.com.senai.view.TransacaoView;

public class TransacaoController {

	public static ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
	private TransacaoView tv;
	
	public TransacaoController() {
		if (listaTransacoes.size() == 0) {
			listaTransacoes = ContaController.gerarListaTransacoes();
		}
		tv = new TransacaoView();
	}
	
	public void iniciar() {
		tv.exibirMenuTransacao();
	}
}
