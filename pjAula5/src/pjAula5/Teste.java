package pjAula5;

public class Teste {
	public static void main(String[] args) {
		Celular seuAparelho = new Celular();
		Produto produto = new Produto();
		
		seuAparelho.setCodigo(123);
		seuAparelho.setDescricao("LG Dual Chip");
		seuAparelho.setFabricante("LG");
		seuAparelho.setUm(UnidadeMedida.PC);
		seuAparelho.setEstadoOrigem(Estado.SP);
		
		//Teste com o Polimorfismo
		Polimorfismo exemplo = new Polimorfismo();
		System.out.println(exemplo.calcular(2));
		System.out.println(exemplo.calcular("2"));
		System.out.println(exemplo.calcular(2f));
		
		System.out.println(exemplo.calcular(2, 2));
		System.out.println(exemplo.calcular("2","2"));
		
		Inseto lesma = new Inseto();
		Inseto formiga = new Inseto();
		Inseto gafanhoto = new Inseto();
		
		lesma.mover(10, 0, 0);
		formiga.mover(50, 2, 0);
		gafanhoto.mover(100, 50, 25);
		
		
		
		
		
	}
}
