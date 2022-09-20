
public class ArrayStack {

	private int[] stack;
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
		if (!empty())
			tos--;
	}

	
	
	
	public boolean empty() {

		{
			return (tos == -1);
		}
	}

	
	public Object top()
	   {
	      if (!empty())
	         return stack[tos];
	      else
	         return null;
	   }
	
}
