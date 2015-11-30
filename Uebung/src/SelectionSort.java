
public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] unsortiert = { 4, 1, 8, -3, 5, 7, 58, 6 ,5432, 6, 3 };
		int[] sortiert = selectionsort(unsortiert);

				

	}

	public static int[] selectionsort(int[] sortieren) {
		int inc = 0;
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
					inc++;
					ausgabe(sortieren, inc);
				}
				
			}
		}

		return sortieren;
	}
	
	private static void ausgabe(int[] sortieren, int inc){
		System.out.println(inc+". Sortierung");
		for(int i = 0; i<sortieren.length; i++){
		System.out.print(sortieren[i]+", ");
		}
		System.out.println("");
	}
}
