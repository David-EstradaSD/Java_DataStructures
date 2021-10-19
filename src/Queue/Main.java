package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.add("Dave");
		queue.add("Anna");
		queue.add("Joe");
		queue.add("Bob");
		queue.add("Sally");

		System.out.println(queue);

		System.out.println("Next up: " + queue.peek()); // See next element
		

		while (!queue.isEmpty()) {
			System.out.println(queue.remove()); // remove elements
		}
	}

}
