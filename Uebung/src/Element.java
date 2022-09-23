public class Element {
	public int value;
	public Element left, right;

	public Element(int n) {
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
				left= new Element(value);
			} else {
				left.insert(value);
			}
		}

	}

	public void show() {
		System.out.println("" + value);
	}
}