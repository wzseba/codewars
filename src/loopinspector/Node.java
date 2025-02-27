package loopinspector;

public class Node {

	int dato;
	Node siguente;

	public Node(int dato) {
		this.dato = dato;
		this.siguente = null;
	}

	public Node getNext() {
		return this.siguente;
	}

}
