package br.com.senai.model;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String cpf;
	private Conta conta;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getPrimeroNome() {
		if(this.nome.contains(" ")) {
			return this.nome.substring(0, this.nome.indexOf(" "));
		}
		return this.nome;
	}
	
	public String getUltimoNome() {
		String[] array = this.nome.split(" ");
		return array[array.length - 1];
	}
	
}
