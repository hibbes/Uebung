
public class Lottozahlen {

	public static void main(String[] args) {

		boolean[] lottozahlen = new boolean[49];
		int ziehung;
		int superzahl = (int) (Math.random() * 8) + 1;

		for (int i = 0; i < 6; i++) {
			do {
				ziehung = (int) (Math.random() * 48) + 1;
				
			} while (lottozahlen[ziehung]);

			lottozahlen[ziehung] = true;
		}

		for (int i = 0; i < lottozahlen.length; i++) {
			if (lottozahlen[i]) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nSuperzahl "+ superzahl);

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int j = 2; while(true) { boolean isPrime = true;
		 * 
		 * for (int i = 2; i <= Math.sqrt(j) && isPrime; i++) { if (j % i == 0)
		 * { isPrime = false; } } if (isPrime) { System.out.println(j);
		 * 
		 * } j++; }
		 */
	}

}
