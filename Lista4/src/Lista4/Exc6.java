package Lista4;

import java.util.Random;

public class Exc6 {
	
	private int[][] matriz = new int[5][5];
	
	public void preencherMatriz() {
		
		Random valorRandom = new Random();
	
		System.out.println("------------Matriz------------\n");

		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            matriz[i][j] = valorRandom.nextInt(100);
	            System.out.print(matriz[i][j] + " | ");
	        }
	        System.out.println();
	    }
	}
	
	public void somaImpares() {
		
		int somaImpar = 0;
		
		System.out.println("\n------------------------------");
		System.out.println("Soma dos impares:\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				if (matriz[i][j] % 2 == 1) {
					somaImpar += matriz[i][j];
				}
			}
		}
		System.out.println("Resulado: " + somaImpar);
	}
	
	public void somaColunas() {
		
		int[] somaColuna = new int[matriz[0].length];
		
		System.out.println("\n------------------------------");
		System.out.println("Soma das colunas:\n");
		
		for (int j = 0; j < matriz[1].length; j++) {
			for (int i = 0; i < matriz[0].length; i++) {
				somaColuna[j] += matriz[i][j]; 
			}
		}
		
		for (int j = 0; j < somaColuna.length; j++) {
			System.out.printf("Coluna %d: %d\n", j, somaColuna[j]);
		}
	}
	
	public void somaLinhas() {
		
		int[] somaLinha = new int[matriz[0].length];
		
		System.out.println("\n------------------------------");
		System.out.println("Soma das linhas:\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[1].length; j++) {
				somaLinha[i] += matriz[i][j];
			}
		}
		
		for (int i = 0; i < somaLinha.length; i++) {
			System.out.printf("Linha %d: %d\n", i, somaLinha[i]); 
		}
	}
}
