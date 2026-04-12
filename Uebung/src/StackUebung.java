/**
 * <b>Stack (LIFO-Stapel)</b> auf Basis einer verketteten
 * {@link ListenElement}-Liste.
 *
 * <p>Ein Stack folgt dem Prinzip „last in, first out": das <b>zuletzt</b>
 * eingefügte Element wird als <b>erstes</b> wieder entfernt – wie ein
 * Tellerstapel. Die beiden Grundoperationen heißen traditionell:
 * <ul>
 *   <li>{@link #push(int)} – neues Element oben drauflegen</li>
 *   <li>{@link #pop()}     – oberstes Element herunternehmen</li>
 * </ul>
 *
 * <h2>Implementierung</h2>
 * <p>Neue Elemente werden immer <b>vor</b> den aktuellen Kopf gehängt.
 * Damit laufen sowohl {@code push} als auch {@code pop} in konstanter
 * Zeit (O(1)) – viel effizienter, als wenn man hinten einfügen würde
 * (O(n) bei einer einfach verketteten Liste ohne Tail-Zeiger).</p>
 *
 * <h2>Typische Anwendungen</h2>
 * <ul>
 *   <li>Rückgängig-Funktionen in Editoren (Undo)</li>
 *   <li>Aufrufstack bei Methodenaufrufen (daher der Name „Stack" bei
 *       {@link StackOverflowError})</li>
 *   <li>Klammerprüfung, Syntaxparser</li>
 *   <li>Tiefensuche (Depth-First Search)</li>
 * </ul>
 *
 * @see Queue        – FIFO-Pendant
 * @see ArrayStack   – alternative Array-basierte Implementierung
 */
public class StackUebung {

    /** Oberstes Element des Stacks. {@code null}, wenn der Stack leer ist. */
    private ListenElement kopf;

    /** Erzeugt einen leeren Stack. */
    public StackUebung() {
        this.kopf = null;
    }

    /**
     * Erzeugt einen Stack mit einem einzelnen Element.
     *
     * @param wert Inhalt des ersten Elements
     */
    public StackUebung(int wert) {
        this.kopf = new ListenElement(wert);
    }

    /**
     * Legt ein neues Element oben auf den Stack.
     *
     * <p>Das alte Kopfelement wird als Nachfolger des neuen Elements
     * eingehängt, anschließend zeigt {@code kopf} auf das neue Element –
     * konstante Zeit O(1).</p>
     *
     * @param wert einzufügender Wert
     */
    public void push(int wert) {
        ListenElement neu = new ListenElement(wert);
        neu.next = kopf;
        kopf = neu;
    }

    /**
     * Entfernt und druckt das oberste Element.
     *
     * @throws Exception wenn der Stack leer ist
     */
    public void pop() throws Exception {
        if (kopf == null) {
            throw new Exception("Stack ist leer");
        }
        System.out.println(kopf.getInhalt());
        kopf = kopf.next;
    }

    /**
     * @return {@code true}, wenn der Stack leer ist
     */
    public boolean isEmpty() {
        return kopf == null;
    }

    /**
     * Gibt das oberste Element aus, ohne es zu entfernen.
     *
     * @throws Exception wenn der Stack leer ist
     */
    public void top() throws Exception {
        if (kopf == null) {
            throw new Exception("Stack ist leer");
        }
        System.out.println(kopf.getInhalt());
    }

    /**
     * @return Anzahl der Elemente im Stack
     */
    public int getGroesse() {
        if (kopf == null) {
            return 0;
        }
        return kopf.getGroesse(0);
    }
}
