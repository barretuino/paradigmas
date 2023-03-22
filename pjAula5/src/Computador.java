package pjAula5;

/**
 * Herança do Tipo É Um
 * @author Prof. Paulo Barreto 
 * @date 21/03/2023
 */
public class Computador extends Produto{
	//Atributos
	private int voltagem;
	private Fabricante fabricante;
	private float valor;
	private float peso;
	private CATEGORIA categoria;
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public CATEGORIA getCategoria() {
		return categoria;
	}
	public void setCategoria(CATEGORIA categoria) {
		this.categoria = categoria;
	}	
}
