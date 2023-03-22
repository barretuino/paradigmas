package pjAula5;

public class UnidadeMedida {
	//Atributos
	private String descricao;
	private float fatorConversao;
	private String unidade;
	
	//Métodos de Getters and Setters
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getFatorConversao() {
		return fatorConversao;
	}
	public void setFatorConversao(float fatorConversao) {
		this.fatorConversao = fatorConversao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	//Métodos Polimorficos
	public float calcularUnitario(float qtdeEmbalagem, 
								  float qtdeEntrada) {
		return qtdeEmbalagem * qtdeEntrada;
	}
	
	public float calcularUnitario(int qtdeEmbalagem, 
			  					  int qtdeEntrada) {
		return qtdeEmbalagem * qtdeEntrada;
	}
	
	public float calcularUnitario(String qtdeEmbalagem, 
			  					  String qtdeEntrada) {
		return Float.parseFloat(qtdeEmbalagem) 
				* Float.parseFloat(qtdeEntrada);
	}
	
	public float calcularUnitario(String qtdeEmbalagem, 
			  					  float qtdeEntrada) {
		return Float.parseFloat(qtdeEmbalagem) * qtdeEntrada;
	}
	
	public float calcularUnitario(float qtdeEmbalagem, 
			  						String qtdeEntrada) {
		return qtdeEmbalagem * Float.parseFloat(qtdeEntrada);
	}
	
	public float calcularUnitario(String qtdeEntrada) {
		return 12 * Float.parseFloat(qtdeEntrada);
	}
}
