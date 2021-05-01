package br.unisal.view;

import java.util.Scanner;

import br.unisal.model.Produto;

/**
 * Exemplo com Arrays
 * @author Paulo Barreto
 * @date 23/04/2021
 */

public class frmProduto {
	public static void main(String[] args) {
		Scanner digito = new Scanner(System.in);
		int n;
		
		System.out.println("Informe o número de produtos que deseja cadastrar: ");
		n = digito.nextInt();
		System.out.println("OK, serão criado " + n + " posições no vetor.");
		
		//O índice do vetor sempre está entre 0 e n-1
		Produto vetor[] = new Produto[n];
		
		//Mecânismo de entrada massiva de dados
		for(int i=0; i < n; i++) {
			Produto temp = new Produto();
			
			System.out.println("Informe o código do produto: ");
			temp.setCodigo(digito.nextInt());
			System.out.println("Informe a descrição: ");
			temp.setDescricao(digito.next());
			System.out.println("Informe a quantidade: ");
			temp.setQuantidade(digito.nextFloat());
			System.out.println("Produto Ativo? A - Ativo e I - Inativo");
			temp.setStatus(digito.next().equals("A") ? true : false);
			
			vetor[i] = temp;
		}
		
		//Mecânismo de Leitura massiva dos dados
		for(int i=0; i < n; i++) {
			System.out.println("Código " + vetor[i].getCodigo());
			System.out.println("Descrição: " + vetor[i].getDescricao());
			System.out.println("Quantidade: " + vetor[i].getQuantidade());
			System.out.println("Situação: " + (vetor[i].isStatus() ? "Ativo" : "Inativo"));	
		}		
		digito.close();
	}
}
