/**
 * <b>Queue (FIFO-Warteschlange)</b> auf Basis einer verketteten
 * {@link ListenElement}-Liste.
 *
 * <p>Eine Queue folgt dem Prinzip „first in, first out": das <b>zuerst</b>
 * eingefügte Element wird als <b>erstes</b> wieder entfernt – wie an einer
 * Supermarktkasse. Die beiden Grundoperationen heißen traditionell:
 * <ul>
 *   <li>{@link #enqueue(int)}  – neues Element <b>hinten</b> anstellen</li>
 *   <li>{@link #dequeue()}     – erstes Element <b>vorne</b> entfernen</li>
 * </ul>
 *
 * <h2>Implementierung</h2>
 * <p>{@code kopf} zeigt auf den Anfang (das „nächste dran" wartende Element).
 * Neue Elemente werden ans Ende der verketteten Liste angehängt. Das ist
 * für {@code enqueue} O(n) (weil die Liste bis zum Ende durchlaufen werden
 * muss). Eine produktive Variante würde zusätzlich einen Tail-Zeiger
 * pflegen und beides in O(1) anbieten.</p>
 *
 * <h2>Unterschied zum Stack</h2>
 * <p>Identischer Datentyp, aber entgegen­gesetzte Reihenfolge: der Stack
 * ({@link StackUebung}) arbeitet nach LIFO und entfernt immer das
 * zuletzt hinzugefügte Element.</p>
 *
 * @see StackUebung
 * @see ArrayQueue – alternative Array-basierte Implementierung
 */
public class Queue {

    /** Vorderstes Element der Queue – {@code null}, wenn leer. */
    private ListenElement kopf;

    /**
     * Erzeugt eine leere Queue.
     */
    public Queue() {
        this.kopf = null;
    }

    /**
     * Erzeugt eine Queue mit genau einem Startelement.
     *
     * @param wert Inhalt des Startelements
     */
    public Queue(int wert) {
        this.kopf = new ListenElement(wert);
    }

    /**
     * Fügt einen Wert am <b>Ende</b> der Queue ein (anstellen).
     *
     * @param wert einzufügender Wert
     */
    public void enqueue(int wert) {
        ListenElement neu = new ListenElement(wert);
        if (kopf == null) {
            kopf = neu;
        } else {
            kopf.add(neu);   // rekursiv bis zum Ende
        }
    }

    /**
     * Entfernt das <b>vorderste</b> Element der Queue.
     *
     * @throws Exception wenn die Queue leer ist
     */
    public void dequeue() throws Exception {
        if (kopf == null) {
            throw new Exception("Queue ist leer");
        }
        kopf = kopf.next;   // Kopf-Zeiger rückt einen weiter
    }

    /**
     * Gibt das vorderste Element aus, ohne es zu entfernen.
     *
     * @throws Exception wenn die Queue leer ist
     */
    public void top() throws Exception {
        if (kopf == null) {
            throw new Exception("Queue ist leer");
        }
        System.out.println(kopf.getInhalt());
    }

    /**
     * @return Anzahl der Elemente in der Queue
     */
    public int getGroesse() {
        if (kopf == null) {
            return 0;
        }
        return kopf.getGroesse(0);
    }
}
