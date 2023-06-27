package Exercicio1;

public class Tecnico extends Assistente{
	
	private double bonusSalarial;
		
	public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
		super(nome, salario, matricula);
		this.bonusSalarial = bonusSalarial;
	}
	
	public double getBonusSalarial() {
		return bonusSalarial;
	}
		
	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}
	
	public double ganhoAnual() {
        return super.ganhoAnual() + bonusSalarial;
    }
	
	public void exibeDados() {
	    super.exibeDados();
	    System.out.println("Bônus salarial: " + bonusSalarial);
	}
}
