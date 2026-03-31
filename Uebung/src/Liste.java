
/**
 * Liste (Linked List) - Dynamic Data Structure
 * 
 * A Linked List is a linear data structure where elements are stored
 * in nodes that are connected through pointers/references. Unlike arrays,
 * linked lists can grow and shrink dynamically.
 * 
 * Linked List Structure:
 * 
 * head → [value1|next] → [value2|next] → [value3|next] → null
 *         |-----------|
 *         (ListenElement)
 * 
 * Each node contains:
 * - Data: the actual value
 * - Next: reference to the next node
 * 
 * Comparison with Arrays:
 * ┌──────────────┬──────────────┬──────────────┐
 * │ Operation    │ Array        │ Linked List  │
 * ├──────────────┼──────────────┼──────────────┤
 * │ Access[i]    │ O(1)         │ O(n)         │
 * │ Insert       │ O(n)         │ O(1)*        │
 * │ Delete       │ O(n)         │ O(1)*        │
 * │ Search       │ O(n)         │ O(n)         │
 * │ Space        │ O(n)         │ O(n)         │
 * └──────────────┴──────────────┴──────────────┘
 * *if position is already known
 * 
 * Linked List Operations:
 * 
 * 1. INSERT AT BEGINNING:
 *    new_node.next = head;
 *    head = new_node;
 *    Time: O(1)
 * 
 * 2. INSERT AT END:
 *    current = head;
 *    while (current.next != null) current = current.next;
 *    current.next = new_node;
 *    Time: O(n)
 * 
 * 3. DELETE:
 *    prev.next = current.next; // skip the node
 *    Time: O(n) to find node, O(1) to delete if found
 * 
 * 4. TRAVERSE:
 *    for (current = head; current != null; current = current.next)
 *    Time: O(n)
 * 
 * Memory Layout:
 * Array (contiguous memory):
 * ┌───┬───┬───┬───┬───┐  contiguous blocks
 * │ 1 │ 2 │ 3 │ 4 │ 5 │
 * └───┴───┴───┴───┴───┘
 * 
 * Linked List (scattered memory):
 * ┌───┬───┐     ┌───┬───┐     ┌───┬───┐
 * │ 1 │ ──┼────→│ 3 │ ──┼────→│ 5 │null│
 * └───┴───┘     └───┴───┘     └───┴───┘
 * 
 * Advantages:
 * - Dynamic size: grow/shrink as needed
 * - Efficient insertion/deletion: O(1) with pointer
 * - No memory waste: use exactly what's needed
 * 
 * Disadvantages:
 * - No random access: must traverse from beginning
 * - More memory per element: need pointer storage
 * - Cache unfriendly: scattered in memory
 * 
 * Variations:
 * - Single linked list: forward pointers only
 * - Double linked list: forward and backward pointers
 * - Circular linked list: last node points to first
 * 
 * Educational Focus:
 * - Dynamic memory allocation
 * - Pointer/reference manipulation
 * - Trade-offs between data structures
 * - Understanding time vs space complexity
 * - Recursive algorithms on lists
 * 
 * Real-World Uses:
 * - Browser history (back button)
 * - Undo/Redo functionality
 * - Music playlists
 * - Task queues
 */
public class Liste {
	private ListenElement kopf;
	
	public Liste (int wert){
		kopf = new ListenElement(wert);
	}
	
	public void add(int wert){
		kopf.add(new ListenElement(wert));
		
	}
	public int getGroesse(){
		return kopf.getGroesse(0);
	}
	
	public String toString(){
		return kopf.toString();
	}
}
