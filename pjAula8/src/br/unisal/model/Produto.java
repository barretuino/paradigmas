package br.unisal.model;

/**
 * Classe de Modelagem Conceitual de Produto
 * @author Paulo Barreto
 * @data 23/04/2021
 */

public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private float quantidade;
	private boolean status; //Ativo ou Inativo
	
	//Métodos de Getters and setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Código " + getCodigo() + " Descrição: " + getDescricao()
				+ " Quantidade: " + getQuantidade()
				+ " Situação: " + (isStatus() ? "Ativo" : "Inativo");	
	}
}
