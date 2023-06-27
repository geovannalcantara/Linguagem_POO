package Lista3;

public class Exc1 {
	
	private int A []={1 , 0 , 5 , -2 , -5 , 7};

	public void Soma() {
		
		int soma=0;
		
		for (int contador = 0; contador < A.length ; contador ++) {
			soma = A [0] + A [1] +  A [5];
		}
		
		System.out.println ("A soma dos valores nas posições [0], [1] e [5] é: " + soma);
	}
	
	public void ModificaVetor() {
		
		System.out.printf ("\n%s%7s\n", "Posição ", "Valor");

		for (int contador = 0; contador < A.length ; contador ++) {
			A [4] = 100; 
			System.out.printf("  [%d] %7d\n", contador , A[contador]);
		}
		
	}
}
