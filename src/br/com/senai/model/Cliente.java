package br.com.senai.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String visualizarCliente() {
		return this.nome + " - " + this.cpf;
	}
	
	public String getPrimeroNome() {
		return this.nome.substring(0, this.nome.indexOf(" "));
	}
	
	public String getUltimoNome() {
		String[] array = this.nome.split(" ");
		return array[array.length - 1];
	}
	
}
