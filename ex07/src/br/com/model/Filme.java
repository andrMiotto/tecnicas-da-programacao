package br.com.model;

import java.util.Scanner;

public class Filme {

	private String titulo;
	private String diretor;
	private int anoLancamento;

	public void preencher(Scanner scanner) {
		System.out.print("Título: ");
		this.titulo = scanner.nextLine();

		System.out.print("Diretor: ");
		this.diretor = scanner.nextLine();

		System.out.print("Ano de lançamento: ");
		this.anoLancamento = scanner.nextInt();
		scanner.nextLine();
	}

	public void imprimir(int indice) {
		System.out.println("[" + indice + "]");
		System.out.println("Título: " + titulo);
		System.out.println("Diretor: " + diretor);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("--------------------------");
	}
}
