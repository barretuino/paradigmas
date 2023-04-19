package pjAula9;

import java.util.Set;
import java.util.TreeSet;

public class TesteHash {
	public static void main(String[] args) {
		Set valor = new TreeSet();
		
		valor.add("Paulo");
		valor.add("Luiza");
		valor.add("Juan");
		valor.add("César");
		valor.add("Luiza");
		valor.add("10");
		
		Set texto = new TreeSet();
		texto.add("Barreto");
		texto.add("Unisal");
		
		System.out.println(valor);
		
		valor.remove("César");
		
		System.out.println(valor);
		
		valor.addAll(texto);
				
		valor.forEach(p -> {
			System.out.println(p);
		});
	}
}
