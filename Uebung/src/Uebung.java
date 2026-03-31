
/**
 * Sieve of Eratosthenes - Prime Number Generation Algorithm
 * 
 * An ancient algorithm for finding all prime numbers up to a specified
 * integer. It works by iteratively marking the multiples of each prime
 * as composite (not prime).
 * 
 * Algorithm Process:
 * 1. Create a boolean array "prime[0..n]" and initialize all as true
 * 2. Set prime[0] and prime[1] to false (0 and 1 are not prime)
 * 3. For each number p from 2 to sqrt(n):
 *    - If prime[p] is still true (p is prime):
 *      - Mark all multiples of p (2p, 3p, 4p, ...) as false
 * 4. All numbers remaining marked as true are prime
 * 
 * Example with n=20:
 * Initial: [F, F, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T]
 * p=2:     [F, F, T, T, F, T, F, T, F, T, F, T, F, T, F, T, F, T, F, T, F]
 * p=3:     [F, F, T, T, F, T, F, T, F, F, F, T, F, T, F, F, F, T, F, T, F]
 * p=5:     [F, F, T, T, F, T, F, T, F, F, F, T, F, T, F, F, F, T, F, T, F]
 * Result: Primes are 2, 3, 5, 7, 11, 13, 17, 19
 * 
 * Time Complexity: O(n log log n)
 * Space Complexity: O(n) - boolean array to store primality of each number
 * 
 * Educational Focus:
 * - Array-based algorithm optimization
 * - Understanding algorithmic efficiency
 * - Boolean flags for tracking state
 * - Iterative approach to problem-solving
 * 
 * Characteristics:
 * - Very efficient for generating all primes up to a limit
 * - Much faster than checking primality individually
 * - Requires O(n) memory but delivers excellent time complexity
 * - Not suitable for finding large individual primes
 */
public class Uebung {

	public static void main(String[] args) {
		int maxwert = 1024000;
		int ausgabeinc = 0;
		boolean[] zahlen = new boolean[maxwert];   
		for (int i = 2; i<zahlen.length; i++){
			if(zahlen[i]==false){
				for(int j=i*2; j<zahlen.length; j=j+i){
					zahlen[j]=true;
				}
			  }
			}
		for (int i=2; i<zahlen.length;i++){
			if(!zahlen[i]){
				System.out.print(i+" ");
				ausgabeinc++;
				if(ausgabeinc%10==0){System.out.println("");}
				
			}
		}
		
	}
}
