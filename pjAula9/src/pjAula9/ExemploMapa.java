package pjAula9;

import java.util.HashMap;
import java.util.Map;

public class ExemploMapa {
	public static void main(String[] args) {
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(123, "Paulo");
		mapa.put(456, "Marta");
		mapa.put(657, "Heloiza");
		
		if(mapa.containsKey(123)) {
			System.out.println("Localizado");
		}else {
			System.out.println("Não encontrado");
		}
		
		if(mapa.get(123) != null) {
			System.out.println("Localizado");
		}else {
			System.out.println("Não encontrado");
		}
		
		System.out.println(mapa);
	}
}
