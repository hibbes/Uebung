
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
