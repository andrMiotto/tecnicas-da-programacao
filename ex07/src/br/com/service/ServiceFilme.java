package br.com.service;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Filme;

public class ServiceFilme {

    private List<Filme> lista;

    public ServiceFilme() {
        lista = new ArrayList<>();
    }

    public void adicionar(Filme filme) {
        lista.add(filme);
    }

    public void listar() {
		if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).imprimir(i);
        }
    }

    public void remover(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
            System.out.println("Item removido com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
