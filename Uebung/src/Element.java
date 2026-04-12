/**
 * Knoten eines <b>binären Suchbaums</b> (Binary Search Tree, BST) mit
 * {@code int}-Werten.
 *
 * <p>Jeder Knoten kennt seinen Wert und hat je einen Verweis auf seinen
 * linken und rechten Teilbaum. Die <b>Suchbaum-Invariante</b> lautet:
 * <ul>
 *   <li>alle Werte im linken Teilbaum sind <b>kleiner</b> als der eigene Wert</li>
 *   <li>alle Werte im rechten Teilbaum sind <b>größer oder gleich</b> dem eigenen Wert</li>
 * </ul>
 *
 * <h2>Beispielbaum</h2>
 * <pre>
 *                    42
 *                   /  \
 *                  9    90
 *                 / \   / \
 *                8  14 …  222
 * </pre>
 *
 * <p>Die Klasse bietet die drei klassischen Baum-Traversierungen:
 * <ul>
 *   <li>{@link #preOrder()}   – Wurzel, dann links, dann rechts</li>
 *   <li>{@link #inOrder()}    – links, Wurzel, rechts (liefert <b>sortierte</b>
 *       Ausgabe bei einem BST!)</li>
 *   <li>{@link #postOrder()}  – links, rechts, Wurzel</li>
 * </ul>
 *
 * <h2>Lernziele</h2>
 * <ul>
 *   <li>Rekursive, selbstbezügliche Datenstruktur (Knoten enthalten Knoten)</li>
 *   <li>Invariante einhalten: beim Einfügen entscheidet der Vergleich, ob
 *       links oder rechts weiter gesucht wird</li>
 *   <li>Verschiedene Reihenfolgen bei der Traversierung – direkt sichtbar
 *       an der Ausgabe</li>
 *   <li>{@code static}-Felder als „globaler" Zustand über alle Knoten hinweg
 *       ({@link #maxdepth}, {@link #counter}) – hier bewusst als Beispiel für
 *       eine Einfach-Lösung, produktiv wäre das aber unschön, weil es nicht
 *       threadsicher und pro Baum nur einmal nutzbar ist.</li>
 * </ul>
 *
 * @see BuildTree – Beispielbaum, der diese Klasse benutzt
 * @see Knoten    – alternative, unabhängige Tree-Node-Klasse
 */
public class Element {

    /**
     * Größte bislang bei einem {@link #depth(int)}-Aufruf beobachtete Tiefe.
     * Wird statisch geführt, weil die Rekursion den Wert über viele
     * Methoden­aufrufe hinweg hochzählt.
     */
    static int maxdepth = 0;

    /** Zählt alle bei {@link #counter()} besuchten Knoten. */
    static int counter = 0;

    /** Nutzwert dieses Knotens. */
    public int value;

    /** Linker Teilbaum (kleinere Werte) oder {@code null}. */
    public Element left;

    /** Rechter Teilbaum (größere/gleich große Werte) oder {@code null}. */
    public Element right;

    /** Ungenutzt – Relikt einer früheren Version. */
    public int depth;

    /**
     * Erzeugt einen Blattknoten mit dem gegebenen Wert.
     *
     * @param n Nutzwert des neuen Knotens
     */
    Element(int n) {
        value = n;
        left  = null;
        right = null;
    }

    /**
     * Fügt einen Wert BST-konform in den Baum ein.
     *
     * <p>Vorgehen:
     * <ol>
     *   <li>Ist der einzufügende Wert {@code >=} dem eigenen Wert → nach rechts.</li>
     *   <li>Ist dort noch kein Knoten → hier einhängen.</li>
     *   <li>Sonst: rekursiv weitersuchen.</li>
     * </ol>
     * Analog für die linke Seite bei kleineren Werten.</p>
     *
     * @param value einzufügender Wert
     */
    public void insert(int value) {
        if (value >= this.value) {
            if (right == null) {
                right = new Element(value);
            } else {
                right.insert(value);
            }
        } else {
            if (left == null) {
                left = new Element(value);
            } else {
                left.insert(value);
            }
        }
    }

    /**
     * Berechnet die maximale Tiefe des Baums ab diesem Knoten.
     *
     * <p>Die Methode besucht rekursiv beide Teilbäume und erhöht einen
     * gemeinsamen Zähler {@link #maxdepth}, sobald eine neue Tiefe erreicht
     * wird. Der Parameter {@code depth} führt die aktuelle Rekursionstiefe
     * mit und ist <b>by-value</b>: jedes {@code depth++} wirkt nur lokal
     * und wird beim Rücksprung zurückgenommen – deswegen das
     * {@code depth--} am Ende jedes Zweigs.</p>
     *
     * @param depth aktuelle Tiefe bei Eintritt (beim Wurzelaufruf meist 0 oder 1)
     * @return die maximale beobachtete Tiefe
     */
    public int depth(int depth) {
        if (left != null) {
            depth++;
            if (depth > maxdepth) {
                maxdepth++;
            }
            left.depth(depth);
            depth--;
        }
        if (right != null) {
            depth++;
            if (depth > maxdepth) {
                maxdepth++;
            }
            right.depth(depth);
            depth--;
        }
        return maxdepth;
    }

    /** Druckt nur den eigenen Wert (einzeiliges „Debug"-Hilfsmittel). */
    public void show() {
        System.out.println("" + value);
    }

    /**
     * <b>Pre-Order</b>-Traversierung: erst die Wurzel, dann der linke,
     * zum Schluss der rechte Teilbaum.
     *
     * <p>Pre-Order wird typischerweise verwendet, um einen Baum zu
     * <b>serialisieren</b> (z. B. Kopieren oder Abspeichern), weil sich
     * der Baum aus einer Pre-Order-Sequenz zusammen mit der BST-Regel
     * direkt rekonstruieren lässt.</p>
     */
    public void preOrder() {
        System.out.print(value + " ");
        if (left  != null) left.preOrder();
        if (right != null) right.preOrder();
    }

    /**
     * <b>In-Order</b>-Traversierung: links, Wurzel, rechts.
     *
     * <p>Bei einem <b>binären Suchbaum</b> liefert In-Order die Werte
     * <b>aufsteigend sortiert</b> – das ist der didaktische „Wow-Moment":
     * ein BST kann zum Sortieren verwendet werden, indem man nur einfügt
     * und anschließend In-Order ausgibt.</p>
     */
    public void inOrder() {
        if (left != null) left.inOrder();
        System.out.print(value + " ");
        if (right != null) right.inOrder();
    }

    /**
     * <b>Post-Order</b>-Traversierung: links, rechts, Wurzel.
     *
     * <p>Post-Order wird oft zum <b>Freigeben</b> von Bäumen verwendet:
     * Kinder zuerst, Wurzel zuletzt – so hängt beim Löschen nie ein
     * „verlassenes" Kind in der Luft.</p>
     */
    public void postOrder() {
        if (left  != null) left.postOrder();
        if (right != null) right.postOrder();
        System.out.print(value + " ");
    }

    /**
     * Zählt alle Knoten ab diesem Knoten (inkl. diesen selbst).
     *
     * <p>Nutzt das statische {@link #counter}-Feld – Nebeneffekt: Mehrfach-
     * Aufrufe liefern die Summe aller bisher gezählten Knoten. Vor dem
     * Messen sollte {@code counter = 0;} gesetzt werden.</p>
     *
     * @return aktueller Wert des {@code counter}-Felds
     */
    public int counter() {
        counter++;
        if (left  != null) left.counter();
        if (right != null) right.counter();
        return counter;
    }
}
