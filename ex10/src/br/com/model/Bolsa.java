package br.com.model;

import java.util.Scanner;

public class Bolsa {

    private String codigo;
    private String empresa;
    private double valorAtual;

    public void preencher(Scanner scanner) {
        System.out.print("Código da ação: ");
        this.codigo = scanner.nextLine();

        System.out.print("Empresa: ");
        this.empresa = scanner.nextLine();

        System.out.print("Valor atual (R$): ");
        this.valorAtual = scanner.nextDouble();
        scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Código: " + codigo);
        System.out.println("Empresa: " + empresa);
        System.out.println("Valor atual: R$ " + valorAtual);
        System.out.println("--------------------------");
    }
}