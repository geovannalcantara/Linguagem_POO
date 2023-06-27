package Exercicio1;

public class Administrativo extends Assistente{
	
	private String turno;
    private double addNoturno;
    
	public Administrativo(String nome, double salario, int matricula, String turno, double addNoturno) {
		super(nome, salario, matricula);
		this.turno = turno;
		this.addNoturno = addNoturno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAddNoturno() {
		return addNoturno;
	}

	public void setAddNoturno(double addNoturno) {
		this.addNoturno = addNoturno;
	}
	
	public double ganhoAnual() {
		double salarioAnual = super.ganhoAnual();
		
		if (turno.equalsIgnoreCase("noite")) {
			salarioAnual += addNoturno * 12;
			System.out.println("Adicional Noturno: " + addNoturno);
        }
        return salarioAnual;
    }
	
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
    }
}
