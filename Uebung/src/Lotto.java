import java.util.*;                   // Collection-Klassen

/**
 * Lotto mit HashSet<Integer>
 */
public class Lotto
{
  public static void main( String[] args)
  {
    Set<Integer> set = new HashSet<Integer>();   // HashSet
    int doppelt = 0;

    while( set.size() < 6)      // Erzeugen der Lottozahlen
    {
      int num = ( int)( Math.random() * 49) + 1;
      if( !set.add( num)) doppelt++;
    }

                                 // Ausgabe der Lottozahlen
    for( Integer n: set) System.out.println( n);
    System.out.println( "Duplikate: " + doppelt);
  }
}