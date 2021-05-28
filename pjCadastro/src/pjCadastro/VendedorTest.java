package pjCadastro;

public class VendedorTest {
	public static void main(String[] args) {
		VendedorService service = new VendedorService();
		
		Vendedor v = new Vendedor();
		v.setCodigo(123);
		v.setNome("Paulo");
		
		service.inserir(v);
		
		//service.excluir(123);
		
		v = service.pesquisar(123);
		if(v != null) {
			System.out.println(v.getCodigo() + " " + v.getNome());
		}
		
	}
}
