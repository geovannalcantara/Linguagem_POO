package Lista2;

import java.util.Scanner;

public class Exercicio8 {
	
	/*Implemente um programa que leia um valor inicial A e imprima a sequência de valores 
	  do cálculo de A! e o seu resultado. Ex: 5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1 = 120.*/
	
	public void Fatorial() {
		
		Scanner leia = new Scanner(System.in);
	        
        int a;
        int fatorial = 1;
        
        System.out.print("Digite o valor inicial: ");
        a = leia.nextInt();
        
        if(a < 0) {
			 System.out.print("Valor inválido! Não existe fatorial para números negativos. \n\nDigite novamente: ");
			 a = leia.nextInt();
		}
        
        System.out.print("\n");
        System.out.print(a + "! = ");

        for (int contador = a; contador > 1; contador--) {
            System.out.print(contador + " * ");
            fatorial = fatorial * contador;
        }
        
        System.out.println("1 = " + fatorial);
	}

}
