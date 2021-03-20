package pjAula4;

public class Teste {
	public static void main(String[] args) {
		Cliente voce = new Cliente();
		Cliente bruno = new Cliente();
		Cliente italo = new Cliente();
		
		voce.nome = "Paulo";
		System.out.println(voce.nome);
		
		voce.setCodigo(123);
		System.out.println(voce.getCodigo());
		
		voce.calcularDesconto(10, 1);
		System.out.println(voce.getDesconto());
		
		System.out.println(voce);
		System.out.println(bruno);
		System.out.println(italo);
	}
}
