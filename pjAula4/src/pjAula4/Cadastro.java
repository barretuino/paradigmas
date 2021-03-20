package pjAula4;

import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		int n = 2;
		Aluno[] alunos = new Aluno[n];
		Scanner digito = new Scanner(System.in);
		
		//Escrever
		for(int i = 0; i<n; i++) {
			Aluno novo = new Aluno();
			System.out.println("Informe o Ra ");
			novo.setRa(digito.nextInt());
			System.out.println("Informe o Nome ");
			novo.setNome(digito.next());
			System.out.println("informe a Média ");
			novo.setMedia(digito.nextDouble());
			
			alunos[i] = novo;
			System.out.println("Cadastro do aluno " + i + " realizado.");
		}
		
		//Ler
		for(int i = 0; i<n; i++) {
			System.out.println("Ra " + alunos[i].getRa() + 
							   " Nome " + alunos[i].getNome() +
							   " Média " + alunos[i].getMedia());			
		}
		
		digito.close();
		
		new Cadastro().cadastrar();
	}

	public void cadastrar() {
		Aluno novo = new Aluno(); 
		
		novo.setRa(123);
		System.out.println(novo.getRa());
	}
}