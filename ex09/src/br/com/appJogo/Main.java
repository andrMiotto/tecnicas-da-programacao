package br.com.appJogo;

import java.util.Scanner;

import br.com.model.Jogo;
import br.com.service.ServiceJogo;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ServiceJogo gerenciador = new ServiceJogo();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Jogo novoJogo = new Jogo();
				novoJogo.preencher(input);
				gerenciador.adicionar(novoJogo);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice do jogo a remover: ");
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
		System.out.println("1 - Adicionar jogo");
		System.out.println("2 - Listar jogos");
		System.out.println("3 - Remover jogo");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
