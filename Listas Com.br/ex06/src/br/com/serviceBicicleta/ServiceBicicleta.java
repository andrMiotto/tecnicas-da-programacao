package br.com.serviceBicicleta;

import java.util.ArrayList;
import java.util.List;

import br.com.model.Bicicleta;

public class ServiceBicicleta {

    private List<Bicicleta> lista;

    public ServiceBicicleta() {
        lista = new ArrayList<>();
    }

    public void adicionar(Bicicleta bicicleta) {
        lista.add(bicicleta);
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
