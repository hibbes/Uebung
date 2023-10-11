public class Knoten {
   public Knoten linkesKind;
   public Knoten rechtesKind;
   public int wert;

   public Knoten(int wert) {
      this.wert = wert;
      this.linkesKind = null;
      this.rechtesKind = null;
   }

   public int suche(int wert) {

      if (this.wert == wert) {
         return this.wert;
      } else {
         if (this.wert > wert) {
            if (this.linkesKind != null) {
               return linkesKind.suche(wert);
            } else {
               return 0;
            }
         }

         else {
            if (this.rechtesKind != null) {
               return rechtesKind.suche(wert);
            } else {
               return 0;
            }
         }

      }

   }
}
