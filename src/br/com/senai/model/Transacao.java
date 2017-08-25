package br.com.senai.model;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Transacao {
	
	private double valor;
	private Date data;
	private String descricao;
	
	public Transacao(double valor, String descricao) {
		this.valor = valor;
		this.descricao = descricao;
		this.data = new Date(System.currentTimeMillis());
	}
	
	public double getValor() {
		return valor;
	}
	
	public Date getData() {
		return data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDataFormatada() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyy hh:mm:ss");
		return df.format(this.data);
	}
	
	public String getValorFormatado() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		return df.format(this.valor);
	}
}
