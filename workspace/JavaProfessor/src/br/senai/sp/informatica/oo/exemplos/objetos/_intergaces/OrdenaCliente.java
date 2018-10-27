package br.senai.sp.informatica.oo.exemplos.objetos._intergaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaCliente {
	public static void main(String[] args) {
		List<Cliente> lista = new ArrayList<>();
	
		lista.add(new Cliente(223,  "Fulano", "123.123.123"));	
		lista.add(new Cliente(934,  "Beltrano", "345.123.123"));
		lista.add(new Cliente(345,  "Ciclano", "879.123.123"));
		
		Collections.sort(lista);

		System.out.println("ordenar por codigo");
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}

		Collections.sort(lista, new OrdenaPorNome());

		System.out.println("ordenar por nome");
		for (Cliente cliente : lista) {
			System.out.println(cliente);
		}
	}
}

class OrdenaPorNome implements Comparator<Cliente> {
	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getNome().compareTo(c2.getNome());
	}
}
