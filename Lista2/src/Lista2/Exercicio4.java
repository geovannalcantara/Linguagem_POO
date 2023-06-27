package Lista2;

import java.util.Scanner;

public class Exercicio4 {
	
	/*Implemente um programa que leia uma quantidade desconhecida de números 
	  e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
	  A entrada de dados deve terminar quando for lido um número negativo.*/
	
	public static void qtdIntervalos() {
        
        Scanner leia = new Scanner(System.in);
        
        int numero;
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;
        
        while (true) {
            System.out.print("Informe um número: ");
            numero = leia.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            if (numero >= 0 && numero <= 25) {
                intervalo1++;
            } else if (numero >= 26 && numero <= 50) {
                intervalo2++;
            } else if (numero >= 51 && numero <= 75) {
                intervalo3++;
            } else if (numero >= 76 && numero <= 100) {
                intervalo4++;
            }
        }
        
		System.out.println("");
        System.out.println("Quantidade de números no intervalo [0-25]: " + intervalo1);
        System.out.println("Quantidade de números no intervalo [26-50]: " + intervalo2);
        System.out.println("Quantidade de números no intervalo [51-75]: " + intervalo3);
        System.out.println("Quantidade de números no intervalo [76-100]: " + intervalo4);
        
	}
}
