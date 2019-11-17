package sprogskift;

public class Node {

	Node next;
	Dog data;

	public Node(Dog data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}
	public Node getNext() {
		return this.next;
	}

	public Dog getData() {
		return this.data;
	}
}
