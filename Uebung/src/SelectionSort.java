import java.util.Random;

/**
 * Selection Sort - Simple Comparison-Based Sorting Algorithm
 * 
 * Selection sort works by repeatedly finding the minimum element from
 * the unsorted portion of the array and placing it at the beginning.
 * 
 * Algorithm Process:
 * 1. Find the minimum element in the unsorted portion
 * 2. Swap it with the first unsorted element
 * 3. Move the boundary between sorted and unsorted portions
 * 4. Repeat until the entire array is sorted
 * 
 * Example with [5, 2, 8, 1, 9]:
 * Pass 1: [1, 2, 8, 5, 9] - minimum (1) moved to position 0
 * Pass 2: [1, 2, 8, 5, 9] - minimum in remaining (2) already in place
 * Pass 3: [1, 2, 5, 8, 9] - minimum (5) moved to position 2
 * Pass 4: [1, 2, 5, 8, 9] - only 8, 9 remain, sorted
 * 
 * Time Complexity:
 * - Best case: O(n²)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * Always O(n²) regardless of input - makes n(n-1)/2 comparisons
 * 
 * Space Complexity: O(1) - sorts in place
 * 
 * Characteristics:
 * - Not stable: may change relative order of equal elements
 * - In-place sort: minimal extra memory needed
 * - Fewer swaps than bubble sort - better for expensive write operations
 * - Simple to understand and implement
 * - Good for small to medium sized arrays
 */
public class SelectionSort {
    static int howBig = 10000;
    static long timeStart;
    static long timeEnd;

    public static int[] generateToSort(int n) {
        Random rand = new Random();

        int[] numb = new int[n];

        for (int i = 0; i < n; i++) {
            numb[i] = rand.nextInt(100000);
        }
        return numb;
    }

    public static void selectionSort(int[] numb) {
        int smallerNumber;
        timeStart = System.nanoTime();
        for (int i = 0; i < numb.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numb.length; j++) {
                if (numb[j] < numb[index]) {
                    index = j; // suche nach kleinstem Wert
                }
            }
            smallerNumber = numb[index];
            numb[index] = numb[i];
            numb[i] = smallerNumber;
        }
        timeEnd = System.nanoTime();

    }

    public static void main(String a[]) {
        int[] toSort = generateToSort(howBig);
        System.out.println("Vor der Sortierung");
        for (int i : toSort) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(toSort);// Sortierung

        System.out.println("Nach der Sortierung");
        for (int i : toSort) {
            System.out.print(i + " ");
        }
        System.out.println("\n \nVerlaufszeit der Schleife: " + ((timeEnd - timeStart)/100000 ) + "ms.");
    }
}