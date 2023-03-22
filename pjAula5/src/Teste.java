package pjAula5;

public class Teste {
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setCodigo(10);
		produto.setDescricao("Lápis");
		
		UnidadeMedida um = new UnidadeMedida();
		um.setDescricao("Caixa");
		um.setFatorConversao(50);
		um.setUnidade("cx");
		
		produto.setUm(um);
		
		System.out.println(um.calcularUnitario(50, 3));
		System.out.println(um.calcularUnitario("50", "3"));
		System.out.println(um.calcularUnitario(50.10f, 3.15f));
		System.out.println(um.calcularUnitario("50", 3));
		System.out.println(um.calcularUnitario(50, "3"));
	}
}
