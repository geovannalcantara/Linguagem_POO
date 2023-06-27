package Lista2;

import java.util.Scanner;

public class Exercicio3 {
	
	/*Implemente um programa que leia um número não determinado de valores e calcule e escreva
	  a média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade 
	  de valores negativos e o percentual de valores negativos e positivos.*/
	
			
	protected int qtdPositivo, qtdNegativo, qtdTotal;
	
	public int core() {
		
		Scanner leia = new Scanner(System.in);
		
		int sentinela = 1;
		int somatorio = 0;
		int receberValor;
		
		while( sentinela != 0) {
			System.out.print("Digite um valor: ");
			receberValor = leia.nextInt();
			
			if (receberValor == 0) {
				break;
			}
			
			somatorio = somatorio + receberValor;
			
			if (receberValor < 0) {
				qtdNegativo = qtdNegativo + 1;
			}
			else {
				qtdPositivo = qtdPositivo + 1;
			}
			
			qtdTotal = qtdTotal + 1;
		}// fim while
		return somatorio;
	}// fim core
	
	public void relatorio(int somaTotal) {
		
		System.out.println("\nTotal de entradas: " + qtdTotal);
		System.out.println("Total de positivos: " + qtdPositivo);
		System.out.println("Total de negativos: " + qtdNegativo);
		
		double percePositivo = ((double)qtdPositivo / (double)qtdTotal) * 100.0;
		
		System.out.println("");
		System.out.println("Percentual de positivos: " + percePositivo);
		
		double perceNegativo = ((double)qtdNegativo / (double)qtdTotal) * 100.0;
		
		System.out.println("Percentual de negativos: " + perceNegativo);
		
		System.out.println("");
		System.out.println("Média: " + somaTotal / qtdTotal);
		
	}
}
