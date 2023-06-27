package Lista3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exerc10 {
	
	private int[] vetor = new int[10];
	private ArrayList<Integer> valoresRepetidos = new ArrayList<>();
	
	public void pegarValor() {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digitar valor (0) ou gerar aleatorio de 1 a 100(1):");
		int op = leia.nextInt();
		
		if(op == 0) {
			for (int i = 0; i < vetor.length; i++) {
				System.out.printf("Digite o valor para posicao %d: ", i);
				vetor[i] = leia.nextInt();
			}
		} 
		else if (op == 1) {
			Random valorRandom = new Random();

			System.out.println("\nVetor");
			
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = valorRandom.nextInt(100);
				System.out.print(vetor[i] + " | ");
			}// fim for
			
		} 
		else {
			System.out.println("Valor invalido!");
		} // fim if e else
		
	}// fim metodo
	
	public void verificarValoresIguais() {
		
		for (int i = 0; i < vetor.length -1; i++) {
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[i] == vetor[j]) {
					if (!valoresRepetidos.contains(vetor[i])) {
						valoresRepetidos.add(vetor[i]);
					}
				}
			}// fim for j	
			
		}// fim for i
		
		if (valoresRepetidos.isEmpty()) {
		    System.out.println("\n\nNão há valores repetidos no vetor");
		} else {
		    System.out.println("\n\nValores repetidos no vetor ");
		    System.out.println(valoresRepetidos);
		}
		
	}// fim metodo
}
