package br.com.appAluno;

import br.com.service.ServiceAluno;
import br.com.model.Aluno;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ServiceAluno gerenciador = new ServiceAluno();

		int opcao;

		do {
			mostrarMenu();
			opcao = opcaoMenu(input, "Escolha uma opção: ");

			switch (opcao) {
			case 1:
				Aluno novoAluno = new Aluno();
				novoAluno.preencher(input);
				gerenciador.adicionar(novoAluno);
				break;
			case 2:
				gerenciador.listar();
				break;
			case 3:
				int indice = opcaoMenu(input, "Digite o índice do aluno a remover: ");
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
		System.out.println("1 - Adicionar Aluno");
		System.out.println("2 - Listar Alunos");
		System.out.println("3 - Remover Aluno");
		System.out.println("0 - Sair");
	}

	private static int opcaoMenu(Scanner input, String mensagem) {
		System.out.print(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
