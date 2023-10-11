import java.util.Random;

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