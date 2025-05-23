package br.com.model;
import java.util.Scanner;

public class Tv {
	
	private String marca;
	private int polegadas;
	private boolean smart;

	   public void preencher(Scanner scanner) {
	      System.out.print("Marca: ");
	      this.marca = scanner.nextLine();

	      System.out.print("Polegadas: ");
	      this.polegadas = scanner.nextInt();

	      System.out.print("É Smart TV? (true/false): ");
	      this.smart = scanner.nextBoolean();
	      scanner.nextLine();
	    }

	    public void imprimir(int indice) {
	        System.out.println("[" + indice + "]");
	        System.out.println("Marca: " + marca);
	        System.out.println("Polegadas: " + polegadas + "\"");
	        System.out.println("Smart TV: " + (smart ? "Sim" : "Não"));
	        System.out.println("--------------------------");
	    }
	}


