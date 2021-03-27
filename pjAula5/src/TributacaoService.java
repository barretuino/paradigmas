public class TributacaoService implements RegimeEspecial{

	@Override
	public double valorVendaICMSCompra(double valorVenda, double valorTributo, double valorDesconto) {
		//Buscar a Tributação
		double baseICMS = RegimeEspecial.icmsSP;
		double pis = 0.0165; //1,65%
		double cofins = 0.076; //7,6%
		double creditoCarneSP = 0.04; //4%
				
		return valorVenda * baseICMS + (1-valorTributo) 
				- (valorDesconto - pis - cofins - creditoCarneSP);
	}

	@Override
	public double valorVendaICMSVenda(double valorCompra, boolean incideImposto, double base) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean regimeEspecialBA(double valorVenda, double valorCompra, boolean incideImposto) {
		double reducao = 41.176d;
		
		if(valorVendaICMSCompra(valorCompra, valorVenda, 0d) > 0){
			return false;
		}else if(valorVendaICMSCompra(valorCompra, valorVenda, 0d) == reducao) {
			return true;
		}		
		return false;
	}
}
