import java.util.ArrayList;

public class BuildPQueue {
	ArrayList<Notruf> pqueue;

	public BuildPQueue() {
		pqueue = new ArrayList<Notruf>();
	}

	public void insert(ArrayList<Notruf> pqueue, Notruf notruf) {

		for (int i = 0; i >= pqueue.size(); i++) {
			if (pqueue.get(i).prio > notruf.prio) {
				pqueue.add(i, notruf);
				break;

			}
			

		}

	}

	public void delete() {
		pqueue.remove(pqueue.size()-1);
		
	}

//	public Element max() {
//		return 0;
//	}

	public boolean empty() {
		return true;
	}

}
