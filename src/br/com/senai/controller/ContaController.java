package br.com.senai.controller;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;
import br.com.senai.model.Transacao;
import br.com.senai.utilitarios.Util;
import br.com.senai.view.ClienteView;
import br.com.senai.view.ContaView;

public class ContaController {
	
	public static ArrayList<Conta> listaContas = new ArrayList<Conta>();
	ClienteController clienteController;
	private ContaView contaView;
	ClienteView clienteView;
	
	public ContaController() {
		if (listaContas.size() == 0) {
//			listaContas = ClienteController.gerarListaContas();
		}
		contaView = new ContaView();
		clienteView = new ClienteView();
		clienteController = new ClienteController();
	}
	
	public void iniciar() {
		String opcao = contaView.exibirMenuConta();
		if (opcao.equals("1")) {
			cadastrarConta();
		} else if (opcao.equals("2")) {
			listarContas();
		} else if (opcao.equals("3")) {
			listarContas();
		} else if (opcao.equals("4")) {
			buscarConta();
		} else if (opcao.equals("5")) {
			buscarConta();
		} else if (opcao.equals("6")) {
			excluirConta();
		} else if (opcao.equals("7")) {
			alterarConta();
		}
	}
	
	public void cadastrarConta() {
		Cliente cliente = clienteController.buscarPorCpf();
		if (cliente != null) {
			Conta conta = contaView.capturarConta(cliente);
			listaContas.add(conta);
			Util.continuar("Conta cadastrada com sucesso!");
		}
	}
	
	public void listarContas() {
		contaView.listarContas(listaContas);
	}
	
	public Conta buscarConta() {
		Conta contaEncontrada = null;
		String cpf = clienteView.capturarCpf();
		for (Conta conta : listaContas) {
			if (conta.getCliente().getCpf().equals(cpf)) {
				contaEncontrada = conta;
				mostrarConta(conta);
				break;
			}
		}
		if (contaEncontrada == null) {
			Util.continuar("Nenhuma conta foi encontrada");
		}
		return contaEncontrada;
	}
	
	public void mostrarConta(Conta c) {
		contaView.mostrarConta(c);
	}
		
	public void alterarConta() {
		Conta conta = buscarConta();
		if (conta != null) {
			Conta novaConta = contaView.capturarConta(conta.getCliente());
			conta.setNumero(novaConta.getNumero());
			conta.setAgencia(novaConta.getAgencia());
			Util.continuar("Conta alterada com sucesso");
		}
	}
	
	public void excluirConta() {
		Conta conta = buscarConta();
		if (conta != null) {
			listaContas.remove(conta);
			Util.continuar("Conta removida com sucesso");
		}
	}
	
	public static ArrayList<Transacao> gerarListaTransacoes() {
		ArrayList<Transacao> listaTransacoes = new ArrayList<Transacao>();
		for (Conta c : listaContas) {
			ArrayList<Transacao> listaTransacao = c.getListaTransacao();
			for (Transacao transacao : listaTransacao) {
				listaTransacoes.add(transacao);
			}
		}
		return listaTransacoes;
	}
}
