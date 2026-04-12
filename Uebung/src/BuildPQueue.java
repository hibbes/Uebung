import java.util.ArrayList;

/**
 * <b>Priority Queue</b> auf Basis einer sortierten {@link ArrayList}.
 *
 * <p>Eine Prioritäts­warteschlange verhält sich wie eine Warteschlange,
 * entfernt beim {@link #delete()} aber nicht „das älteste" Element, sondern
 * das <b>mit der höchsten Priorität</b>. Typisches Anwendungsbeispiel:
 * Notrufzentrale – ein Schlaganfall (hohe Priorität) wird vor einem
 * Schnittfinger (niedrige Priorität) bedient, unabhängig davon, wer
 * zuerst angerufen hat.</p>
 *
 * <h2>Implementierungs­idee</h2>
 * <p>Die Liste wird beim Einfügen so einsortiert, dass das Element mit
 * der <b>höchsten</b> Priorität immer an Index 0 steht. {@link #max()}
 * ist damit in O(1), {@link #insert(Notruf)} aber in O(n), weil im
 * schlechtesten Fall die ganze Liste durchsucht werden muss.</p>
 *
 * <p>Alternative Implementierungen: ein <b>Binary Heap</b> (insert &amp;
 * delete in O(log n)) oder die bereits fertige {@link java.util.PriorityQueue}
 * aus der Java-Standard­bibliothek.</p>
 *
 * <h2>Lernziele</h2>
 * <ul>
 *   <li>Unterschied zwischen FIFO-Queue und Priority Queue</li>
 *   <li>Einsortieren in eine bereits sortierte Liste (insertion sort-Schritt)</li>
 *   <li>Sonder­fälle bei Sammlungen: leere Liste, Element kleiner als alle</li>
 * </ul>
 *
 * @see Notruf
 */
public class BuildPQueue {

    /**
     * Interne Speicherung der Elemente, absteigend nach Priorität sortiert.
     * Index 0 = höchste Priorität.
     */
    ArrayList<Notruf> pqueue;

    /** Erzeugt eine leere Priority Queue. */
    public BuildPQueue() {
        pqueue = new ArrayList<Notruf>();
    }

    /**
     * Fügt einen {@link Notruf} so ein, dass die Liste nach Priorität
     * absteigend sortiert bleibt.
     *
     * <p>Vorgehen: von links nach rechts durch die Liste laufen und beim
     * ersten Element mit <b>kleinerer oder gleicher</b> Priorität einhängen.
     * Wird keine solche Stelle gefunden, ist der neue Notruf das
     * prioritätsschwächste und wird ans Ende gehängt.</p>
     *
     * @param notruf der einzufügende Notruf
     */
    public void insert(Notruf notruf) {
        // Sonderfall: Liste leer → einfach hinzufügen
        if (pqueue.isEmpty()) {
            pqueue.add(notruf);
            return;
        }

        // Erste Position suchen, an der der neue Notruf höhere Priorität hat
        for (int i = 0; i < pqueue.size(); i++) {
            if (notruf.prio >= pqueue.get(i).prio) {
                pqueue.add(i, notruf);   // davor einhängen → Reihenfolge bleibt sortiert
                return;
            }
        }

        // Schleife durchgelaufen → neuer Notruf ist der prioritätsschwächste
        pqueue.add(notruf);
    }

    /** Gibt alle Notrufe in Prioritätsreihenfolge aus. */
    public void showAll() {
        for (int i = 0; i < pqueue.size(); i++) {
            System.out.println(pqueue.get(i));
        }
    }

    /** Entfernt den Notruf mit der höchsten Priorität (Index 0). */
    public void delete() {
        pqueue.remove(0);
    }

    /**
     * @return den Notruf mit der höchsten Priorität (ohne ihn zu entfernen)
     */
    public Notruf max() {
        return pqueue.get(0);
    }

    /** @return {@code true}, wenn die Warteschlange leer ist */
    public boolean empty() {
        return pqueue.isEmpty();
    }
}
