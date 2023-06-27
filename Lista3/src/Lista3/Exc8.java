package Lista3;

import java.util.Scanner;

public class Exc8 {
	
	public void Positivos_Negativos() {
		
		double negativos = 0;
		double positivos = 0;
		double numeros[];
		numeros = new double [10];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < numeros.length ; contador ++) {
			System.out.print("Digite um número: ");
			numeros[contador] = leia.nextDouble();
		}
		
		for (int contador = 0; contador < numeros.length ; contador ++) {
			
			if (numeros[contador] < 0) {
				negativos++;	
			} 
			else { 
				positivos += numeros[contador];	
			}
		}
		
		System.out.println("\nQuantidade de Negativos: " + negativos);
		System.out.println("Soma Positivos: " + positivos);
	}
}
