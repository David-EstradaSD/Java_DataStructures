package CollectionFramework;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorInterface {
	
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("red", "orange", "yellow", "green", "blue", "violet");
		
		Iterator<String> iterator = collection.iterator(); // returns an Iterator object
		
		while (iterator.hasNext()) { // as long as there's still more data in the collection 
			System.out.println(iterator.next());
			
		}
	}

}
