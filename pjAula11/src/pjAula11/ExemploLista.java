package pjAula11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExemploLista {
	public static void main(String[] args) {
		List<Livro> lista = new ArrayList<Livro>();
		
		Livro temp = new Livro();
		temp.setCodigo(1);
		temp.setTitulo("Java como programar");
		temp.setAutor("Deitel & Deitel");
		temp.setValor(110.00f);
		
		lista.add(temp);
		
		Livro temp2 = new Livro();
		temp2.setCodigo(2);
		temp2.setTitulo("Aprender a estudar linguagens");
		temp2.setAutor("Souza e Souza");
		temp2.setValor(90f);
		
		lista.add(temp2);
		
		Livro temp3 = new Livro();
		temp3.setCodigo(3);
		temp3.setTitulo("ABC");
		temp3.setAutor("Monteiro Lobato");
		temp3.setValor(116.65f);
		
		lista.add(temp3);
		
		System.out.println("***** Imprimindo a lista original******");
		//Métodos que automaticamente a Linguagem Oferece para o uso lista
		for(Livro l : lista) {
			System.out.println(l.getCodigo() + " " + l.getTitulo());
		}
		
		System.out.println("********* Ordenando a lista ***********");
		lista.sort((a,b)->a.getValor()<(b.getValor())? 1 : -1);
		//Métodos que automaticamente a Linguagem Oferece para o uso lista
		for(Livro l : lista) {
			System.out.println(l.getCodigo() + " " + l.getTitulo() +  " " + l.getValor());
		}
		
		List<Livro> listaFiltrada = new ArrayList<Livro>();
		
		System.out.println("***** SubList lista original******");
		
		try {
			listaFiltrada = lista.subList(0,4);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("Você informou um indice que está acima do limite. Limite " 
					+ lista.size());
			listaFiltrada = lista.subList(0, lista.size());
		}
		
		for(Livro l : listaFiltrada) {
			System.out.println(l.getCodigo() + " " + l.getTitulo() +  " " + l.getValor());
		}
		 LinkedList<Integer> linkedList = new LinkedList<Integer>();
		 linkedList.add(123);
		 linkedList.add(456);
		 linkedList.addFirst(80);
		 linkedList.addFirst(4);
		 linkedList.add(211);
		 
		 linkedList.sort((a,b) -> a.intValue() > b.intValue() ? 1 : -1);
		 
		 System.out.println(linkedList);
		 
		 try {
			 System.out.println(5/1);
		 }catch(ArithmeticException e) {
			 System.err.println("Divisão por zero inválida");
		 }
	}
}
