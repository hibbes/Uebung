public class Element
{
   public int value;
   public Element left, right;

   public Element(int n)
   {
      value = n;
      left = null;
      right = null;
   }
   
   public void show()
   {
      System.out.println(""+value);
   }
}