import java.util.ArrayList;

public class BuildPQueue {
	ArrayList<Notruf> pqueue;

	public BuildPQueue() {
		pqueue = new ArrayList<Notruf>();
	}

	public void insert(Notruf notruf) {
		if (empty()) {
			pqueue.add(0, notruf);
			return;
		}

		for (int i = 0; i < pqueue.size(); i++) {

			if (notruf.prio >= pqueue.get(i).prio) {
				pqueue.add(i, notruf);
				break;
			}
		}
		if (notruf.prio < pqueue.get(pqueue.size() - 1).prio) {
			pqueue.add(pqueue.size(), notruf);

		}
	}

	public void showAll() {
		for (int i = 0; i < pqueue.size(); i++) {
			
			System.out.println(pqueue.get(i));

		}
	}

	public void delete() {
		pqueue.remove(0);

	}

	public Notruf max() {
		return pqueue.get(0);
	}

	public boolean empty() {
		return pqueue.isEmpty();
	}
//	public Element max() {
//		return 0;
//	}

}
