package br.com.model;

import java.util.Scanner;

public class Animal {
    private String nome;
    private String tipo;
    private int idade;

    public void preencher(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Tipo (ex: cachorro, gato): ");
        this.tipo = scanner.nextLine();

        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("--------------------------");
    }
}
