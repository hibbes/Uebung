public class Element {
	static int maxdepth = 0;
	static int counter = 0;
	public int value;
	public Element left, right;
	public int depth;

	Element(int n) {
		value = n;
		left = null;
		right = null;
	}

	public void insert(int value) {

		if (value >= this.value) {
			if (right == null) {

				right = new Element(value);
			} else {
				right.insert(value);
			}

		} else {
			if (left == null) {
				left = new Element(value);
			} else {
				left.insert(value);
			}
		}

	}

	public int depth(int depth) {

		if (left != null) {
			depth++;
			if (depth > maxdepth) {
				maxdepth++;
			}
			// System.out.println("Lefttiefe: " + depth + " Maxtiefe: " + maxdepth);
			left.depth(depth);
			depth--;
		}
		if (right != null) {
			depth++;
			if (depth > maxdepth) {
				maxdepth++;
			}
			// System.out.println("Righttiefe: " + depth + " Maxtiefe: " + maxdepth);
			right.depth(depth);
			depth--;
		}

		return maxdepth;
	}

	public void show() {
		System.out.println("" + value);
	}

	public void preOrder() {
		System.out.print(value + " ");
		if (left != null) {
			left.preOrder();
		}
		if (right != null) {
			right.preOrder();
		}

	}

	public void inOrder() {

		if (left != null) {
			left.inOrder();
		}
		System.out.print(value + " ");
		if (right != null) {
			right.inOrder();
		}
	}

	public void postOrder() {

		if (left != null) {
			left.postOrder();
		}

		if (right != null) {
			right.postOrder();
		}
		System.out.print(value + " ");

	}

	public int counter() {
		counter++;
		if (left != null) {
			left.counter();
		}
		// System.out.println("Lefttiefe: " + depth + " Maxtiefe: " + maxdepth);
		

		if (right != null)

		{
			right.counter();
		}
		// System.out.println("Righttiefe: " + depth + " Maxtiefe: " + maxdepth);

		return counter;
	}

}