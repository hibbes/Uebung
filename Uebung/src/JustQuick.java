import java.util.Random;

public class JustQuick {
	
	static int[] numb;

	public static void main(String[] args) {
		Random rand = new Random();
		int  n = 100;
		
		numb = new int[n];
		
		for (int i = 0; i < n; i++) {
			numb[i] = rand.nextInt(100);
		}
		
		final long timeStart = System.nanoTime(); 
	
		quickSort(0, n-1);
		
		final long timeEnd = System.nanoTime(); 
        System.out.println("Verlaufszeit der Schleife: " + ((timeEnd - timeStart)/1000) + " µs."); 
		
		
		for (int c : numb) {
			System.out.print(c + " ");
		}
		
		
         
        
		

	}
	
	static int i;
	static int j;
	static int pivot;
	static int cache;
	
	public static int teile(int links, int rechts){
		
		i = links;
		j = rechts-1;
		pivot = numb[rechts];
		
		do{
			
			while (numb[i] <= pivot && i < rechts) {
				i += 1;
			}
			
			while (numb[j] >= pivot && j > links) {
				j -= 1;
			}
			
			if(i < j){
				cache = numb[i];
				numb [i] = numb[j];
				numb [j] = cache;
			}
			
		}while(i < j);
		
		if(numb[i] > pivot){
			cache = numb[i];
			numb [i] = numb[rechts];
			numb [rechts] = cache;
		}
		
		return i;
	}
	
	static int teiler;
	
	public static void quickSort(int links, int rechts){
		if(links < rechts){
			teiler = teile(links, rechts);
			quickSort(links, teiler-1);
	        quickSort(teiler+1, rechts);
		}
	}

}
