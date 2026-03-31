
/**
 * ArrayStack - Stack Data Structure Implemented with Array
 * 
 * A Stack is a Last-In-First-Out (LIFO) data structure where elements
 * are added and removed from the same end (top). This implementation
 * uses an array as the underlying storage.
 * 
 * Stack Concept (LIFO):
 * 
 * Push (add):       Pop (remove):
 * ↓                  ↑
 * [ ][item3][item2][item1]  [item2][item1]
 *    top←rear                top←rear
 * 
 * Elements enter and exit from the top
 * Like a stack of plates: add/remove from top
 * 
 * Array-Based Stack Structure:
 * 
 * elements[10]:  [item1][item2][item3][ ][ ][ ][ ][ ][ ][ ]
 *                                   ↑
 *                                 top=2
 * 
 * Stack State Tracking:
 * - top: index of the topmost element (-1 if empty)
 * - size: number of elements in stack
 * - capacity: maximum size of array
 * 
 * Operations:
 * 
 * 1. PUSH (add to top):
 *    elements[++top] = value;
 *    Time: O(1) amortized
 * 
 * 2. POP (remove from top):
 *    value = elements[top--];
 *    Time: O(1)
 * 
 * 3. PEEK (view top without removing):
 *    return elements[top];
 *    Time: O(1)
 * 
 * 4. CHECK EMPTY:
 *    return top == -1;
 *    Time: O(1)
 * 
 * 5. CHECK FULL:
 *    return top == capacity - 1;
 *    Time: O(1)
 * 
 * Stack Evolution Example:
 * 
 * Initial (empty):     top = -1
 * [ ][ ][ ][ ][ ]
 * 
 * Push 5:              top = 0
 * [5][ ][ ][ ][ ]
 * 
 * Push 3:              top = 1
 * [5][3][ ][ ][ ]
 * 
 * Push 7:              top = 2
 * [5][3][7][ ][ ]
 * 
 * Pop (returns 7):     top = 1
 * [5][3][ ][ ][ ]
 * 
 * Pop (returns 3):     top = 0
 * [5][ ][ ][ ][ ]
 * 
 * Memory Representation:
 * ┌──────────────────────────┐
 * │ Stack Capacity: 10       │
 * │ Current Size: 3          │
 * │ Top Index: 2             │
 * │ [X][X][X][ ][ ][][][][][] │
 * │ 0  1  2                   │
 * └──────────────────────────┘
 * 
 * Time Complexity:
 * - Push: O(1)
 * - Pop: O(1)
 * - Peek: O(1)
 * - Space: O(n) where n is capacity
 * 
 * Stack vs Queue Comparison:
 * ┌──────────────┬───────────┬───────────┐
 * │ Property     │ Stack     │ Queue     │
 * ├──────────────┼───────────┼───────────┤
 * │ Add/Remove   │ Same end  │ Different │
 * │ Order        │ LIFO      │ FIFO      │
 * │ Real example │ Browser   │ Print job │
 * │              │ back      │ queue     │
 * └──────────────┴───────────┴───────────┘
 * 
 * Resizing Strategy:
 * When stack is full and push requested:
 * - Create new larger array (usually 2x size)
 * - Copy all elements to new array
 * - Update capacity and element array reference
 * - Time: O(n) amortized to O(1) per operation
 * 
 * Real-World Applications:
 * 
 * 1. BROWSER HISTORY:
 *    Push URL when visiting, pop when clicking back
 * 
 * 2. UNDO/REDO:
 *    Push state on each action, pop to undo
 * 
 * 3. FUNCTION CALLS:
 *    Call stack: each call pushed, return pops
 * 
 * 4. EXPRESSION EVALUATION:
 *    Infix to postfix conversion
 *    Postfix expression evaluation
 * 
 * 5. BACKTRACKING:
 *    Depth-first search (DFS)
 *    Maze solving
 *    Puzzle solutions
 * 
 * 6. PARENTHESIS MATCHING:
 *    Check if brackets properly balanced
 * 
 * Edge Cases:
 * - Empty stack: pop/peek on empty raises exception
 * - Full stack: push on full needs resize or exception
 * - Single element: push then immediately pop
 * - Wraparound: not needed for stack (unlike circular queue)
 * 
 * Educational Focus:
 * - LIFO behavior and applications
 * - Index-based element access
 * - Trade-offs between array and linked list
 * - Dynamic resizing strategies
 * - Abstract data type (ADT) implementation
 * - Stack-based algorithm design
 */
public class ArrayStack {

	public int[] stack;
	private int tos;

	public ArrayStack() {
		stack = new int[100];
		tos = -1;
	}

	public void push(int x) {
		if (tos < 99) {
			tos++;
			stack[tos] = x;
		}
	}

	public void pop() {

		if (!empty()) {

			tos--;
		}

	}

	public boolean empty() {

		return (tos == -1);
	}

	public int top() {
		if (!empty())
			return stack[tos];
		return 0;

	}

	
	public void connect() {
		
		int tmptos = 0;
		int[] tmp = new int[100];
		while (tos >= 0) {
			tmp[tmptos] = top();
			pop();
			tmptos++;
		}
		tos = 0;
		tmptos--;
	}
	
	public int[] copy() {
		int[] tmp = new int[100];
		int[] copy = new int[100];
		int tmptos = 0;

		while (tos >= 0) {
			tmp[tmptos] = top();
			pop();
			tmptos++;
		}
		tos = 0;
		tmptos--;
		
		do {
		
			
			
			stack[tos] = tmp[tmptos];
			copy[tos] = tmp[tmptos];
			tmptos--;
			tos++;
		} while (tmptos >= 0);
		return copy;

	}

}
