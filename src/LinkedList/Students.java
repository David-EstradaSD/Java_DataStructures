package LinkedList;

import java.util.LinkedList;

public class Students {
	
	public static void main(String[] args) {
		LinkedList<String> students = new LinkedList<String>();
		
		students.add("Dave");
		students.add("Dan");
		students.add("Meesh");
		students.add("Luke");
		students.add("Lea");
		
		students.addFirst("Eva");
		students.addLast("Eric");
		students.add(2, "Jacky");
		
		// Retrieve items from a LinkedList by placement 
		String firstStudent = students.getFirst();
		System.out.println(firstStudent); 
		
		String lastStudent = students.getLast();
		System.out.println(lastStudent);
		
		System.out.println(students);
		
		// Retrieve index of specific item 
		System.out.println("Dave's index: " + students.indexOf("Dave"));
		
		// Size of List
		System.out.println("Students enrolled: " + students.size());
		
		// Remove items by placement, object, or index
		students.removeFirst();
		students.removeLast();
		students.remove("Meesh");
		students.remove(1); // index 1
		System.out.println(students);
		
		// Search for items in a LinkedList
		boolean hasDev = students.contains("Dev");
		System.out.println("Dev is a student: " + hasDev);
		
		// Empty the list 
		students.clear();
		
		
		
	}

}
