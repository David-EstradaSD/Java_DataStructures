package LinkedList;

public class MiddleNodeDeletion {
	
	// Delete the Middle Node of a LinkedList
	// The list may contain an even or odd number of elements
	// If even, delete the node on the "right-hand" side
	// The list may contain ANY data type
	
	public static void main(String[] args) {
		Node<Integer> head = buildNode(8);
		Node<Integer> nodeA = buildNode(3);
		Node<Integer> nodeB = buildNode(18);
		Node<Integer> nodeC = buildNode(12);
		Node<Integer> nodeD = buildNode(1);
		
		head.setNext(nodeA); // Chain each note accordingly 
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		
		printLinkedList(head);
		deleteMiddle(head);
		printLinkedList(head);
		deleteMiddle(head);
		printLinkedList(head);
	}
	
	public static Node deleteMiddle(Node head) {
		
		if (head == null || head.getNext() == null) { // Check size
			return head;
		}
		
		Node slowPointer = head; 
		Node fastPointer = head;
		
		Node previous = null;
		
		while (fastPointer != null && fastPointer.getNext() != null) {
			fastPointer = fastPointer.getNext().getNext(); // jumps 2 nodes
			previous = slowPointer;
			slowPointer = slowPointer.getNext();
		}
		
		// Delete middle node
		previous.setNext(slowPointer.getNext());
		
		return head;
	}
	
	public static Node<Integer> buildNode(int data) {
		Node node = new Node(); 
		node.setData(data);
		node.setNext(null); // null by default, but just being explicit 
		return node;
	}
	
	public static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.getData() + ", ");
			head = head.getNext();
		}
		System.out.println("END");
	}

}
