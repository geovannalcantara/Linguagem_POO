package aplicacao.entidades;

public class EmpregadoComissionado extends Empregado{
	
		private double VendasBrutas;
		private double porcentagemComissao;
	
	public EmpregadoComissionado(String primeiroNome, String ultimoNome, String CPF, double vendasBrutas,
					double porcentagemComissao) {
				super(primeiroNome, ultimoNome, CPF);
				VendasBrutas = vendasBrutas;
				this.porcentagemComissao = porcentagemComissao;
			}
	
		public double getVendasBrutas() {
			return VendasBrutas;
		}
	
		public void setVendasBrutas(double vendas) {
			VendasBrutas = (vendas<0.0)? 0.0 : vendas;
		}
	
		public double getPorcentagemComissao() {
			return porcentagemComissao;
		}
	
		public void setPorcentagemComissao(double taxa) {
		porcentagemComissao= (taxa >0.0 && taxa <1.0)? taxa: 0.0;
		}
		
	@Override
	
	public double vencimento() {
		return getPorcentagemComissao() * getVendasBrutas();
		
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s\n%s: $%.2f\n%s: %.2f", "Empregado Comissionado", 
				super.toString(), "Vendas Brutas", getVendasBrutas(), "Porcentagem comissao", getPorcentagemComissao());
}
}





























