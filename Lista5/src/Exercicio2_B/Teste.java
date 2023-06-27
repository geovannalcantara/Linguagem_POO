package Exercicio2_B;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("************ Pessoa ************");
		Pessoa obj1 = new Pessoa("João", 24);
		System.out.println("Nome: " + obj1.getNome());
		System.out.println("Idade: " + obj1.getIdade());
		
		System.out.println("\n************* Rica **************");
		Rica obj2 = new Rica("Maria", 35, 100000);
		System.out.println("Nome: " + obj2.getNome());
		System.out.println("Idade: " + obj2.getIdade());
		System.out.println("Dinheiro: " + obj2.getDinheiro());
		obj2.fazCompras();
		
		System.out.println("\n************* Pobre *************");
		Pobre obj3 = new Pobre("Raimundo", 40);
		System.out.println("Nome: " + obj3.getNome());
		System.out.println("Idade: " + obj3.getIdade());
		obj3.trabalha();
	
		System.out.println("\n*********** Miserável ***********");
		Miseravel obj4 = new Miseravel("Micael", 29);
		System.out.println("Nome: " + obj4.getNome());
		System.out.println("Idade: " + obj4.getIdade());
		obj4.mendiga();
	}
}
