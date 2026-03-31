
/**
 * ListenElement (Linked List Node/Element)
 * 
 * Represents a single node in a linked list. Each node stores a value
 * and a reference to the next node in the list.
 * 
 * Node Structure:
 * ┌────────────────────┐
 * │   ListenElement    │
 * ├────────────────────┤
 * │ wert (value)       │  <- Data stored in this node
 * │ naechstes (next)   │  <- Pointer to next node
 * └────────────────────┘
 * 
 * Linked List with Multiple Elements:
 * head → [5|──┐
 *            │
 *            v
 *        [3|──┐
 *            │
 *            v
 *        [7|null]
 * 
 * Node Attributes (German naming):
 * - wert: the value/data stored in this node
 * - naechstes: reference to the next ListenElement (or null if last)
 * 
 * Basic Node Operations:
 * 
 * 1. CREATE NODE:
 *    ListenElement node = new ListenElement(5);
 *    Creates: [5|null]
 * 
 * 2. LINK NODES:
 *    node1.naechstes = node2;
 *    Creates: [5|──→][3|null]
 * 
 * 3. INSERT AFTER:
 *    newNode.naechstes = current.naechstes;
 *    current.naechstes = newNode;
 *    Inserts new node between current and next
 * 
 * 4. TRAVERSE:
 *    for (ListenElement current = head; 
 *         current != null; 
 *         current = current.naechstes) {
 *        process(current.wert);
 *    }
 * 
 * Memory Representation:
 * Each node in memory:
 * ┌──────────────────┐
 * │ wert: int value  │  (4 or 8 bytes depending on int size)
 * │ naechstes: ptr   │  (8 bytes for reference on 64-bit systems)
 * └──────────────────┘
 * Total per node ≈ 16+ bytes (vs 4-8 for plain array element)
 * 
 * Null Handling:
 * - null naechstes: indicates last node in list
 * - null head: indicates empty list
 * - null wert: node may store null as data value
 * 
 * Single Node Use Case:
 * A single ListenElement with null naechstes forms a 1-element list
 * This is the base case for recursive list operations
 * 
 * Recursive List Processing Example:
 * - Visit this node: process(wert)
 * - Visit rest of list: naechstes (if not null)
 * 
 * Educational Focus:
 * - Understanding object references
 * - Building blocks of dynamic structures
 * - Pointer/reference manipulation
 * - null as a special value meaning "no reference"
 * - How complex structures emerge from simple nodes
 * 
 * German Terminology:
 * - ListenElement = List Element
 * - wert = value
 * - naechstes = next (in German)
 * - Liste = List
 * 
 * Common Patterns:
 * - Sentinel nodes: dummy nodes to simplify logic
 * - Head pointer: reference to first node
 * - Tail pointer: reference to last node (optional, for efficiency)
 * - Cycle detection: check for circular references
 */
public class ListenElement {
	
	
	private int inhalt;
	public ListenElement next;
	
	
	
	public ListenElement (int inhalt){
		this.inhalt = inhalt;
	}

		
	public boolean isEmpty() {return true;}
	
	public void top() {}
	
	public void add(ListenElement neu){
		 if(next==null){
			 next=neu;
		 }else{
			 next.add(neu);
		 }
	}
	
	public void remove() {
		if(next==null) {
			System.out.println(inhalt);
		
	}else {
		next.remove();
	}
		next=null;
		return;
		
}
	
	 public int getGroesse(int anzahl) {
		 int zahl = anzahl+1;
		 if(next!=null){
			return next.getGroesse(zahl);}
		 
		 return zahl;
			 
		 }
	 
	 public String getInhalt() {
		 return ""+inhalt;
	 }
	 
	 public String toString(){
			if(next== null){
					return ""+inhalt;
				}else{
					return ""+inhalt+" "+next.toString();
				}
			}
	}
	
	

