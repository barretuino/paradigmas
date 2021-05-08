package pjAula11;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		Map mapa = new HashMap();
		mapa.put("txt1234", "Paulo");
		mapa.put("9997845", "Fernanda");
		
		System.out.println(mapa);
		
		try {
			String valor = "10.5";
			int valorInt = Integer.parseInt(valor);
			System.out.println(valorInt);
		}catch(Exception e) {
			System.out.println("Houve um erro ao realizar a conversão");
		}		
	}
}
