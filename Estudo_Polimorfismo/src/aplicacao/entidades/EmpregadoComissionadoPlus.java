package aplicacao.entidades;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {

	private double salarioBase;

	public EmpregadoComissionadoPlus(String primeiroNome, String ultimoNome, String CPF, double vendasBrutas,
			double porcentagemComissao, double salarioBase) {
		super(primeiroNome, ultimoNome, CPF, vendasBrutas, porcentagemComissao);
		this.setSalarioBase(salarioBase);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase < 0.0 ? 0.0 : salarioBase;
	}
	
	@Override
	public double vencimento() {
		return getSalarioBase() * super.vencimento();
	}
	
	@Override
	public String toString() {
		return String.format("%s\n%s\n%s: $%.2f", "Base assalariada", super.toString(), "Salario base", getSalarioBase());
	}
	
}

