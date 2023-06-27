package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exc4 {
	
	public void posicaoValor() {
		
		boolean encontrado = false;
		int buscaValor;
		int linha = 0;
		int coluna = 0;
		int[][] matriz = new int[5][5];
		
		Scanner leia = new Scanner(System.in);
		Random valorRandom = new Random();
		
		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            matriz[i][j] = valorRandom.nextInt(100);
	        }
	    }
		
		System.out.print("Digitar o valor a ser buscado na Matriz: ");
		buscaValor = leia.nextInt();
		
		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            if (matriz[i][j] == buscaValor) {
	            	encontrado = true;
	            	linha = i;
	            	coluna = j;
	            	break;
	            } 
             }
		     if (encontrado) {
		    	 break;
	         }
         }
    
		if (encontrado) {
	        System.out.println("\nValor encontrado na posição: [" + linha + "][" + coluna +"].");
	    } else {
	        System.out.println("\nValor não encontrado.");
	    }
		
		System.out.println("\n--------Matriz--------\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	        	 System.out.print(matriz[i][j] + " | ");
	        }
	        System.out.println();
	    }
	}
}

