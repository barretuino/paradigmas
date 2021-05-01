package br.unisal.vendas;

import pjAula9.ClienteBase;

public class Cliente extends ClienteBase{
	private int codigo;
	private String razaoSocial;
	private String cnpj;
	private String inscEstadual;
	private String inscMunicipal;
	/*****/
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscEstadual() {
		return inscEstadual;
	}
	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	public String getInscMunicipal() {
		return inscMunicipal;
	}
	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}
	
	@Override
	public String toString() {
		return "Código " + getCodigo() + " Nome " + getNome() + " Situação " + getStatus();
	}
}
