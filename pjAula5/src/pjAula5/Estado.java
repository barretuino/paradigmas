package pjAula5;

public enum Estado {
	SP ("SP", "São Paulo"),
	RJ ("RJ", "Rio de Janeiro"),
	MG ("MG", "Minas Gerais");
	
	private String uf;
	private String descricao;
	
	Estado(String uf, String descricao) {
		this.uf = uf;
		this.descricao = descricao;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
