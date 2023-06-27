package Lista4;

import java.util.Random;

public class Exc1 {
	
	public void Maiores() {
		
		int contador = 0;
		int[][] matriz = new int[4][4];
		Random valorRandom = new Random();
		
		System.out.println("Matriz Valores aleatórios: \n");
		
		for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valorRandom.nextInt(100);
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
		
		for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }
		System.out.println("\nA matriz possui " + contador + " valores maiores que 10.");
	}
}
