package loopinspector;

public class LoopInspector {
	/* https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/train/java */
	public int loopSize(Node node) {

		Node nodo1 = node;
		Node nodo2 = node;

		while (nodo2 != null && nodo2.getNext() != null) {
			nodo1 = nodo1.getNext();
			nodo2 = nodo2.getNext().getNext();

			if (nodo1 == nodo2)
				return 0;
		}

		return 0;

	}

}
