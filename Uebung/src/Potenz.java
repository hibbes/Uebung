
public class Potenz {

	public static void main(String[] args) {
	
		int[][] matrix = new int[100][100];
		
	    int x = 1;
	    
	
	for(int i=0; i<matrix.length; i++){	// Zeilen
		for(int j=0;j<matrix[i].length; j++){  //Spalten
			matrix[i][j]=x;
			x++;
		} 
		}
		
	
	
	for(int i=0; i<matrix.length; i++){	// Zeilen
		for(int j=0;j<matrix[i].length; j++){  //Spalten
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
		}
	}
}
