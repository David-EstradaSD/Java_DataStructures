package LinkedList;

public class Node<D> { // <D> this is for "generics" to denote the data field can be of any type

	private D data;
	private Node<D> next; // this is for next Node 

	public Node<D> getNext() {
		return next;
	}

	public void setNext(Node<D> next) {
		this.next = next;
	}

	public D getData() {
		return this.data;
	}

	public void setData(D data) {
		this.data = data;
	}

}
