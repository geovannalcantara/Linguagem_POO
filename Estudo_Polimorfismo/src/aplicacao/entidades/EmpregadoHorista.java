package aplicacao.entidades;

public class EmpregadoHorista extends Empregado {

	private double valorHora;
	private double horas;
	
	public EmpregadoHorista(String primeiroNome, String ultimoNome, String CPF, double valorHora, double horas) {
		super(primeiroNome, ultimoNome, CPF);
		this.setValorHora(valorHora);
		this.setHoras(horas);
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = (valorHora < 0.0) ? 0.0 : valorHora;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = ((horas > 0.0) && (horas <=168)) ? horas : 0.0;
	}

	@Override
	public double vencimento() {
		if (getHoras() <= 40) {
			return getValorHora() * getHoras();
		}

		return 40 * getValorHora() + (getHoras() - 40) * getValorHora() * 1.5;
	}
	@Override
	
	public String toString() {
		return String.format("Empregado horista: %s\n%s: $%.2f%n%s: %.2f", super.toString(), "Valor horas", getValorHora(), "Horas trabalhadas", getHoras());		
	}
}


