
public class TributacaoEspecial implements RegimeEspecial {

	@Override
	public double valorVendaICMSCompra(double valorVenda, double valorTributo, double valorDesconto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double valorVendaICMSVenda(double valorCompra, boolean incideImposto, double base) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean regimeEspecialBA(double valorVenda, double valorCompra, boolean incideImposto) {
		// TODO Auto-generated method stub
		return false;
	}

}
