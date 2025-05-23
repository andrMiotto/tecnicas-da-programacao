package br.com.appFilme;

import br.com.service.ServiceFilme;
import br.com.model.Filme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ServiceFilme gerenciador = new ServiceFilme();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Filme novoFilme = new Filme();
				novoFilme.preencher(input);
				gerenciador.adicionar(novoFilme);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice do filme a remover: ");
				gerenciador.remover(indice);
				break;
			case 0:
				System.out.println("sEncerrando o programa.");
				break;
			default:
				System.out.println("Opção inválida.");
			}

		} while (opcao != 0);

		input.close();
	}

	private static void mostrarMenu() {
		System.out.println("\nMENU:");
		System.out.println("1 - Adicionar Filme");
		System.out.println("2 - Listar Filmes");
		System.out.println("3 - Remover Filme");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}