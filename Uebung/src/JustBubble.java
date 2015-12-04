import java.util.Random;

public class JustBubble {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int  n = 100;
		
		int[] numb = new int[n];
		
		for (int i = 0; i < n; i++) {
			numb[i] = rand.nextInt(40);
		}
		
		int cache;
		
		final long timeStart = System.nanoTime(); 
		
		for (int x = 0; x < numb.length; x++) {
			for (int y = 0; y < numb.length; y++) {
				if(y < numb.length-1){
					if(numb[y] > numb[y+1]){
						cache = numb[y];
						numb[y] = numb[y+1];
						numb[y+1] = cache;
					}
				}
			}
		}
		
		final long timeEnd = System.nanoTime(); 
        System.out.println("Verlaufszeit der Schleife: " + ((timeEnd - timeStart)/1000) + " µs."); 
		
		
		for (int c : numb) {
			System.out.print(c + " ");
		}
	}

}

