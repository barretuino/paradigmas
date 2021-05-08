package pjAula11;

/**
 * Classe de Modelagem Conceitual
 * @author Paulo Barreto
 * @data 07/05/2021
 */

public class Livro {
	//Atributos
	private int codigo;
	private String titulo;
	private String autor;
	private float valor;

	//Métodos de Getters e Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}