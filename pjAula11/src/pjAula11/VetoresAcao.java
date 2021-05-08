package pjAula11;

import java.util.HashSet;
import java.util.Set;

public class VetoresAcao {
	public static void main(String[] args) {
		Livro vetor [] = new Livro[10];
		
		Livro temp = new Livro();
		temp.setCodigo(1);
		temp.setTitulo("Java como programar");
		temp.setAutor("Deitel & Deitel");
		temp.setValor(110.00f);
		
		vetor[0] = temp;
		
		try {
			System.out.println(vetor[1].getAutor());
		}catch(NullPointerException e) {
			System.err.println("Você esqueceu de instanciar o objeto");
		}
		
		//Declarando uma coleção
		Set c = new HashSet();
	}
}
