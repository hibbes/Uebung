
/**
 * Bubble Sort - Simple Comparison-Based Sorting Algorithm
 * 
 * Bubble sort repeatedly steps through the list, compares adjacent elements,
 * and swaps them if they are in the wrong order. This process repeats until
 * the list is sorted.
 * 
 * Algorithm Process:
 * 1. Compare first pair of elements
 * 2. If first > second, swap them
 * 3. Move to next pair and repeat
 * 4. After each complete pass, the largest unsorted element "bubbles up"
 *    to its correct position at the end
 * 5. Reduce the range and repeat until no swaps occur
 * 
 * Example with [5, 2, 8, 1, 9]:
 * Pass 1: [2, 5, 1, 8, 9] - largest element 9 in place
 * Pass 2: [2, 1, 5, 8, 9] - second largest element 8 in place
 * Pass 3: [1, 2, 5, 8, 9] - sorted
 * 
 * Time Complexity:
 * - Best case: O(n) - already sorted, with optimization flag
 * - Average case: O(n²)
 * - Worst case: O(n²) - reverse sorted
 * 
 * Space Complexity: O(1) - sorts in place, only needs temporary variables
 * 
 * Characteristics:
 * - Stable sort: maintains relative order of equal elements
 * - In-place sort: requires minimal extra memory
 * - Simple but inefficient for large datasets
 * - Good educational tool for learning sorting concepts
 */
public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] unsortiert = { 4, 1, 8, -3, 5, 7, 45, 7, 58, 6 ,5432, 6, 3, 987, 2, 1, -4, 66, 1337, 3497, 1674,432,433,8,7,341,243,909,101,1011 };
		int[] sortiert = bubblesort(unsortiert);

				

	}

	public static int[] bubblesort(int[] sortieren) {
		int inc = 0;
		int temp;
		for(int i=1; i<sortieren.length; i++) {
			for(int j=0; j<sortieren.length-i; j++) {
				inc++;
				
				if(sortieren[j]>sortieren[j+1]) {
					temp=sortieren[j];
					sortieren[j]=sortieren[j+1];
					sortieren[j+1]=temp;
					inc++;
				}
				
			}
		}
		ausgabe(sortieren, inc);
		return sortieren;
	}
					

	
	private static void ausgabe(int[] sortieren, int inc){
		System.out.println(inc+". Speicherzugriffe");
		for(int i = 0; i<sortieren.length; i++){
		System.out.print(sortieren[i]+", ");
		}
		System.out.println("");
	}
}
