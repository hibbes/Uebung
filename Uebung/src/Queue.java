
public class Queue {
	private ListenElement kopf;
	private ListenElement tmp;

	public Queue(int wert) {
		kopf = new ListenElement(wert);
	}

	public void enqeue(int wert) {
		tmp = kopf;
		kopf = new ListenElement(wert);
		kopf.add(tmp);
	}

	public void deqeue() throws Exception {
		kopf.remove();

	}

	public void top() throws Exception {
		System.out.println(kopf.getInhalt());
	}

	public int getGroesse() {
		return kopf.getGroesse(0);
	}

}
