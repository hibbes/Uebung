/**
 * Baut einen festen Beispiel-{@link Element Baum} auf, an dem sich die
 * BST-Operationen (Einfügen, Tiefe, Traversierungen) bequem ausprobieren
 * lassen.
 *
 * <p>Der Konstruktor erzeugt folgenden Baum:
 * <pre>
 *                 42
 *                /  \
 *               9    90
 *              / \   / \
 *             8  14 …  222
 *                / \    \
 *              …   …   569
 *                         \
 *                          98? (je nach Einfügereihenfolge)
 * </pre>
 * (Genaue Form hängt vom Eingabe-Muster ab – Werte werden in der
 * unten stehenden Reihenfolge eingefügt.)</p>
 *
 * <h2>Beispielnutzung</h2>
 * <pre>
 * BuildTree b = new BuildTree();
 * System.out.println("Tiefe: " + b.root.depth(0));
 * b.root.preOrder();   System.out.println();
 * b.root.inOrder();    System.out.println();  // sortiert!
 * b.root.postOrder();  System.out.println();
 * </pre>
 *
 * @see Element
 */
public class BuildTree {

    /** Wurzel des aufgebauten Baums. */
    Element root;

    /**
     * Erzeugt einen festen Beispielbaum. Die Einfügereihenfolge beeinflusst
     * die Form des Baums – hier bewusst eine gemischte Folge, damit der
     * Baum nicht entartet (sonst wäre er eine Liste).
     */
    public BuildTree() {
        root = new Element(42);

        root.insert(9);
        root.insert(8);
        root.insert(14);
        root.insert(90);
        root.insert(222);
        root.insert(569);
        root.insert(98);
    }
}
