package Lista4;

import java.util.Arrays;
import java.util.Random;

public class Exc5 {

	private int[][] matrizA = new int[4][4];
	private int[][] matrizB = new int[4][4];
	private int[][] matrizC = new int[4][4];
	
	public void preencherMatrizes() {
		
		Random valorRandom = new Random();
		
		System.out.println("------------------------------");
		System.out.println("Matriz A:\n");
		for (int i = 0; i < matrizA[0].length; i++) {
	        for (int j = 0; j < matrizA[i].length; j++) {
	            matrizA[i][j] = valorRandom.nextInt(100);
	            System.out.print(matrizA[i][j] + " | ");
			}
			System.out.println();
	    }
		
		System.out.println("\n------------------------------");
		System.out.println("Matriz B:\n");

		for (int i = 0; i < matrizB[0].length; i++) {
	        for (int j = 0; j < matrizB[i].length; j++) {
	        	matrizB[i][j] = valorRandom.nextInt(100);
	        	System.out.print(matrizA[i][j] + " | ");
			}
			System.out.println();
	    }
	}
	
	public void matrizValoresMaiores() {
		
		boolean c = Arrays.equals ( matrizA , matrizB ) ;
		 
		if(c == false) {
			for (int i = 0; i < matrizA[0].length; i++) {
				for (int j = 0; j < matrizB[1].length; j++) {
					matrizC[i][j] = Math.max(matrizA[i][j], matrizB[i][j]);
				}
			}
		}
		
		System.out.println("\n------------------------------");
		System.out.println("\nMatriz com os valores maiores da matriz A e B.\n");
		
		System.out.println("Matriz C:\n");		
		for (int i = 0; i < matrizC[0].length; i++) {
			for (int j = 0; j < matrizC[1].length; j++) {
				System.out.print(matrizC[i][j] + " | ");
			}
			System.out.println();
		}
		
	}
}
