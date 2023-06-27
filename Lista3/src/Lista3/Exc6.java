package Lista3;

import java.util.Scanner;

public class Exc6 {
	
	public void ordemInversa() {
		
		int array[];
		array = new int [6];
		
		Scanner leia = new Scanner(System.in);
		
		for (int contador = 0; contador < array.length ; contador ++) {
			System.out.print("Digite um valor inteiro: ");
			array[contador] = leia.nextInt();
		}
		
		System.out.print("\nValores lidos na ordem inversa: ");
        for (int contador = array.length - 1; contador >= 0; contador--) {
            System.out.print(array[contador] + " ");
        }
	}
}
