package pjAula5;

public abstract class ClasseCRUD {
	public abstract void incluir(Object o);
	public abstract void excluir(int codigo);
	public abstract Object pesquisar(int codigo);
	public abstract void alterar(Object o);
}
