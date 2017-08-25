package br.com.senai.model;

import java.util.ArrayList;

public class Conta {
	
	private String agencia;
	private String numero;
	private Cliente cliente;
	private ArrayList<Transacao> listaTransacao;
	
	public Conta(String agencia, String numero, Cliente cliente) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.listaTransacao = new ArrayList<Transacao>();
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public ArrayList<Transacao> getListaTransacao() {
		return listaTransacao;
	}
	public void setListaTransacao(ArrayList<Transacao> listaTransacao) {
		this.listaTransacao = listaTransacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setTransacao(Transacao transacao) {
		this.listaTransacao.add(transacao);
	}
	
	public String visualizarConta() {
		return "Ag: " + this.agencia + " - Conta: " + this.numero;
	}
	
	public ArrayList<Transacao> consultarExtrato() {
		return this.listaTransacao;
	}
	
	public Double getSaldo() {
		double saldo = 0;
		for (Transacao transacao : listaTransacao) {
			saldo += transacao.getValor(); 
		}
		return saldo;
	}

}
