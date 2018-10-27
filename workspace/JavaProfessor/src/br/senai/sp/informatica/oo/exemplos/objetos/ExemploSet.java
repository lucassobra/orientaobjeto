package br.senai.sp.informatica.oo.exemplos.objetos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		Set<String> lista = new TreeSet<>();
		
		lista.add("Teste");
		lista.add("Texto");
		lista.add("Java");
		lista.add("Teste");
		
		System.out.println(lista.size());
		
		Iterator<String> iterator = lista.iterator();
		while(iterator.hasNext()) {
			String txt = iterator.next();
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
