
/**
 * Rucksackproblem (Knapsack Problem) - Recursive Dynamic Programming
 * 
 * The knapsack problem is a classic optimization problem in computer science.
 * Given a set of items, each with a weight and value, determine which items
 * to include to maximize value while staying within a weight limit.
 * 
 * Problem Definition (0/1 Knapsack):
 * - n items, each with weight w[i] and value v[i]
 * - Knapsack capacity W
 * - Select items to maximize total value subject to weight constraint
 * - Each item can be taken 0 or 1 times (not fractional)
 * 
 * Example:
 * Items: [(weight=2, value=3), (weight=3, value=4), (weight=4, value=5)]
 * Capacity: 6
 * Best solution: Items 0 and 2, total weight=6, value=8
 * 
 * Recursive Approach:
 * For each item, two choices:
 * 1. Include item i: value[i] + knapsack(capacity - weight[i], i+1)
 * 2. Exclude item i: knapsack(capacity, i+1)
 * Take maximum of the two
 * 
 * Base Cases:
 * - Item count = 0: return 0
 * - Capacity <= 0: return 0
 * 
 * Time Complexity:
 * - Without memoization: O(2^n) - exponential
 * - With memoization (DP): O(n*W) - polynomial
 * - DP Space: O(n*W) for memoization table
 * 
 * Recursion Tree Example (for 3 items):
 *              knapsack(W, 3)
 *            /              \
 *      include[2]        exclude[2]
 *         /    \            /    \
 *    include  exclude   include  exclude
 *    [1]       [1]        [1]      [1]
 *    ...        ...        ...      ...
 * 
 * Educational Focus:
 * - Recursive problem decomposition
 * - Exponential vs polynomial complexity
 * - Dynamic programming optimization
 * - Memoization technique
 * - Backtracking algorithms
 * - NP-complete problems
 * 
 * Characteristics:
 * - NP-complete problem: no known polynomial solution
 * - Approximation algorithms exist for large instances
 * - Used in real-world resource allocation
 * - Basis for many optimization techniques
 */
public class Rucksackproblem {
	
	static int rVol =30;
	static int[] gVol = {5, 5, 6, 9, 6, 11, 12, 15, 17, 30};
	static int [] gWert = {7, 7, 6, 5, 10, 5, 14, 17, 20, 21};
	
	static int packen(int restVol, int i){
		if(i<gVol.length){
			// nicht einpacken
			int nicht = packen(restVol, i+1);
			System.out.println();
			System.out.println("Restvolumen ist "+restVol);
			System.out.println("Nicht-Wert ist: "+ nicht +" und Arrayposition ist: "+i);
			
			// einpacken
			int drin = 0;
			if(restVol - gVol[i] >=0){
					 drin = gWert[i] + packen(restVol-gVol[i], i+1);
					 System.out.println("Drin-Wert ist: "+ drin +" und Arrayposition ist: "+i);
			}
			if(nicht>drin){
				System.out.println("Kein Neupacken");
				return nicht;
			}else{
				System.out.println("Neupacken");
				return drin;}
		}
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int erg = packen(rVol, 0);
   System.out.println(erg);
	}

}
