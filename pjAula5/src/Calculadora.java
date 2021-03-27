import pjAula5.OperacaoMatematica;

/**
 * Polimorfismo de Objetos dinâmicos
 * @author Paulo Barreto
 * @date 26/03/2021
 */

public class Calculadora {
	public static double mostrarCalculo(OperacaoMatematica operacao, double arg1, double arg2) {
		return operacao.calcular(arg1, arg2);
	}
	
	public static void main(String[] args) {
		System.out.println(Calculadora.mostrarCalculo(new Soma(), 10, 6));
		System.out.println(Calculadora.mostrarCalculo(new Divisao(), 10, 2));
		System.out.println(Calculadora.mostrarCalculo(new Subtracao(), 3, 2));
		System.out.println(Calculadora.mostrarCalculo(new Multiplicacao(), 10, 6));
	}
}
