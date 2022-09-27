
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
