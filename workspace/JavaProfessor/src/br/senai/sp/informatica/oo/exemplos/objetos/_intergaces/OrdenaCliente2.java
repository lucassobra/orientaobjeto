package br.senai.sp.informatica.oo.exemplos.objetos._intergaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaCliente2 {
	public static void main(String[] args) {
		List<Cliente2> lista = new ArrayList<>();
	
		lista.add(new Cliente2(223,  "Fulano", "123.123.123"));	
		lista.add(new Cliente2(934,  "Beltrano", "345.123.123"));
		lista.add(new Cliente2(345,  "Ciclano", "879.123.123"));
		
		Comparator<Cliente2> comparaCodigo = new Comparator<Cliente2>() {
			@Override
			public int compare(Cliente2 c1, Cliente2 c2) {
				return c1.getCodigo() - c2.getCodigo();
			}
		};
		
		Collections.sort(lista, comparaCodigo);

		System.out.println("ordenar por codigo");
		for (Cliente2 cliente : lista) {
			System.out.println(cliente);
		}

		Collections.sort(lista, new Comparator<Cliente2>() {
			@Override
			public int compare(Cliente2 c1, Cliente2 c2) {
				return c1.getNome().compareTo(c2.getNome());
			}
		});

		System.out.println("ordenar por nome");
		for (Cliente2 cliente : lista) {
			System.out.println(cliente);
		}
	}
}


