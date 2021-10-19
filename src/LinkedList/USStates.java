package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class USStates {
	
	public static void main(String[] args) {
		LinkedList<String> states = new LinkedList();
		
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add("Colorado");

		states.addFirst("Alabama");
		System.out.println(states);
		System.out.println("Last state in list: " + states.getLast());
		
		// Iterate backwards ( doubly-LinkedList ) using ListIterator 
		
		ListIterator<String> iterator = states.listIterator(states.size());
		
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
		
		// NOTE: Not guaranteed to Sort the List, just entered alphabetically
	}

}
