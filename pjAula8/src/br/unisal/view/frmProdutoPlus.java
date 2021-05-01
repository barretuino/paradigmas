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
		//Mecânismo de entrada massiva de dados
		do {
			Produto temp = new Produto();
			
			System.out.println("Informe o código do produto: ");
			temp.setCodigo(digito.nextInt());
			System.out.println("Informe a descrição: ");
			temp.setDescricao(digito.next());
			System.out.println("Informe a quantidade: ");
			temp.setQuantidade(digito.nextFloat());
			System.out.println("Produto Ativo? A - Ativo e I - Inativo");
			temp.setStatus(digito.next().equals("A") ? true : false);
			
			lista.add(temp);
			System.out.println("Deseja Continuar incluindo produtos? S-Sim / N-Não");
		}while(digito.next().equals("S") ? true : false);
		System.out.println("Inclusão concluída com sucesso");

		//Mecânismo de Leitura massiva dos dados
		for(int i=0; i < lista.size(); i++) {
			System.out.println("-------------------------------------------------");
			System.out.println("Código " + lista.get(i).getCodigo());
			System.out.println("Descrição: " + lista.get(i).getDescricao());
			System.out.println("Quantidade: " + lista.get(i).getQuantidade());
			System.out.println("Situação: " + (lista.get(i).isStatus() ? "Ativo" : "Inativo"));	
			System.out.println("-------------------------------------------------");
		}		
		digito.close();
		
		//Ações de uma lista exemplos de métodos
		lista.add(new Produto());
		lista.remove(0);
		lista.contains(new Produto());
		lista.forEach(i->{
			System.out.println("-------------------------------------------------");
			System.out.println("Código " + i.getCodigo());
			System.out.println("Descrição: " + i.getDescricao());
			System.out.println("Quantidade: " + i.getQuantidade());
			System.out.println("Situação: " + (i.isStatus() ? "Ativo" : "Inativo"));	
			System.out.println("-------------------------------------------------");				
		});
		lista.removeAll(lista);
		lista.isEmpty();
	}
}
