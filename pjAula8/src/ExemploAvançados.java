import java.util.ArrayList;
import java.util.List;

import br.unisal.model.Produto;

public class ExemploAvançados {
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<Produto>();
		
		//Instancia de Produto
		Produto produto = new Produto();		
		produto.setCodigo(1234);
		produto.setDescricao("Sabão em Pó");
		produto.setQuantidade(12f);
		produto.setStatus(true);
		
		produtos.add(produto);
					
		produtos.stream().filter(p-> p.getQuantidade()>=12).forEach(i->{
			System.out.println(i + "\n" + "Este produto atende ao critério de duzia");
		});
	}
}
