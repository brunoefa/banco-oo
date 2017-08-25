package br.com.senai.principal;

import java.util.ArrayList;

import br.com.senai.model.Cliente;
import br.com.senai.model.Conta;
import br.com.senai.model.Transacao;

public class Principal {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Bruno Andrade", "087.099.878-47");
		Conta conta = new Conta("3598", "0034599", cliente);
		System.out.println(conta.getCliente().getPrimeroNome() + " " + conta.visualizarConta());
		
		Transacao t1 = new Transacao(100.00, "Deposito em conta");
		conta.setTransacao(t1);
		
		Transacao t2 = new Transacao(-50.00, "Saque caixa 24h");
		conta.setTransacao(t2);
		
		Transacao t3 = new Transacao(900.00, "Recebimento de Salário");
		conta.setTransacao(t3);
		
		Transacao t4 = new Transacao(-389.50, "Pagamento cartão NuBank");
		conta.setTransacao(t4);
		
		Transacao t5 = new Transacao(-10.90, "Almoço no Bolão");
		conta.setTransacao(t5);
		
		ArrayList<Transacao> transacoes = conta.consultarExtrato();
		for (Transacao transacao : transacoes) {
			System.out.println(transacao.getDataFormatada() + "\t" +
							   transacao.getValorFormatado() +  "\t" +
							   transacao.getDescricao());
		}
		
		System.out.println("Saldo: " + conta.getSaldo());
	
	}
	
	

}
