package br.com.appBolsa;

import java.util.Scanner;

import br.com.model.Bolsa;
import br.com.service.ServiceBolsa;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ServiceBolsa gerenciador = new ServiceBolsa();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Bolsa novaBolsa = new Bolsa();
				novaBolsa.preencher(input);
				gerenciador.adicionar(novaBolsa);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice da ação a remover: ");
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
		System.out.println("1 - Adicionar ação");
		System.out.println("2 - Listar ações");
		System.out.println("3 - Remover ação");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
