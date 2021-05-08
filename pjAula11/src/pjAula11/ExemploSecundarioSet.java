package pjAula11;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSecundarioSet {
	public static void main(String[] args) {
		//Execução do construtor define que será HashSet (Ordem não definida)
		//Set c = new HashSet();
		
		//TreeSet possui uma ordenação de seus elementos
		Set c = new TreeSet();		
		c.add("ana");
		c.add("Joao");
		c.add("Maria");
		c.add("Jose");
		c.add("Ana");
		
		System.out.println(c);
		
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		Set c2 = new TreeSet();
		c2.add("Italo");
		c2.add("Bruno");
		
		c.addAll(c2);
		System.out.println(c2);
		System.out.println(c);
		
		c.removeAll(c2);
		System.out.println(c);
	}
}
