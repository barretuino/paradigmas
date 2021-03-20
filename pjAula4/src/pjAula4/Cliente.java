package pjAula4;

public class Cliente {
	private int codigo;
	public String nome;
	private double desconto;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void calcularDesconto(double valor, double percentualDesconto) {
		desconto = valor *= percentualDesconto/100;
	}
	
	public double getDesconto() {
		return desconto;
	}
}
