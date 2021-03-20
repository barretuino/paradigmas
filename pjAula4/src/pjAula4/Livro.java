package pjAula4;

import java.util.Date;

/**
 * Modelagem Conceitual de Livro
 * @author Paulo Barreto
 * @date 19/03/2021
 */

public class Livro {
	//Atributos
	private int codigo;
	private String titulo;
	private String autor;
	private Date dataAquisicao;
	private boolean status;
	
	//Métodos
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
	public Date getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	
}
