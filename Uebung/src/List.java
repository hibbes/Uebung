import java.util.ArrayList;


public class List {
	
			
	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("Deutsch");
		liste.add("Englisch");
		liste.add("Geographie");
		
		for(int i=0; i<liste.size(); i++){
			System.out.println(liste.get(i));}
		
		liste.remove(0);
		liste.add(0, "Leibesübungen");

		for(int i=0; i<liste.size(); i++){
			System.out.println(liste.get(i));}
		
	}

}
