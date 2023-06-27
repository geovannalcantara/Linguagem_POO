package Lista2;

import java.util.Scanner;

public class Exercicio5 {
	
	/*Implemente um programa que leia uma quantidade não determinada de números positivos. 
	  Calcule a quantidade de números pares e ímpares, a média de valores pares e a
	  média geral dos números lidos. O número que encerrará a leitura será zero.*/
	

	public void numerosPareseImpares() {
        
        Scanner leia = new Scanner(System.in);
        
        int numero;
        int acumulaNumero = 0;
        int somaNumero =0;
        int acumulaPar = 0;
        int somaPar = 0;
        int acumulaImpar = 0;
        double mediaPar = 0;
        double mediaGeral = 0;
      
        
        while (true) {
            System.out.print("Informe um número positivo (0 para sair): ");
            numero = leia.nextInt();
            
            if (numero <= 0) {
                break;
            }
            
            if (numero % 2 == 0) {
            	acumulaPar++;
            	somaPar = somaPar + numero;
            	mediaPar = somaPar / acumulaPar;
            	
            } else if (numero % 2 == 1) {
                acumulaImpar++;
            }
            acumulaNumero++;
            somaNumero = somaNumero + numero;
            mediaGeral = somaNumero / acumulaNumero;
            
        }
        
		System.out.println("");
        System.out.println("Quantidade de números Pares: " + acumulaPar);
        System.out.println("Quantidade de números Ímpares: " + acumulaImpar);
        
		System.out.println("");
        System.out.println("Média dos números pares: " + mediaPar);
        System.out.println("Média dos números geral: " + mediaGeral);
        
	}
}


