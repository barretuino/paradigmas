
public class frmCadastroCliente implements iCadastro{
	
	Cliente entity = new Cliente();

	@Override
	public void cadatrar(Object obj) {
		entity = (Cliente) obj;		
	}

	@Override
	public Object pesquisar(int codigo) {
		//Chamar rotina no banco de dados
			
		return entity;
	}

	@Override
	public void alterar(Object obj) {
		entity = (Cliente) obj;		
	}

	@Override
	public boolean excluir(int codigo) {
		//Chamar rotina no banco de dados
		if(true) {
			return true;
		}
		return false;
	}

	@Override
	public String imprimir(Object obj) {
		return null;
	}

}
