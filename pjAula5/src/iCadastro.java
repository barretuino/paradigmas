
public interface iCadastro {
	/*
	 * CRUD
	 * 	Create - Inserir
	 * 	Read - Pesquisa
	 * 	Update - Alterar
	 * 	Delete - Excluir 
	 */
	public void cadatrar(Object obj);
	public Object pesquisar(int codigo);
	public void alterar(Object obj);
	public boolean excluir(int codigo);
	public String imprimir(Object obj);
}
