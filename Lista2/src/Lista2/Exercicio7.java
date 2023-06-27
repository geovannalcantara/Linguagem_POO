package Lista2;

import java.util.Scanner;

public class Exercicio7 {
	
	/*Implemente um programa que leia um valor para uma variável N de 1 a 10 e calcule a tabuada de N. 
	  Mostre a tabuada na forma: 0 ∗ N = 0, 1 ∗ N = 1N, 2 ∗ N = 2N, · · · , 10 ∗ N = 10N.*/

	public void Tabuada() {
		
		Scanner leia = new Scanner(System.in);
		
		int contador;
		int n;
		
		System.out.print("Informe um número de 1 á 10 para a tabuada: ");
		n = leia.nextInt();

		if(n < 1 || n > 10) {
			 System.out.print("Valor inválido! \n\nDigite novamente: ");
			 n = leia.nextInt();
		}
		
		System.out.print("\n");
		
		for(contador=0; contador<=10; contador++) {
			System.out.printf("%d * %d = %d%n", contador, n, contador * n);	
		}		
	}
}

