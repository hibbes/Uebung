import java.util.*;                   // Collection-Klassen

/**
 * Lotto mit HashSet<Integer>
 */
/**
 * Lotto Number Generator - Random Selection Algorithm
 * 
 * This class demonstrates random number generation and selection,
 * simulating the drawing of lottery numbers. Typically used to generate
 * a set of unique random numbers (like lottery balls).
 * 
 * Algorithm Considerations:
 * - Must ensure uniqueness: no number drawn twice
 * - Random selection: each valid combination should have equal probability
 * - Typical lottery rules: select k unique numbers from range [1, n]
 * 
 * Common Implementations:
 * 1. Array-based: Mark drawn numbers to ensure uniqueness
 * 2. ArrayList: Remove drawn numbers from pool
 * 3. Fisher-Yates Shuffle: Shuffle and take first k elements
 * 
 * Time Complexity: O(n) or O(k log n) depending on implementation
 * Space Complexity: O(n) for tracking used numbers
 * 
 * Educational Focus:
 * - Random number generation
 * - Set operations and uniqueness constraints
 * - Probability and fairness in algorithms
 * - Data structure selection for efficiency
 * - Testing randomness (statistical properties)
 */
public class Lotto
{
  public static void main( String[] args)
  {
    Set<Integer> set = new HashSet<Integer>();   // HashSet
    int doppelt = 0;

    while( set.size() < 6)      // Erzeugen der Lottozahlen
    {
      int num = ( int)( Math.random() * 49) + 1;
      if( !set.add( num)) doppelt++;
    }

                                 // Ausgabe der Lottozahlen
    for( Integer n: set) System.out.println( n);
    System.out.println( "Duplikate: " + doppelt);
  }
}