package pjAula11;

import java.util.Vector;

public class ExemploArrayList {
	public static void main(String[] args) {
		Vector lista = new Vector(2);
		
		lista.add(1);
		lista.add(2);
		
		System.out.println(lista);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println(lista.capacity());
		
		lista.add(123);
		lista.add("Igor");
		lista.add("Maria");
		lista.add("Igor");
		lista.add(new Livro());
		System.out.println(lista);
		System.out.println(lista.capacity());
		
		lista.removeAll(lista);
		System.out.println(lista);
		System.out.println(lista.capacity());
	}
}
