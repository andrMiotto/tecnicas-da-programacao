package br.com.service;
import java.util.ArrayList;
import java.util.List;

import br.com.appTV.*;
import br.com.model.Tv;

public class ServiceTv {

	    private List<Tv> lista;

	    public ServiceTv() {
	        lista = new ArrayList<>();
	    }

	    public void adicionar(Tv tv) {
	        lista.add(tv);
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

