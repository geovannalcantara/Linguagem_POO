package Lista2;

public class Exercicio1 {
	
	/*Desenvolver um algoritmo que efetue a soma de todos os números 
	  ímpares que são múltiplos de três e que se encontram no conjunto 
	  dos números de 1 até 500.*/
	
	public int SomaImpar() {
		
		int contador;
		int acumulaImpar=0;
		
		for(contador=0; contador<=500; contador++) {
			if(contador % 2 == 1 && contador % 3 ==0) {
				acumulaImpar = acumulaImpar + contador;
			}
		}
		return acumulaImpar;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
