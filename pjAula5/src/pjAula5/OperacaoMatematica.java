package pjAula5;

/**
 * Classe Abstrata
 * Tem o papel de definir um modelo que ser� adotado por outras classes
 * para sua constru��o
 * @author Paulo Barreto
 * @date 26/03/2021
 */

public abstract class OperacaoMatematica {
	public abstract double calcular(double arg1, double arg2);
	
	public String imprimir(double arg1, double arg2) {
		return "Resultado � " + this.calcular(arg1, arg2);
	}
}