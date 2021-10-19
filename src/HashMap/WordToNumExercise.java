package HashMap;

import java.util.HashMap;

public class WordToNumExercise {
	
	public static void main(String[] args) {
		HashMap<String, Integer> wordToNum = new HashMap<>();
		
		// Insert key-value pairs into HashMap
		wordToNum.put("ONE", 1);
		wordToNum.put("TWO", 2);
		wordToNum.put("THREE", 3);
		wordToNum.put("FOUR", 4);
		wordToNum.put("FIVE", 5);
		
		// Retrieve elements
		System.out.println("Retrieve element THREE: " + wordToNum.get("THREE"));
		
		// List values and keys
		System.out.println("Values: " + wordToNum.values()); // Order is NOT guaranteed
		System.out.println("Keys: " + wordToNum.keySet());
		
		// Remove elements
		System.out.println(wordToNum.remove("FOUR"));
		
		System.out.println("Values w/out 4: " + wordToNum.values()); // Order is NOT guaranteed
		System.out.println("Keys w/out FOUR: " + wordToNum.keySet());
		
	}

}
