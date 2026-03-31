/**
 * Towers of Hanoi - Recursive Algorithm
 * 
 * Demonstrates the classic Towers of Hanoi puzzle solution using recursion.
 * The puzzle involves moving a stack of disks from one peg to another,
 * following these rules:
 * - Only one disk can be moved at a time
 * - A larger disk can never be placed on a smaller disk
 * - All disks start on the source peg and must be moved to the destination peg
 * 
 * This class uses a recursive approach which elegantly solves the problem
 * by breaking it down into smaller subproblems:
 * To move n disks from source to destination using auxiliary:
 * 1. Move n-1 disks from source to auxiliary (using destination as helper)
 * 2. Move the largest disk from source to destination
 * 3. Move n-1 disks from auxiliary to destination (using source as helper)
 * 
 * Time Complexity: O(2^n) - requires 2^n - 1 moves for n disks
 * Space Complexity: O(n) - recursion depth
 * 
 * Educational Focus:
 * - Understanding recursive algorithms
 * - Breaking complex problems into simpler subproblems (divide and conquer)
 * - Call stack visualization
 * - Base cases in recursion
 */
public class Hanoi {
	public static long count = 0;

    /**
     * Bewegt n Scheiben von Turm a nach Turm c und benutzt als
     * Zwischenspeicher Turm b.
     */
    private static void bewege (char a, char b, char c, int n)
    {
	if (n == 1){
	    System.out.println("Zug: "+count+" - Lege die oberste Scheibe von " + 
		   "Turm " + a + " auf Turm " + c + ".");
		   count++;}
		   
	else {
            bewege(a, c, b, n-1);
            bewege(a, b, c, 1);
            bewege(b, a, c, n-1);
	}
    }

    public static void main (String[] args)
    {
	bewege('a', 'b', 'c', 100);
    }

}