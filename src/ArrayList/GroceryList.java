package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
	
	// Create an ArrayList of grocery items
	// Create a second list of more items
	// Add the extra items to your original list using addAll()
	// Search for an item and remove the item 
	
	public static void main(String[] args) {
		
		ArrayList<String> groceries = new ArrayList<>(Arrays.asList("milk", "bread",
				"eggs", "flour"));
		
		ArrayList<String> groceries2 = new ArrayList<>(Arrays.asList("sugar", "salt",
				"vanilla extract"));
		
		groceries.add("yeast");
		groceries.addAll(groceries2);
		System.out.println(groceries);
		
		if (groceries.contains("salt")) {
			groceries.remove("salt");
		}
		
		System.out.println(groceries);
		
	}

}
