
public interface RegimeEspecial{
	public static double icmsSP = 0.18;
	
	public double valorVendaICMSCompra(double valorVenda, double valorTributo, double valorDesconto);
	public double valorVendaICMSVenda(double valorCompra, boolean incideImposto, double base);
	public boolean regimeEspecialBA(double valorVenda, double valorCompra, boolean incideImposto);
}
