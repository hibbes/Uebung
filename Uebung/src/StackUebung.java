public class StackUebung {

	private ListenElement kopf;
	private ListenElement tmp;

	public StackUebung(int wert) {
		kopf = new ListenElement(wert);
	}

	public void push(int wert) {
		tmp = kopf;
		kopf = new ListenElement(wert);
		kopf.add(tmp);
	}

	public void pop() throws Exception {

		System.out.println(kopf.getInhalt());
		kopf = kopf.next;
	}

	public void isEmpty() throws Exception {
	};

	public void top() throws Exception {
		System.out.println(kopf.getInhalt());
	}

	public int getGroesse() {
		return kopf.getGroesse(0);
	}

}
