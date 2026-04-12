import java.util.Random;

/**
 * <b>Quicksort</b> auf einem {@code int}-Array.
 *
 * <p>Quicksort ist ein klassischer <b>Divide-&amp;-Conquer-Sortier­algorithmus</b>:
 * <ol>
 *   <li><b>Pivot wählen</b> – hier schlicht das rechte Element des Bereichs.</li>
 *   <li><b>Partitionieren</b> ({@link #teile}) – alle Elemente {@code &lt;} Pivot
 *       nach links, alle {@code &gt;} Pivot nach rechts. Das Pivot steht danach
 *       an seiner endgültigen Position.</li>
 *   <li><b>Rekursion</b> – Quicksort wird getrennt auf den linken und rechten
 *       Teilbereich angewendet ({@link #quickSort}).</li>
 * </ol>
 *
 * <h2>Laufzeit</h2>
 * <ul>
 *   <li><b>Durchschnitt:</b> O(n · log n)</li>
 *   <li><b>Worst Case:</b> O(n²) – tritt auf, wenn das Pivot immer das
 *       kleinste oder größte Element ist (z. B. bei bereits sortierten
 *       Eingaben und Pivot=rechts, wie hier).</li>
 *   <li><b>Speicher:</b> O(log n) durch die Rekursionstiefe.</li>
 * </ul>
 *
 * <h2>Lernziele</h2>
 * <ul>
 *   <li>Divide &amp; Conquer als Entwurfsprinzip</li>
 *   <li>In-Place-Algorithmus – kein zusätzliches Array nötig</li>
 *   <li>Zusammenspiel zweier Zeiger ({@code i} läuft von links, {@code j}
 *       von rechts) beim Partitionieren</li>
 *   <li>Laufzeitmessung mit {@link System#nanoTime()}</li>
 * </ul>
 *
 * <p><b>Hinweis zum Stil:</b> Die Variablen {@code i}, {@code j}, {@code pivot},
 * {@code cache} und {@code teiler} sind hier aus didaktischen Gründen
 * statisch – so kann man in der Bildschirm-Erklärung auf denselben Namen
 * verweisen und die Arbeitsweise live im Debugger ansehen. In echtem
 * Produktionscode würde man diese als lokale Variablen halten, damit die
 * Methoden thread-sicher sind.</p>
 */
public class JustQuick {

    /** Zu sortierendes Array – statisch, damit alle Methoden ohne Parameter-
     *  reichen darauf zugreifen können. */
    static int[] numb;

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;

        numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = rand.nextInt(100);
        }

        final long timeStart = System.nanoTime();

        // Eigentlicher Quicksort-Aufruf auf dem gesamten Array [0, n-1]
        quickSort(0, n - 1);

        final long timeEnd = System.nanoTime();
        System.out.println("Laufzeit: " + ((timeEnd - timeStart) / 1000) + " µs.");

        for (int c : numb) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // ── Hilfsvariablen (siehe Javadoc oben) ──────────────────────────────
    static int i;
    static int j;
    static int pivot;
    static int cache;

    /**
     * Partitioniert den Bereich {@code [links, rechts]} an einem Pivot.
     *
     * <p>Das Pivot ist hier fest das <b>rechteste</b> Element. Zwei Zeiger
     * laufen aufeinander zu:
     * <ul>
     *   <li>{@code i} von links, solange {@code numb[i] <= pivot}</li>
     *   <li>{@code j} von rechts, solange {@code numb[j] >= pivot}</li>
     * </ul>
     * Wenn beide „blockieren", werden die zugehörigen Elemente getauscht.
     * Das wiederholt sich, bis sich {@code i} und {@code j} kreuzen.
     * Zum Schluss wird das Pivot mit {@code numb[i]} getauscht – dadurch
     * landet das Pivot endgültig an seiner richtigen Stelle.</p>
     *
     * @param links  Startindex (inklusive)
     * @param rechts Endindex (inklusive); {@code numb[rechts]} dient als Pivot
     * @return endgültiger Index des Pivots – alles links davon ist {@code <=},
     *         alles rechts davon {@code >=}
     */
    public static int teile(int links, int rechts) {
        i = links;
        j = rechts - 1;
        pivot = numb[rechts];

        do {
            // i nach rechts schieben, solange links vom Pivot noch kleinere Werte stehen
            while (numb[i] <= pivot && i < rechts) {
                i += 1;
            }
            // j nach links schieben, solange rechts vom Pivot noch größere Werte stehen
            while (numb[j] >= pivot && j > links) {
                j -= 1;
            }
            // Haben sich die Zeiger noch nicht gekreuzt, ist ein Tausch fällig
            if (i < j) {
                cache   = numb[i];
                numb[i] = numb[j];
                numb[j] = cache;
            }
        } while (i < j);

        // Pivot an seine endgültige Position bringen
        if (numb[i] > pivot) {
            cache       = numb[i];
            numb[i]     = numb[rechts];
            numb[rechts] = cache;
        }
        return i;
    }

    /** Index, an dem das letzte Partitionieren das Pivot abgelegt hat. */
    static int teiler;

    /**
     * Rekursiver Quicksort auf dem Bereich {@code [links, rechts]}.
     *
     * <p>Rekursionsanker: ein Bereich mit 0 oder 1 Elementen
     * ({@code links >= rechts}) gilt als bereits sortiert.</p>
     */
    public static void quickSort(int links, int rechts) {
        if (links < rechts) {
            teiler = teile(links, rechts);
            quickSort(links, teiler - 1);
            quickSort(teiler + 1, rechts);
        }
    }
}
