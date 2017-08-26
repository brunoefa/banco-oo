package br.com.senai.utilitarios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {

	public static String leia() {
		String op = "";
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			op = br.readLine();
		} catch (Exception e) {
			escreva("Ocorreu um erro de leitura.");
		}
		return op;
	}

	// Utilizado como alternativa para testes console do Eclipse
	public static void limpar() {
		for (int i = 0; i < 50; ++i) System.out.println();
	}

	public static void escreva(String s) {
		System.out.println(s);
	}
	
	public static void continuar() {
		escreva("");
		escreva("Digite enter para continuar");
		leia();
	}
	
	public static void continuar(String s) {
		escreva(s);
		continuar();
	}
}
