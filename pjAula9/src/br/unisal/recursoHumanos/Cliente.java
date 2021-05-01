package br.unisal.recursoHumanos;

import pjAula9.ClienteBase;

/**
 * Classe que modela conceitualmente um Cliente
 * @author Paulo Barreto
 * @date 30/04/2021
 */

public class Cliente extends ClienteBase{
	//Atributos
	private int codigo;
	private String nome;
	
	/**
	 * Tipo Argumento
	 * Quantidade de Argumentos
	 * Ordem dos Argumentos
	 */
	
	public Cliente() {
		//TODO: Lembrar de ver a regra com PO
	}
	
	public Cliente(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Cliente(String nome, int codigo) {
		this.codigo = codigo;
		this.nome = nome;
	}
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	//Métodos Setter e Getter
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
}