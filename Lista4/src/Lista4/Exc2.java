package Lista4;

public class Exc2 {
	
	public void Diagonal() {
		
		int[][] matriz = new int[5][5];
			
		for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
               if(i==j){
            	   matriz[i][j] = 1;
               } else 
            	   matriz[i][j] = 0;
            }
        }
		System.out.println("-------Matriz------\n");
		
		for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
	}
}
