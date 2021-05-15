package deadlock;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		for(int i=0; i < 100; i++) {
			lista.add("A" + i);
		}		
		/*System.out.println(lista);
		for(String l : lista) {
			System.out.println(l);
		}*/
		
		lista.forEach(i -> System.out.println(i));
		
		System.out.println(lista.stream().filter(p-> p.contains("1")).count());
	}
}
