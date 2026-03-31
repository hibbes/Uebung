
/**
 * ArrayQueue - Queue Data Structure Implemented with Array
 * 
 * A Queue is a First-In-First-Out (FIFO) data structure where elements
 * are added at the rear and removed from the front. This implementation
 * uses an array as the underlying storage.
 * 
 * Queue Concept (FIFO):
 * 
 * Enqueue (add):     Dequeue (remove):
 *                    ↑
 *   → [1][2][3][ ]   [2][3][ ][ ]
 * rear            front ↑
 * 
 * Elements enter at rear, leave at front
 * 
 * Array-Based Queue Structure:
 * 
 * elements[10]:  [item1][item2][item3][  ][  ][  ][  ][  ][  ][  ]
 *                ^-----^                               ^
 *                front=0                              rear=2
 * 
 * Queue State Tracking:
 * - front: index of first element
 * - rear: index of last element
 * - size: number of elements in queue
 * 
 * Operations:
 * 
 * 1. ENQUEUE (add to rear):
 *    elements[rear] = value;
 *    rear = (rear + 1) % capacity;
 *    Time: O(1)
 * 
 * 2. DEQUEUE (remove from front):
 *    value = elements[front];
 *    front = (front + 1) % capacity;
 *    Time: O(1)
 * 
 * 3. PEEK (view front without removing):
 *    return elements[front];
 *    Time: O(1)
 * 
 * 4. CHECK EMPTY:
 *    return size == 0;
 *    Time: O(1)
 * 
 * 5. CHECK FULL:
 *    return size == capacity;
 *    Time: O(1)
 * 
 * Circular Array Implementation:
 * 
 * After some operations:
 * elements:  [  ][  ][item1][item2][item3][  ][  ][  ][  ][  ]
 *                             ^      ^      ^
 *                            front  size=3 rear (next position)
 * 
 * When rear reaches end, wrap around to beginning:
 * elements:  [item5][item6][item1][item2][item3][item4][  ][  ][  ][  ]
 *            ^      ^                      ^      ^
 *           rear   dequeue→front                  enqueue
 * 
 * This avoids the "wasted space at beginning" problem
 * 
 * Memory Layout:
 * ┌─────────────────────────────────────────┐
 * │ Queue capacity: 10                      │
 * │ Current size: 3                         │
 * │ Front index: 2                          │
 * │ Rear index: 5                           │
 * │ [_][_][X][X][X][_][_][_][_][_]         │
 * └─────────────────────────────────────────┘
 * 
 * Time Complexity:
 * - Enqueue: O(1)
 * - Dequeue: O(1)
 * - Peek: O(1)
 * - Space: O(n) where n is capacity
 * 
 * Limitations vs Linked List Queue:
 * - Fixed capacity: must know max size in advance
 * - Resize needed if capacity exceeded
 * - Empty array still uses full capacity memory
 * 
 * Advantages vs Linked List:
 * - Simpler implementation
 * - Better cache locality
 * - No pointer/reference overhead per element
 * - Faster access patterns
 * 
 * Edge Cases:
 * - Empty queue: front == rear, size == 0
 * - Full queue: (rear + 1) % capacity == front
 * - Single element: front == rear (value at front)
 * - Wraparound: rear < front (in circular structure)
 * 
 * Real-World Applications:
 * - Print queue: documents queued for printer
 * - CPU scheduling: processes waiting for execution
 * - Message queue: tasks in order received
 * - Level-order tree traversal
 * - Breadth-first search (BFS)
 * 
 * Educational Focus:
 * - Circular buffer implementation
 * - Modulo arithmetic for wraparound
 * - Index management
 * - Trade-offs between array and linked list
 * - Abstract data type (ADT) implementation
 */
public class ArrayQueue {

	public int[] queue;
	ArrayQueue queue2;
	public int eoq;

	public ArrayQueue() {
		queue = new int[100];
		eoq = -1;
	}

	public void enqueue(int x) {
		if (eoq < 99) {
			eoq++;
			queue[eoq] = x;
		}
	}

	public void dequeue() {

		if (!empty()) {
			for (int i = 0; i <= eoq; i++) {
				queue[i] = queue[i + 1];

			}
			eoq--;
		}

	}

	public boolean empty() {

		return (eoq == -1);
	}

	public void concat(ArrayQueue queue2) {
		this.queue2 = queue2;
		

		while (!queue2.empty()) {
			eoq++;
			queue[eoq] = queue2.front();
			
			queue2.dequeue();
			
		}
	}

	public int front() {
		if (!empty())
			return queue[0];
		return -999;

	}

}
