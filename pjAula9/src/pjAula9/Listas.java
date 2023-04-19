package pjAula9;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		lista.add(100);
		lista.add(21);
		lista.add(-4);
		lista.add(22);
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}
}
