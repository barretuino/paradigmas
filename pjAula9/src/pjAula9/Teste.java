package pjAula9;

import br.unisal.recursoHumanos.Cliente;

public class Teste {

	public static void main(String[] args) {
		
		//Sintaxe Tipo do Objeto <nome variavel> = new Tipo do Objeto
		Cliente bruno = new Cliente();		
		Cliente maria = new Cliente(753, "Maria do Nascimento");
		Cliente paulo = new Cliente("Paulo Barreto");
		Cliente luiz = new Cliente("Luiz F. Malaquias", 700);
		
		bruno.setCodigo(753);
		bruno.setNome("Bruno Silva");
		
		paulo.setCodigo(1000);
		
		System.out.println(paulo.getCodigo() + " " + paulo.getNome());
	}
}
