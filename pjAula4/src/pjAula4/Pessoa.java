package pjAula4;

import java.util.Date;

/**
 * Herança do tipo 'Tem um'
 * @author Paulo Barreto
 * @date 19/03/2021
 */

public class Pessoa {
	private Date dataNascimento;
	private String nome;
	private Pessoa mae;
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa getMae() {
		return mae;
	}
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	
	
}
