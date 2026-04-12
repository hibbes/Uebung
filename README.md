# Uebung

Sammelprojekt mit Informatik-Übungen aus dem Unterricht – **gewachsenes Sammelsurium** an kleinen Java-Klassen, die jeweils ein Konzept, einen Algorithmus oder eine Aufgabe isoliert behandeln. Gedacht als Steinbruch für Unterrichtsbeispiele, nicht als zusammenhängende Anwendung.

## Themenbereiche

### Datenstrukturen

| Datei | Thema |
|-------|-------|
| `Liste.java`, `ListenElement.java` | Einfach verkettete Liste (rekursiv) |
| `List.java`, `List2.java`, `List3.java` | Alternative Listenimplementierungen / Varianten |
| `Element.java`, `Knoten.java` | Basisknoten für verkettete Strukturen |
| `Baum.java`, `BuildTree.java` | Binärbaum: Aufbau und Traversierung |
| `ArrayQueue.java`, `Queue.java` | Warteschlange (FIFO) – Array- und verkettete Variante |
| `ArrayStack.java`, `StackUebung.java` | Stapel (LIFO) – Array-basiert |
| `BuildPQueue.java` | Priority Queue |

### Sortieralgorithmen

| Datei | Algorithmus |
|-------|-------------|
| `BubbleSort.java`, `JustBubble.java` | Bubble Sort – Nachbarn vertauschen |
| `SelectionSort.java`, `JustSelect.java` | Selection Sort – kleinstes Element suchen |
| `JustQuick.java` | Quicksort – Divide & Conquer |
| `Arrays.java` | Array-Hilfsmethoden, Grundlage für die Sortierübungen |

### Klassische Algorithmen / Probleme

| Datei | Problem |
|-------|---------|
| `Hanoi.java`, `TuermeVonHanoi.java` | Türme von Hanoi (Rekursion) |
| `Rucksackproblem.java` | Rucksackproblem |
| `Potenz.java` | Schnelle Exponentiation |
| `Lotto.java`, `Lottozahlen.java` | Zufallszahlen ohne Wiederholung |

### Aufgaben / Fallbeispiele

| Datei | Aufgabe |
|-------|---------|
| `Gluecksspiel.java` | Simulation eines Glücksspiels |
| `Kreditkarte.java` | Kreditkartenprüfziffer / IBAN-artige Aufgabe |
| `Notruf.java` | Einfache Fallunterscheidung |
| `Wind.java` | Windrichtungen / Beaufort-Skala |

### Sonstiges

| Datei | Zweck |
|-------|-------|
| `Test.java`, `Uebung.java` | Sammel-`main` und Ad-hoc-Tests |
| `HelloWorld.py` | Einziges Python-File im Projekt – „geht auch anders" |

## Nutzung

Eclipse-Projekt. Jede Klasse hat (meist) ihre eigene `main`-Methode und ist unabhängig lauffähig. Zum gezielten Ausprobieren einzelne Datei im Package-Explorer öffnen und ausführen.

## Charakter des Projekts

Dies ist **kein** aufgeräumtes Lehrbuch-Repository: es enthält Dubletten (`List` / `List2` / `List3`), Experimente, Fragmente und unterschiedliche Coding-Stile aus verschiedenen Unterrichtsphasen. Wer etwas Bestimmtes sucht, nutzt am besten die obige Übersicht oder die Eclipse-Suche.

Für aufgeräumte, didaktisch fokussierte Einzelprojekte siehe z. B.:
- [Schneckenrennen](https://github.com/hibbes/Schneckenrennen) – OOP-Einführung
- [Uebung_HundeObjekt](https://github.com/hibbes/Uebung_HundeObjekt) – Vererbung
- [zahlenRaten](https://github.com/hibbes/zahlenRaten) – Binäre Suche

## Kontext

Unterrichtsmaterial Informatik (Schiller-Gymnasium Offenburg) – über mehrere Schuljahre gewachsene Übungssammlung.
