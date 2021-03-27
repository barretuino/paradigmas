package pjAula5;

/**
 * Polimorfismo 
 * @author Paulo Barreto
 * @date 26/03/2021
 */

public class Polimorfismo {
	public int calcular(int valor) {
		return valor * valor;
	}
	
	public int calcular(int valor, int fator) {
		return valor * fator;
	}
	
	public int calcular(String valor) {
		int conversao = Integer.parseInt(valor);
		return conversao * conversao;
	}
	
	public int calcular(String valor, String fator) {
		int conversao = Integer.parseInt(valor);
		int conversaoFator = Integer.parseInt(fator);
		return conversao * conversaoFator;
	}
	
	public float calcular(float valor) {
		return valor * valor;
	}
	
	public int calcular(int valor, String fator) {
		int conversaoFator = Integer.parseInt(fator);
		return valor * conversaoFator;
	}
	
	public int calcular(String valor, int fator) {
		int conversao = Integer.parseInt(valor);
		return conversao * fator;
	}
}
