
public class Test {

	public static void main(String[] args) {

		BuildPQueue meinPQueue = new BuildPQueue();
		
		meinPQueue.insert(new Notruf(1,"Treppensturz",5,34,55,2));
		
		meinPQueue.insert(new Notruf(2,"Platzwunde",5,34,55,4));
		
		meinPQueue.insert(new Notruf(3,"Schenkelhals",5,34,55,3));
		
		meinPQueue.insert(new Notruf(4,"Schlaganfall",8,34,55,6));
		
		meinPQueue.insert(new Notruf(5,"Schnitt",8,34,55,0));
		meinPQueue.showAll();
		System.out.println("---");
		System.out.println("N�chster Task"+meinPQueue.max());
		
		
		
		
		
		
		
		
		
		
/*		BuildTree meinBaum = new BuildTree();
	//	meinBaum.root.left.right.left.show();
		 System.out.println(meinBaum.root.depth(1));
	     meinBaum.root.preOrder(); 
	     System.out.println();
	     meinBaum.root.inOrder();
	     System.out.println();
	     meinBaum.root.postOrder();
	     System.out.println();
	     System.out.println(meinBaum.root.counter());

*/
		
		
	}
}

/*
 * ArrayStack meinStack = new ArrayStack(); meinStack.push(42);
 * meinStack.push(39); meinStack.push(7); meinStack.push(9);
 * 
 * 
 * 
 * // System.out.println(meinStack.stack[1]); int[] myCopy = meinStack.copy();
 * 
 * for (int i = 0; i<4; i++) { System.out.println(myCopy[i]); }
 * 
 * 
 * }
 * 
 * } /* ListenElement element1 = new ListenElement(4);
 * 
 * ListenElement element2 = new ListenElement(42); Queue myQueue = new Queue(3);
 * myQueue.enqueue(6); System.out.println("Gr��e: " + myQueue.getGroesse());
 * 
 * try { myQueue.dequeue(); } catch (Exception e) {
 * 
 * System.out.println("Die ist leer!"); }
 * 
 * System.out.println("Gr��e: " + myQueue.getGroesse());
 * 
 * } } /* try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * System.out.println("Gr��e: " + stack.getGroesse()); try { stack.pop(); }
 * catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * /* Liste liste = new Liste(3); liste.add(5); liste.add(7); liste.add(999);
 * liste.add(1001); System.out.println(liste);
 * System.out.println(liste.getGroesse());
 */
