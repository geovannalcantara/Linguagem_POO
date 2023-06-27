package Lista3;

import java.util.Scanner;

public class Exc2 {
	
	public void valorRecebido() {
		
		int array[];
		array = new int [6];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < array.length ; contador ++) {
			System . out . print("Digite um valor inteiro: ");
			array[contador] = leia.nextInt();
		}
		
		System.out.printf ("\nValores Recebidos:\n");

		for (int contador = 0; contador < array.length ; contador ++) {
			System.out.printf("-> %d\n", array[contador]);
		}
	}
}
