package br.com.model;

import java.util.Scanner;

public class Jogo {

    private String nome;
    private String genero;
    private String plataforma;

    public void preencher(Scanner scanner) {
        System.out.print("Nome do jogo: ");
        this.nome = scanner.nextLine();

        System.out.print("Gênero: ");
        this.genero = scanner.nextLine();

        System.out.print("Plataforma: ");
        this.plataforma = scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("--------------------------");
    }
}
