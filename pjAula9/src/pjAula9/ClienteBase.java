package pjAula9;

public class ClienteBase {
	private int codigo;
	public String nome;
	private double desconto;
	private String status;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public void calcularDesconto(double valor, double percentualDesconto) {
		desconto = valor *= percentualDesconto/100;
	}
	
	public double getDesconto() {
		return desconto;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
