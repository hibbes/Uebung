import java.util.ArrayList;


public class List2 {
	
			
	public static void main(String[] args) {
		ArrayList<Integer> lottozahlen = new ArrayList<Integer>();
						
		lottozahlen.add(1);
		lottozahlen.add(17);
		lottozahlen.add(25);
		lottozahlen.add(30);
		lottozahlen.add(31);
		lottozahlen.add(33);
		
		System.out.println(lottozahlen.contains(12));
		System.out.println(lottozahlen.contains(31));
		System.out.println(lottozahlen.size());
		
		
		lottozahlen.remove((Integer)1);
		
		for(int ausgabe : lottozahlen)
		{
			System.out.println(ausgabe);
		}
		
	}

}
