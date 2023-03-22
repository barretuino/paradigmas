package pjAula5;

import java.util.List;

public interface iCadastro {
	public void incluir(Object o);
	public Object pesquisar(int id);
	public void atualizar(Object o);
	public void excluir(int id);
	public List<Object> listar();
}
