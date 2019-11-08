
public class Lottozahlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ziehung = new int[7];
		boolean treffer;

		System.out.println("Die Lottozahlen 1:");
		for (int i = 0; i < ziehung.length; i++) {
			ziehung[i] = (int) (Math.random() * 48) + 1;
			System.out.println(ziehung[i]);
		}

	/*	boolean[] ziehungnew = new boolean[48];

		for (int i = 0; i < 7; i++) {
			treffer = false;

			int zahl = (int) (Math.random() * 48) + 1;

			for (int j = 0; treffer && j < ziehungnew.length; j++) {
				if (j == zahl) {
					ziehungnew[j] = true;
				}
			}
		} */
	}
}
