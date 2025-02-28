package loopinspector;

public class LoopInspector {
	/* https://www.codewars.com/kata/52a89c2ea8ddc5547a000863/train/java */
	public int loopSize(Node node) {

		Node nodo1 = node;
		Node nodo2 = node;

		// verificar que hay un bucle en la lista enlazada
		while (nodo2 != null && nodo2.getNext() != null) {
			nodo1 = nodo1.getNext();
			nodo2 = nodo2.getNext().getNext();

			if (nodo1 == nodo2)
				break;
		}

		if (nodo2 == null || nodo2.getNext() == null) {
			return 0;
		}

		int cont = 1;

		nodo1 = nodo1.getNext();
		while (nodo1 != nodo2) {
			cont++;
			nodo1 = nodo1.getNext();
		}

		return cont;

	}

}
