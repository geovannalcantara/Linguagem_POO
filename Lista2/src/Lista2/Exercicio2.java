package Lista2;

import java.util.Scanner;

public class Exercicio2 {
	
	/*2. Desenvolver um algoritmo que leia a altura de 15 pessoas. 
 	 	 Este programa deverá calcular e mostrar:
			• A menor altura do grupo;
			• A maior altura do grupo.*/

	public void MaioreMenorAltura() {
	
		final int num_pessoas= 15;
		double menorAltura = Double.MAX_VALUE;
		double maiorAltura = Double.MIN_VALUE;
		double altura;
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 1; contador <= num_pessoas; contador++) {
		    System.out.print("Digite a altura da pessoa " + contador + ": ");
		    altura = leia.nextDouble();
		
		    if (altura < menorAltura) {
		        menorAltura = altura;
		    }
		
		    if (altura > maiorAltura) {
		        maiorAltura = altura;
		    }
		}
		
		System.out.println("");
		System.out.println("A menor altura é: " + menorAltura);
		System.out.println("A maior altura é: " + maiorAltura);
	}
}
