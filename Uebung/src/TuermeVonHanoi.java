import java.util.*;

public class TuermeVonHanoi {

    public static void main(String args[]) {
        int hoehe = 3;
        Stack<Integer> A = new Stack<Integer>();
        Stack<Integer> B = new Stack<Integer>();
        Stack<Integer> C = new Stack<Integer>();

        for (int i = hoehe; i >= 1; i--) {
            A.push(i);
        }

        System.out.println("Ausgangsturm: " + A);
        System.out.println("Hilfsturm: " + B);
        System.out.println("Zielturm: " + C);
        System.out.println("-------------");

        // Aufruf der rekursiven Methode, um die Scheiben zu bewegen
        bewegeScheiben(hoehe, A, B, C);

        System.out.println("Ausgangsturm: " + A);
        System.out.println("Hilfsturm: " + B);
        System.out.println("Zielturm: " + C);
    }

    public static void bewegeScheiben(int hoehe, Stack<Integer> quelle, Stack<Integer> hilfs, Stack<Integer> ziel) {

        int obersteScheibe;
        if (hoehe == 1) { // Schritt 2 - Rekursionsanker: Wenn Problemgroesse 1, verschiebe von Quelle
                          // nach Ziel
            obersteScheibe = quelle.pop();
            ziel.push(obersteScheibe);
            System.out.println("Verschiebe Scheibe " + obersteScheibe + " von " + quelle + " nach " + ziel);
        } else {
            // Schritt 1: Verschiebe n-1 Scheiben vom Quellturm auf den Hilfsturm
            bewegeScheiben(hoehe - 1, quelle, ziel, hilfs);
            obersteScheibe = quelle.pop();
            ziel.push(obersteScheibe);
            System.out.println("Verschiebe Scheibe " + obersteScheibe + " von " + quelle + " nach " + ziel);
            // Schritt 3: Verschiebe n-1 Scheiben vom Hilfsturm auf den Zielturm
            bewegeScheiben(hoehe - 1, hilfs, quelle, ziel);
        }

    }
}

/*
 * 1. bewegeScheiben(3,A,B,C)
 * 2. bewegeScheiben(2,A,C,B)
 * 3. bewegeScheiben(1,A,B,C)
 * a) Verschiebe 1 von A nach C
 * b) Verschiebe 2 von A nach B
 * 4. bewegeScheiben(1,C,A,B)
 * c) Verschiebe 1 von C zu B
 * d) Verschiebe 3 von A zu C
 * 5. bewegeScheiben(2,B,A,C)
 * 6. bewegeScheiben(1,B,C,A)
 * e) Verschiebe 1 von B zu A
 * f) Verschiebe 2 von B zu C
 * 7. bewegeScheiben(1,A,B,C)
 * g) Verschiebe 1 von A zu C
 */