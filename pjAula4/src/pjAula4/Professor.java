package pjAula4;

import javax.xml.crypto.Data;

public class Professor extends Pessoa{
	private int matricula;
	private Data dataAdmissao;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Data getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Data dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
