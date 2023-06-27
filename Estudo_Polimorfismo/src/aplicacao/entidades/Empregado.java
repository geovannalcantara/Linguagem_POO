package aplicacao.entidades;

public abstract class Empregado {

	private String primeiroNome;
	private String ultimoNome;
	private String CPF;
	
	public Empregado(String primeiroNome, String ultimoNome, String CPF) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.CPF = CPF;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String toString() {
		return String.format("%s %s\nCPF: %s", this.getPrimeiroNome(), this.getUltimoNome(), this.getCPF());
	}
	
	public abstract double vencimento();
	
}
