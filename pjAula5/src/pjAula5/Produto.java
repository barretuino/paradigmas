package pjAula5;

/**
 * Exemplo de Modelo Conceitual para Produto
 * @author Paulo Barreto
 * @date 26/03/2021
 */

public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private UnidadeMedida um;
	private double preco;
	private Estado estadoOrigem;
	//private TipoSituacao situacao;

	//Métodos
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
	public UnidadeMedida getUm() {
		return um;
	}
	public void setUm(UnidadeMedida um) {
		this.um = um;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Estado getEstadoOrigem() {
		return estadoOrigem;
	}
	public void setEstadoOrigem(Estado estadoOrigem) {
		this.estadoOrigem = estadoOrigem;
	}
}
