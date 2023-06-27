package Lista3;

import java.util.Random;
import java.util.Scanner;

public class Exc9 {

private int[] vetor = new int[5];
	
	public void receberValor() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digitar valor (0) ou gerar aleatorio de 1 a 100(1):");
		int op = leia.nextInt();
		
		if(op == 0) {
			System.out.println();
			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("Digite o valor para posicao %d: ", i);
				vetor[i] = leia.nextInt();
			}
		} 
		else if (op == 1) {
			Random valorRandom = new Random();

			System.out.println("\nValores aleatorios:");
			
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = valorRandom.nextInt(100);
				System.out.print(vetor[i] + " | ");
			}// fim for
			
		} 
		else {
			System.out.println("Valor invalido!");
		} // fim if e else
		
	}// fim metodo
	
	public void posicaoMenorEMenor() {
		int menor = vetor[0];
		int posicaoMenor = 0;
		int maior = vetor[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
				posicaoMenor = i;
			} 
			else if (vetor[i] > maior) {
				maior = vetor[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("\n\nMenor: %d - Posicao: %d", menor, posicaoMenor);
		System.out.printf("\nMaior: %d - Posicao: %d", maior, posicaoMaior);
	}
}


