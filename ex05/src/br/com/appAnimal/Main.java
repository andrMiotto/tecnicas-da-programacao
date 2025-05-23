package br.com.appAnimal;

import br.com.service.ServiceAnimal;
import br.com.model.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ServiceAnimal gerenciador = new ServiceAnimal();

        int opcao;

        do {
            mostrarMenu();
            opcao = opcaoMenu(input, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    Animal novoAnimal = new Animal();
                    novoAnimal.preencher(input);
                    gerenciador.adicionar(novoAnimal);
                    break;
                case 2:
                    gerenciador.listar();
                    break;
                case 3:
                    int indice = opcaoMenu(input, "Digite o índice do animal a remover: ");
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
        System.out.println("1 - Adicionar Animal de Estimação");
        System.out.println("2 - Listar Animais de Estimação");
        System.out.println("3 - Remover Animal de Estimação");
        System.out.println("0 - Sair");
    }

    private static int opcaoMenu(Scanner input, String mensagem) {
        System.out.print(mensagem);
        int valor = input.nextInt();
        input.nextLine();
        return valor;
    }
}