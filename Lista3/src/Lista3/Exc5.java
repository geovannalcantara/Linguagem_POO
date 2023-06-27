package Lista3;

import java.util.Scanner;

public class Exc5 {
	
	public void maiorValor() {
		
		int maior = 0;
		int posicao = 0;
		int array[];
		array = new int [10];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < array.length ; contador ++) {
			System.out.print("Digite um número inteiro: ");
			array[contador] = leia.nextInt();
		}
		
		System.out.println("\n---- VETOR ----");
		System.out.printf ("\n%s%7s\n", "Posição ", "Valor");
		for (int contador = 0; contador < array.length ; contador ++) {
			System.out.printf("-> [%d] %6d\n", contador, array[contador]);
		}
		
		System.out.printf ("\n%s %12s\n", "Posição", "MaiorValor");
		for (int contador = 0; contador < array.length ; contador ++) {
			
			if (array[contador] > maior) {
				maior = array[contador];
				posicao = contador;
			}
		}
		
		System.out.printf("-> [%d] %8d\n", posicao, maior);
	}
}
