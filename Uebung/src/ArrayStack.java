
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
