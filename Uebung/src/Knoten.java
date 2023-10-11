public class Knoten {
   private Knoten linkesKind;
   private Knoten rechtesKind;
   private int wert;

   public Knoten(int wert){     
    this.wert=wert;
    this.linkesKind = null;
    this.rechtesKind = null;
   }

   
}
