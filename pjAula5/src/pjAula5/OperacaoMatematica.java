package pjAula5;

/**
 * Classe Abstrata
 * Tem o papel de definir um modelo que será adotado por outras classes
 * para sua construção
 * @author Paulo Barreto
 * @date 26/03/2021
 */

public abstract class OperacaoMatematica {
	public abstract double calcular(double arg1, double arg2);
	
	public String imprimir(double arg1, double arg2) {
		return "Resultado é " + this.calcular(arg1, arg2);
	}
}