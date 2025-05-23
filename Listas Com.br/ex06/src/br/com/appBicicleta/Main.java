package br.com.appBicicleta;

import br.com.serviceBicicleta.*;
import br.com.model.Bicicleta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ServiceBicicleta gerenciador = new ServiceBicicleta();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Bicicleta novaBicicleta = new Bicicleta();
				novaBicicleta.preencher(input);
				gerenciador.adicionar(novaBicicleta);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice da bicicleta a remover: ");
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
		System.out.println("1 - Adicionar Bicicleta");
		System.out.println("2 - Listar Bicicletas");
		System.out.println("3 - Remover Bicicleta");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}