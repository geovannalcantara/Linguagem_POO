package aplicacao.entidades;

public class EmpregadoAssalariado extends Empregado {

	private double salarioSemanal;
	
	public EmpregadoAssalariado(String primeiroNome, String ultimoNome, String CPF, double salarioSemanal) {
		super(primeiroNome, ultimoNome, CPF);
		this.setSalarioSemanal(salarioSemanal);
	}

	
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}



	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal < 0.0 ? 0.0 : salarioSemanal;
	}

	
	public String toString() {
		return String.format("Empregado assalariado: %s\n%s: $%.2f",
				super.toString(), "Salário semanal", this.getSalarioSemanal());
	}
	

	@Override
	public double vencimento() {
		return this.getSalarioSemanal();
	}

}
