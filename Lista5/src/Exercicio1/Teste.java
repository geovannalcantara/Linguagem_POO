package Exercicio1;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("************ Funcionário ************");
		Funcionario obj1 = new Funcionario("João", 1200);
        obj1.exibeDados();
        obj1.addAumento(500);
        System.out.println("Ganho Anual: " + obj1.ganhoAnual());
        
        System.out.println("\n************* Assistente ************");
        Assistente obj2 = new Assistente("Maria", 2500.0, 123);
        obj2.exibeDados();
        System.out.println("Ganho Anual: " + obj2.ganhoAnual());

        System.out.println("\n************** Técnico **************");
        Tecnico obj3 = new Tecnico("Carlos", 3000.0, 124, 1000.0);
        obj3.exibeDados();
        System.out.println("Ganho Anual: " + obj3.ganhoAnual());
       
        System.out.println("\n********** Administrativo ***********");
        Administrativo obj4 = new Administrativo("Matheus", 1700, 125, "Noite", 600);
        obj4.exibeDados();
        System.out.println("Ganho Anual: " + obj4.ganhoAnual());        
	}
}
