package Lista2;

public class Exercicio6 {
	
	/*Implemente um programa que gera e escreve os números ímpares entre 100 e 200*/
	
	public void MotrarImpar() {
		
		int contador;
		for(contador=100; contador<=200; contador++) {
			if(contador % 2 == 1) {
				System.out.println("-> " + contador);	
			}
		}
	}
}
