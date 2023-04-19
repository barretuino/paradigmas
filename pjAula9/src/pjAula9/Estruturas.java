package pjAula9;

public class Estruturas {
	public static void main(String[] args) {
		//1. Retrição quanto ao tamanho
		//2. Tipo fixado e imutável
		int[] valores = new int[10];

		//3. Acesso e manipulação sempre pelo seu indice
		for(int i=0; i<10; i++) {
			valores[i] = (int)System.currentTimeMillis() * i;					
		}
		for(int i=0; i<10; i++) {
			System.out.println(valores[i]);					
		}
		
		//Matriz
		double[][] notas = new double[2][3];
		
		for(int i=0; i<2; i++) {
			for(int x=0; x<3; x++) {
				notas[i][x] = (double)System.currentTimeMillis() * i;
			}
		}
		for(int i=0; i<2; i++) {
			for(int x=0; x<3; x++) {
				System.out.println(notas[i][x]);
			}
		}
		
		for(int i : valores) {
			System.out.println(i);
		}
		
		for(double [] i : notas) {
			for(double x : i) {
				System.out.println(x);
			}
		}
		
		Produto[] vetor = new Produto[5];
		vetor[0].codigo = 123;
		vetor[0].nome = "Paulo";
		
		vetor[1].codigo = 456;
		vetor[1].nome = "Maria";
	}
}
