package Exercicio2_A;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("************ Animal ************");
		Animal obj1 = new Animal("Leão", "Kalahari");
		System.out.println("Nome: " + obj1.getNome());
		System.out.println("Raça: " + obj1.getRaca());
		System.out.println(obj1.caminha());
		
		System.out.println("\n*********** Cachorro ***********");
		Cachorro obj2 = new Cachorro("Bruce", "American bully");
		System.out.println("Nome: " + obj2.getNome());
		System.out.println("Raça: " + obj2.getRaca());
		System.out.println("Late: " + obj2.late());
		obj2.late();
		
		System.out.println("\n************* Gato *************");
		Gato obj3 = new Gato("Luke", "Vira lata");
		System.out.println("Nome: " + obj3.getNome());
		System.out.println("Raça: " + obj3.getRaca());
		System.out.println("Mia: " + obj3.mia());
	}
}
