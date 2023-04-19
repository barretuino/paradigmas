package pjAula9;

import java.util.ArrayList;
import java.util.Collection;

public class Colecoes {
	public static void main(String[] args) {
		Collection colecao = new ArrayList<Double>();
		colecao.add(100.10);
		colecao.add(11.15);
		colecao.add(12.1);
		
		System.out.println(colecao.stream()
				.anyMatch(i -> (double) i == 12.1) ?
				"Localizado" : "Não encontrado");
		
		colecao.stream().forEach(i -> System.out.println(i));
		
		colecao.forEach(i -> System.out.println(i));
		
	}
}
