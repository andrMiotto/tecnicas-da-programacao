package br.com.model;

import java.util.Scanner;

public class Aluno {
    private String nome;
    private int idade;
    private String curso;

    public void preencher(Scanner scanner) {
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Idade: ");
        this.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Curso: ");
        this.curso = scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("--------------------------");
    }
} 