package br.com.senai.model;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ModelUtil {
	
	public static ArrayList<Cliente> popularBase() {
		ArrayList<Cliente> lc = new ArrayList<>();
		Cliente cl;
		Conta co;
		Transacao tr;
		for (int i = 0; i < 10; i++) {
			cl = new Cliente("Cliente Exemplo " + i, String.valueOf(ThreadLocalRandom.current().nextInt(99, 199 + 1)));
			String conta = String.valueOf(ThreadLocalRandom.current().nextInt(9999, 11000 + 1));
			if (i % 2 == 0) {
				co = new Conta("9999",conta, cl);
			} else {
				co = new Conta("5555", conta, cl);
			}
			for (int j = 0; j < 30; j++) {
				Double valor = ThreadLocalRandom.current().nextDouble(-500.0, 500.0 + 1);
				tr = new Transacao(valor, "Transacao nº " + j+1, co);
				co.setTransacao(tr);
			}
			cl.setConta(co);
			lc.add(cl);
		}
		return lc;
	}
}
