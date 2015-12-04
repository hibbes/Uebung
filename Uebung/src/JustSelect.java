import java.util.Random;

public class JustSelect {

	public static void main(String[] args) {

		Random rand = new Random();
		int  n = 100;
		
		int[] numb = new int[n];
		
		for (int i = 0; i < n; i++) {
			numb[i] = rand.nextInt(40);
		}
		
		
		
		int min;
		int cache;
		
		final long timeStart = System.nanoTime(); 
		
		for (int i = 0; i < numb.length; i++) {
			min = i;
			for (int j = i+1; j < numb.length; j++) {
				if(numb[j] <= numb[min]){
					min = j;
				}
			}
			cache = numb[min];
			numb[min] = numb[i];
			numb[i] = cache;
			
		}
		
		final long timeEnd = System.nanoTime(); 
        System.out.println("Verlaufszeit der Schleife: " + ((timeEnd - timeStart)/1000) + " µs."); 
		
		
		for (int i : numb) {
			System.out.print(i + " ");
		}
	}
	
	
	

}
