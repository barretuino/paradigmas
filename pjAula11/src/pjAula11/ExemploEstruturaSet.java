package pjAula11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploEstruturaSet {
	public static void main(String[] args) {
		Set estrutura = new HashSet();
		
		System.out.println(estrutura.isEmpty() ? "Vázia" : "Preenchida");
		
		//Ação de Adição de Elementos
		estrutura.add("Paulo");
		estrutura.add("Igor");
		estrutura.add("Fernanda");
				
		System.out.println(estrutura);
		System.out.println("Tamanho da estrutura " + estrutura.size());
		
		//estrutura.remove("Paulo");
		//estrutura.remove("Igor");
		//estrutura.removeAll(estrutura);+
		
		estrutura.add("Luiz");
		estrutura.add("Prof. Sergio");
		estrutura.add("Tia da Cantina");
		
		System.out.println("Localizado Luiz? " + 
				(estrutura.contains("Luiz") ? "Localizado" : "Não localizado"));
		
		//estrutura.removeIf(i -> i.toString().contains("a"));
		
		System.out.println(estrutura);
		System.out.println("Tamanho da estrutura " + estrutura.size());
		System.out.println(estrutura.isEmpty() ? "Vázia" : "Preenchida");
		
		Iterator i = estrutura.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
