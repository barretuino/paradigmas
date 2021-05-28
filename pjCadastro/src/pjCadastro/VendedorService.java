package pjCadastro;

import java.util.ArrayList;
import java.util.List;

public class VendedorService {

	List<Vendedor> lista = new ArrayList<Vendedor>();
	
	public void inserir(Vendedor entity) {
		lista.add(entity);
		System.out.println("Inser��o Realizada com Sucesso!");
	}
	
	public void alterar(Vendedor entity) {
		for(Vendedor e : lista) {
			if(e.getCodigo() == entity.getCodigo()) {
				e = entity;
				System.out.println("Altera��o Realizada com Sucesso!");
			}
		}
	}
	
	public boolean excluir(int codigo) {
		Vendedor entity = null;
		for(Vendedor e : lista) {
			if(e.getCodigo() == codigo) {
				entity = e;
			}
		}
		if(entity != null) {
			lista.remove(entity);
			System.out.println("Exclus�o Realizada com Sucesso!");
			return true;
		}
		return false;
	}
	
	public Vendedor pesquisar(int codigo) {
		for(Vendedor e : lista) {
			if(e.getCodigo() == codigo) {
				return e;
			}
		}
		return null;
	}
}
