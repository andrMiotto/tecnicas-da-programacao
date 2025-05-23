package br.com.model;

import java.util.Scanner;

public class Bicicleta {

    private String marca;
    private String tipo;
    private int marchas;

    public void preencher(Scanner scanner) {
        System.out.print("Marca: ");
        this.marca = scanner.nextLine();

        System.out.print("Tipo (urbana, mountain bike, etc.): ");
        this.tipo = scanner.nextLine();

        System.out.print("Quantidade de marchas: ");
        this.marchas = scanner.nextInt();
        scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marchas: " + marchas);
        System.out.println("--------------------------");
    }
}
