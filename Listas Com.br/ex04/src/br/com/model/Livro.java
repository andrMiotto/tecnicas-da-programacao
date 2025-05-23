package br.com.model;

import java.util.Scanner;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;

	public void preencher(Scanner scanner) {
		System.out.print("Título: ");
		this.titulo = scanner.nextLine();

		System.out.print("Autor: ");
		this.autor = scanner.nextLine();

		System.out.print("Ano de Publicação: ");
		this.anoPublicacao = scanner.nextInt();
		scanner.nextLine();
	}

	public void imprimir(int indice) {
		System.out.println("[" + indice + "]");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de Publicação: " + anoPublicacao);
		System.out.println("--------------------------");
	}
}