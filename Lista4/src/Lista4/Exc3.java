package Lista4;

import java.util.Random;

public class Exc3 {
	
	public void posicaoMaior() {
	
		int maiorValor = 0;
		int linha = 0;
		int coluna = 0;
		int[][] matriz = new int[4][4];
		Random valorRandom = new Random();
		
		System.out.println("---Matriz Valores aleatórios---\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            matriz[i][j] = valorRandom.nextInt(100);
	            System.out.print(matriz[i][j] + " | ");
	        }
	        System.out.println();
	    }
		
		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            if (matriz[i][j] > maiorValor) {
	            	maiorValor = matriz[i][j];
	            	linha = i;
	            	coluna = j;
	            }
	        }
	    }
		System.out.println("\nO Maior valor é " + maiorValor + ", posição [" + linha + "][" + coluna +"].");
	}
}
