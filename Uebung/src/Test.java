
public class Test {

	public static void main(String[] args) {

		BuildTree meinBaum = new BuildTree();
	//	meinBaum.root.left.right.left.show();
		 System.out.println(meinBaum.root.depth(1));
	     meinBaum.root.preOrder(); 
	     System.out.println();
	     meinBaum.root.inOrder();
	     System.out.println();
	     meinBaum.root.postOrder();


		
		
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
 * myQueue.enqueue(6); System.out.println("Größe: " + myQueue.getGroesse());
 * 
 * try { myQueue.dequeue(); } catch (Exception e) {
 * 
 * System.out.println("Die ist leer!"); }
 * 
 * System.out.println("Größe: " + myQueue.getGroesse());
 * 
 * } } /* try { stack.top(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * try { stack.pop(); } catch (Exception e) {
 * 
 * System.out.println("Der Stapel ist leer!"); }
 * 
 * System.out.println("Größe: " + stack.getGroesse()); try { stack.pop(); }
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
