package br.com.model;

import java.util.Scanner;

public class Musica {

	private String titulo;
	private String artista;
	private int duracao; // em segundos

	public void preencher(Scanner scanner) {
		System.out.print("Título da música: ");
		this.titulo = scanner.nextLine();

		System.out.print("Artista: ");
		this.artista = scanner.nextLine();

		System.out.print("Duração (em segundos): ");
		this.duracao = scanner.nextInt();
		scanner.nextLine();
	}

	public void imprimir(int indice) {
		System.out.println("[" + indice + "]");
		System.out.println("Título: " + titulo);
		System.out.println("Artista: " + artista);
		System.out.println("Duração: " + duracao + " segundos");
		System.out.println("--------------------------");
	}
}
