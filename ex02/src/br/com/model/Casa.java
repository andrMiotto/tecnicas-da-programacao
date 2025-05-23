package br.com.model;
import java.util.Scanner;

public class Casa {
    private String endereco;
    private int numeroQuartos;
    private boolean temGaragem;

    public void preencher(Scanner scanner) {
        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();

        System.out.print("Número de quartos: ");
        this.numeroQuartos = scanner.nextInt();

        System.out.print("Possui garagem? (true/false): ");
        this.temGaragem = scanner.nextBoolean();
        scanner.nextLine();
    }

    public void imprimir(int indice) {
        System.out.println("[" + indice + "]");
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de quartos: " + numeroQuartos);
        System.out.println("Garagem: " + (temGaragem ? "Sim" : "Não"));
        System.out.println("--------------------------");
    }
}