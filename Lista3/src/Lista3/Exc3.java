package Lista3;

import java.util.Scanner;

public class Exc3 {
	
	public void calcularPotencia() {
		
		int A[];
		int B[];
		A = new int [4];
		B = new int [4];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < A.length ; contador ++) {
			System . out . print("Digite um número: ");
			A[contador] = leia.nextInt();
		}
		
		System.out.println("\n---- VETOR A ----");
		for (int contador = 0; contador < A.length ; contador ++) {
			System.out.printf("-> %d\n", A[contador]);
		}
		
		System.out.println("\n---- VETOR B ----");
		for (int contador = 0; contador < B.length ; contador ++) {
			B[contador] = A[contador] * A[contador];
			System.out.printf("-> %d\n", B[contador]);
		}
	}
}
