
/**
 * Power/Exponentiation - Matrix Operations for 2D Arrays
 * 
 * Demonstrates working with two-dimensional arrays (matrices) and
 * computing powers of matrices. This is useful in linear algebra
 * applications and graph theory.
 * 
 * Matrix Concepts:
 * A matrix is a 2D array with m rows and n columns:
 *     [a11 a12 a13]     Column 0  Column 1  Column 2
 *     [a21 a22 a23]  =  [[a11]    [a12]     [a13]]
 *     [a31 a32 a33]     [[a21]    [a22]     [a23]]
 *                        [[a31]    [a32]     [a33]]
 * 
 * Matrix Multiplication (A × B):
 * Result[i][j] = sum of A[i][k] * B[k][j] for all k
 * Example: (2×3) × (3×2) = (2×2)
 * 
 * Time Complexity:
 * - Matrix multiplication: O(n³) for n×n matrices (naive approach)
 * - Matrix power (A^k): O(k × n³)
 * - Matrix power (fast exponentiation): O(log k × n³)
 * 
 * Space Complexity: O(n²) - for storing the matrices
 * 
 * Applications:
 * - Graph reachability (paths in graphs)
 * - Fibonacci numbers (via matrix exponentiation)
 * - Transformations in computer graphics
 * - Linear system solving
 * 
 * Educational Focus:
 * - 2D array indexing and nested loops
 * - Algorithm complexity with multiple operations
 * - Mathematical concepts in programming
 * - Optimization techniques (fast exponentiation)
 */
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
