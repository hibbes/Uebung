
public class Test {

	public static void main(String[] args) {
		ListenElement element1 = new ListenElement(4);
		ListenElement element2 = new ListenElement(42);
		Stack stack = new Stack(3);
		stack.push(5);
		System.out.println("Größe: "+stack.getGroesse());
		
		try {
			stack.top();}catch (Exception e) {
				
				System.out.println("Der Stapel ist leer!");
			}
		
		try {
			stack.pop();}catch (Exception e) {
				
				System.out.println("Der Stapel ist leer!");
			}
		
		System.out.println("Größe: "+stack.getGroesse());
		try {
			stack.pop();}catch (Exception e) {
				
				System.out.println("Der Stapel ist leer!");
			}
		
		try {
			stack.pop();}catch (Exception e) {
				
				System.out.println("Der Stapel ist leer!");
			}
		
		try {
			stack.top();}catch (Exception e) {
				
				System.out.println("Der Stapel ist leer!");
			}
		
		
	/*	Liste liste = new Liste(3);
		liste.add(5);
		liste.add(7);
		liste.add(999);
		liste.add(1001);
		System.out.println(liste);
		System.out.println(liste.getGroesse()); */
	}
}
		
