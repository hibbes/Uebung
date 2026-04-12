# Uebung

Sammelprojekt mit Informatik-Übungen aus dem Unterricht – eine **kuratierte Sammlung** kleiner Java-Klassen, die jeweils ein Konzept, einen Algorithmus oder eine Aufgabe isoliert behandeln. Gedacht als Steinbruch für Unterrichtsbeispiele, nicht als zusammenhängende Anwendung.

Alle Klassen sind didaktisch kommentiert und haben eine eigene `main`-Methode (sofern sinnvoll), sodass sie unabhängig voneinander lauffähig sind.

## Themenbereiche

### Datenstrukturen

| Datei | Thema |
|-------|-------|
| `Liste.java`, `ListenElement.java` | Einfach verkettete Liste, rekursiv |
| `Element.java` / `Knoten.java` | Knoten eines binären (Such-)Baums |
| `Baum.java`, `BuildTree.java` | Binärbaum: Aufbau und Traversierungen (Pre/In/Post) |
| `ArrayQueue.java`, `Queue.java` | Warteschlange (FIFO) – Array- und Listen-Variante |
| `ArrayStack.java`, `StackUebung.java` | Stapel (LIFO) – Array- und Listen-Variante |
| `BuildPQueue.java`, `Notruf.java` | Priority Queue am Beispiel Notrufzentrale |

### Sortieralgorithmen

| Datei | Algorithmus | Laufzeit |
|-------|-------------|----------|
| `BubbleSort.java` | Bubble Sort – Nachbarn vertauschen | O(n²) |
| `SelectionSort.java` | Selection Sort – kleinstes Element suchen | O(n²) |
| `JustQuick.java` | Quicksort – Divide & Conquer | O(n log n) Ø |
| `Arrays.java` | Hilfsmethoden für Array-Ausgabe & -Erzeugung | – |

### Klassische Algorithmen & Probleme

| Datei | Problem |
|-------|---------|
| `Hanoi.java`, `TuermeVonHanoi.java` | Türme von Hanoi – einfacher + Stack-visualisierter Ansatz |
| `Rucksackproblem.java` | Rucksackproblem (0/1-Knapsack) |
| `Potenz.java` | Schnelle Exponentiation |
| `Lotto.java` | 6 aus 49 ohne Wiederholung |
| `Uebung.java` | Sieb des Eratosthenes (Primzahlgenerierung) |

### Aufgaben & Fallbeispiele

| Datei | Aufgabe |
|-------|---------|
| `Gluecksspiel.java` | Simulation eines Glücksspiels |
| `Kreditkarte.java` | Kreditkartenprüfziffer (Luhn-Algorithmus) |
| `Notruf.java` | Einfache Objektklasse mit Prioritätsfeld |
| `Wind.java` | Windrichtungen / Beaufort-Skala |

## Nutzung

Eclipse-Projekt. Jede Klasse liegt im `src/`-Ordner und lässt sich direkt im Package-Explorer öffnen und ausführen. Kommandozeile alternativ:

```bash
cd Uebung
javac -d build src/*.java
java -cp build JustQuick          # oder eine andere Klasse mit main-Methode
```

## Zum Charakter des Projekts

Ursprünglich eine über mehrere Schuljahre gewachsene „Spielwiese" mit Dubletten und Fragmenten – im Aprill 2026 aufgeräumt:
- offensichtliche Duplikate entfernt (`JustBubble`/`JustSelect` als Kopien der Hauptsorte, `List`/`List2`/`List3` als trivialer ArrayList-Demos, `Lottozahlen` als Kopie von `Lotto`, `Test.java` als Scratch-Datei)
- verbliebene Klassen mit durchgehenden Javadoc-Kommentaren versehen
- kleinere Bugs gefixt (z. B. `Queue.enqueue/dequeue`, `Hanoi`-Scheibenzahl)

Für aufgeräumte, didaktisch fokussierte Einzelprojekte siehe z. B.:
- [Schneckenrennen](https://github.com/hibbes/Schneckenrennen) – OOP-Einführung
- [Uebung_HundeObjekt](https://github.com/hibbes/Uebung_HundeObjekt) – Vererbung
- [zahlenRaten](https://github.com/hibbes/zahlenRaten) – Binäre Suche
- [Listen](https://github.com/hibbes/Listen) – einfach verkettete Liste als Minimalbeispiel

## Kontext

Unterrichtsmaterial Informatik (Schiller-Gymnasium Offenburg).
