import java.util.ArrayList;
import java.util.ListIterator;


public class List3 {
	
			
	public static void main(String[] args) {
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
						
		for(int i = 10; i<=1000; i+=10){
			zahlen.add(i);
		}
		
		for(int ausgabe : zahlen)
		{
			System.out.println(ausgabe);
		}
		
		ListIterator<Integer> li = zahlen.listIterator();
		 
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
