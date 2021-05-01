package br.unisal.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.unisal.model.Produto;

/**
 * Exemplo de Colection em Java
 * @author Paulo Barreto
 * @data 23/04/2020
 */
public class frmProdutoPlus {
	public static void main(String[] args) {
		//Exemplo Collection
		List<Produto> lista = new ArrayList<Produto>();
		
		Scanner digito = new Scanner(System.in);
		//Mec�nismo de entrada massiva de dados
		do {
			Produto temp = new Produto();
			
			System.out.println("Informe o c�digo do produto: ");
			temp.setCodigo(digito.nextInt());
			System.out.println("Informe a descri��o: ");
			temp.setDescricao(digito.next());
			System.out.println("Informe a quantidade: ");
			temp.setQuantidade(digito.nextFloat());
			System.out.println("Produto Ativo? A - Ativo e I - Inativo");
			temp.setStatus(digito.next().equals("A") ? true : false);
			
			lista.add(temp);
			System.out.println("Deseja Continuar incluindo produtos? S-Sim / N-N�o");
		}while(digito.next().equals("S") ? true : false);
		System.out.println("Inclus�o conclu�da com sucesso");

		//Mec�nismo de Leitura massiva dos dados
		for(int i=0; i < lista.size(); i++) {
			System.out.println("-------------------------------------------------");
			System.out.println("C�digo " + lista.get(i).getCodigo());
			System.out.println("Descri��o: " + lista.get(i).getDescricao());
			System.out.println("Quantidade: " + lista.get(i).getQuantidade());
			System.out.println("Situa��o: " + (lista.get(i).isStatus() ? "Ativo" : "Inativo"));	
			System.out.println("-------------------------------------------------");
		}		
		digito.close();
		
		//A��es de uma lista exemplos de m�todos
		lista.add(new Produto());
		lista.remove(0);
		lista.contains(new Produto());
		lista.forEach(i->{
			System.out.println("-------------------------------------------------");
			System.out.println("C�digo " + i.getCodigo());
			System.out.println("Descri��o: " + i.getDescricao());
			System.out.println("Quantidade: " + i.getQuantidade());
			System.out.println("Situa��o: " + (i.isStatus() ? "Ativo" : "Inativo"));	
			System.out.println("-------------------------------------------------");				
		});
		lista.removeAll(lista);
		lista.isEmpty();
	}
}
