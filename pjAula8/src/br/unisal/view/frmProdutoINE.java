package br.unisal.view;

import br.unisal.model.Produto;

/**
 * Classe que será utilizada pelo nosso Cliente como entrada de dados
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
		produto.setDescricao("Sabão em Pó");
		produto.setQuantidade(12f);
		produto.setStatus(true);
		
		vetor[0] = produto;
		
		Produto produtoNovo = new Produto();		
		produtoNovo.setCodigo(5465);
		produtoNovo.setDescricao("Café");
		produtoNovo.setQuantidade(50f);
		produtoNovo.setStatus(false);
		
		vetor[1] = produtoNovo;
		
		System.out.println("Código " + vetor[1].getCodigo());
		System.out.println("Descrição: " + vetor[1].getDescricao());
		System.out.println("Quantidade: " + vetor[1].getQuantidade());
		System.out.println("Situação: " + (vetor[1].isStatus() ? "Ativo" : "Inativo"));		
	}
}
