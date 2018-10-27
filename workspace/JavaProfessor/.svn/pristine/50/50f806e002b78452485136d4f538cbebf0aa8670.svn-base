package br.senai.sp.informatica.oo.exemplos.objetos;

import java.util.ArrayList;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("Teste");
		lista.add("Texto");
		lista.add("Java");
		lista.add("Teste");
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			String txt = lista.get(i);
			if(txt.equals("Java"))
				System.out.println(txt);
		}
		
		System.out.println("---------------");
		
		for (String txt : lista) {
			if(txt.equals("Java"))
				System.out.println(txt);
		}
		
		System.out.println("---------------");

		lista.stream()
			.filter(txt -> txt.equals("Java"))
			.forEach(System.out::println);
	}
}
