public class Baum {
    public Knoten wurzel;

    public Baum() {
        this.wurzel = null;
    }

    public Baum(Knoten knoten) {
        this.wurzel = knoten;
    }

    public int suche(int wert) {
        return wurzel.suche(wert);
    }

    public static void main(String[] args) {
        Baum b1 = new Baum(new Knoten(5));
        b1.wurzel.linkesKind = new Knoten(3);
        b1.wurzel.linkesKind.linkesKind = new Knoten(1);
        b1.wurzel.rechtesKind = new Knoten(7);
        b1.wurzel.rechtesKind.rechtesKind = new Knoten(11);
        System.out.println(b1.suche(99));

    }
}
