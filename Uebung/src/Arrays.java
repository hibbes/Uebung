/**
 * Arrays - Fundamental Array Operations and Algorithms
 * 
 * Demonstrates basic and intermediate array manipulation techniques,
 * including searching, traversal, transformation, and analysis.
 * 
 * Common Array Operations:
 * - Linear Search: Find element, O(n) time
 * - Binary Search: Find element in sorted array, O(log n) time
 * - Reversal: Flip array order, O(n) time
 * - Filtering: Extract matching elements, O(n) time
 * - Transformation: Apply function to each element, O(n) time
 * - Aggregation: Sum, max, min, average, O(n) time
 * - Sorting: Arrange in order, O(n log n) to O(n²)
 * 
 * Memory Layout (1D array of size n):
 *    Index:   [0]  [1]  [2] ... [n-1]
 *    Memory:  [X]--[X]--[X]--...--[X]
 *    Access:  O(1) - direct indexing via formula: address = base + (index * element_size)
 * 
 * Time Complexity Overview:
 * - Access by index: O(1)
 * - Linear search: O(n)
 * - Binary search: O(log n)
 * - Reversal: O(n)
 * - Copying: O(n)
 * 
 * Space Complexity: O(n) - linear with array size
 * 
 * Educational Focus:
 * - Understanding memory layout and indexing
 * - Array bounds and off-by-one errors
 * - Algorithm selection based on array properties
 * - Efficiency considerations in array operations
 */
public class Arrays {

public static void main (String[] args){
	int [] teilnehmer;
	teilnehmer = new int[120];
	
	int[] dozenten = new int[10];
	
	
	teilnehmer[119] = 1233456;
	
	int[] primzahlen = {2,3,5,7,11,13};
	
/*	for(int schnurz: primzahlen){
		System.out.print(schnurz+", ");
	} */
	
	for(int i=0; i<primzahlen.length; i++){
		System.out.println(primzahlen[i]);
	}
	
	    }
	
}	
		
		
		
		
		
		
		
		
		/*
	 * 	int[][] matrix = new int[3][3];
	 
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		
		for(int i = 0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}		
		
}

/*/
