package Lista3;

import java.util.Scanner;

public class Exc7 {
	
	public Double mediaProva() {
		
		double somanotas = 0;
		double media = 0;
		double notas[];
		notas = new double [15];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < notas.length ; contador ++) {
			System.out.print("Digite a nota da prova: ");
			notas[contador] = leia.nextDouble();
		}
		
		for (int contador = 0; contador < notas.length ; contador ++) {
			somanotas += notas[contador];
			media = somanotas / notas.length;
		}
		return media;
	}
}
