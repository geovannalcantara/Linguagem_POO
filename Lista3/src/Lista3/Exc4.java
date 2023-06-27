package Lista3;

import java.util.Scanner;

public class Exc4 {
	
	public int contaPares() {
		
		int total = 0;
		int array[];
		array = new int [10];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < array.length ; contador ++) {
			System.out.print("Digite um valor: ");
			array[contador] = leia.nextInt();
		}
		
		for (int contador = 0; contador < array.length ; contador ++) {
			
			if(array[contador] % 2 == 0) {
				total++;
			}
		}
		return total;
	}
}
