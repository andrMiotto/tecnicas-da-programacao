package br.com.appTV;
import br.com.service.*;
import br.com.model.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ServiceTv gerenciador = new ServiceTv();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Tv novaTV = new Tv();
				novaTV.preencher(input);
				gerenciador.adicionar(novaTV);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice da TV a remover: ");
				gerenciador.remover(indice);
				break;
			case 0:
				System.out.println("Encerrando o programa.");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);

		input.close();
	}

	private static void mostrarMenu() {
		System.out.println("\nMENU:");
		System.out.println("1 - Adicionar TV");
		System.out.println("2 - Listar TVs");
		System.out.println("3 - Remover TV");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
