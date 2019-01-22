
public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NUM_FILAS = 3;
		int NUM_COLUMNAS = 4;
		int numeros[][] = new int[NUM_FILAS][NUM_COLUMNAS];
		
		for (int i = 0; i < numeros.length; i++) {
			
			for (int j = 0; j < numeros[i].length; j++) {
				
				numeros[i][j] = (int)(Math.random() * 100);
				
			}
			
		}
		
	    for (int i = 0; i < numeros.length; i++) {
	        
	        for (int j = 0; j < numeros[i].length; j++) {
	        	
	        	System.out.print("|");
	        	
	        	if (numeros[i][j] < 10) {
	        		
	        		System.out.printf(" %d",numeros[i][j]);	        		
	        		
	        	} else {
	        		
	        		System.out.print(numeros[i][j]);
	        		
	        	}
	        	
	        	System.out.print("|");
	          
	        	if (j == numeros[i].length-1) System.out.print("\n");
	        	
	        }

	    }
	    
	    int num_max = numeros[0][0];
	    int num_min = numeros[0][0];
	    
	    for (int i = 0; i < numeros.length; i++) {
			
			for (int j = 0; j < numeros[i].length; j++) {
				
				if (num_max < numeros[i][j]) {

					num_max = numeros[i][j];
							
				} else if (num_min > numeros[i][j]) {
					
					num_min = numeros[i][j];
					
				}
				
			}
			
		}
	    
	    System.out.printf("El numero maximo es %d y el minimo %d",num_max,num_min);

	}

}
