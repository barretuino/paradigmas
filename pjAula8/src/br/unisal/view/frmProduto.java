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
		
		System.out.println("Informe o n�mero de produtos que deseja cadastrar: ");
		n = digito.nextInt();
		System.out.println("OK, ser�o criado " + n + " posi��es no vetor.");
		
		//O �ndice do vetor sempre est� entre 0 e n-1
		Produto vetor[] = new Produto[n];
		
		//Mec�nismo de entrada massiva de dados
		for(int i=0; i < n; i++) {
			Produto temp = new Produto();
			
			System.out.println("Informe o c�digo do produto: ");
			temp.setCodigo(digito.nextInt());
			System.out.println("Informe a descri��o: ");
			temp.setDescricao(digito.next());
			System.out.println("Informe a quantidade: ");
			temp.setQuantidade(digito.nextFloat());
			System.out.println("Produto Ativo? A - Ativo e I - Inativo");
			temp.setStatus(digito.next().equals("A") ? true : false);
			
			vetor[i] = temp;
		}
		
		//Mec�nismo de Leitura massiva dos dados
		for(int i=0; i < n; i++) {
			System.out.println("C�digo " + vetor[i].getCodigo());
			System.out.println("Descri��o: " + vetor[i].getDescricao());
			System.out.println("Quantidade: " + vetor[i].getQuantidade());
			System.out.println("Situa��o: " + (vetor[i].isStatus() ? "Ativo" : "Inativo"));	
		}		
		digito.close();
	}
}
