import java.util.HashMap;
import java.util.Map;

import br.unisal.model.Produto;

public class exemploMapas {
	public static void main(String[] args) {
		Map<Integer, Produto> mapaNotas = new HashMap<Integer, Produto>();
		
		//Instancia de Produto
		Produto produto = new Produto();		
		produto.setCodigo(1234);
		produto.setDescricao("Sabão em Pó");
		produto.setQuantidade(12f);
		produto.setStatus(true);
		
		mapaNotas.put(produto.getCodigo(), produto);
		
		System.out.println(mapaNotas.get(1234));		
	}
}
