package br.unisal.view;

import br.unisal.model.Produto;

/**
 * Classe que ser� utilizada pelo nosso Cliente como entrada de dados
 * @author Paulo Barreto
 * @data 23/04/2021
 */

public class frmProdutoINE {
	public static void main(String[] args) {
		//Exemplo de Vetor - Unidirecional
		int valores[] = {1, 2, 3};
		//Exemplo de Matriz - Multimencional
		int valoresM[][]= {{1, 2, 3}, 
						   {1, 2, 3}, 
						   {1, 2, 3}};
		
		Produto vetor[] = new Produto[10];
		
		//Instancia de Produto
		Produto produto = new Produto();		
		produto.setCodigo(1234);
		produto.setDescricao("Sab�o em P�");
		produto.setQuantidade(12f);
		produto.setStatus(true);
		
		vetor[0] = produto;
		
		Produto produtoNovo = new Produto();		
		produtoNovo.setCodigo(5465);
		produtoNovo.setDescricao("Caf�");
		produtoNovo.setQuantidade(50f);
		produtoNovo.setStatus(false);
		
		vetor[1] = produtoNovo;
		
		System.out.println("C�digo " + vetor[1].getCodigo());
		System.out.println("Descri��o: " + vetor[1].getDescricao());
		System.out.println("Quantidade: " + vetor[1].getQuantidade());
		System.out.println("Situa��o: " + (vetor[1].isStatus() ? "Ativo" : "Inativo"));		
	}
}
