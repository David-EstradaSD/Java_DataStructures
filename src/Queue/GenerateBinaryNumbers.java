package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	
	// Generate the First N Binary Numbers
	// Input: int n
	// Output: void (side effect, print out the first N binary numbers)
	
	
	public static void main(String[] args) {
		printBinary(1);
		printBinary(3);
		printBinary(10);
		printBinary(0); // nothing to print
		printBinary(-9); // nothing to print 
		
		printBinaryUsingQueue(1);
		printBinaryUsingQueue(3);
		printBinaryUsingQueue(10);
		printBinaryUsingQueue(0); // nothing to print
		printBinaryUsingQueue(-9); // nothing to print
		
	}
	
	public static void printBinary(int n) {
		if (n <= 0) {
			System.out.println("Nothing to print\n");
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(Integer.toBinaryString(i)); // this built-in function converts base-10 decimals to binary
		}
		
		System.out.println();
	}
	
	// We can use a queue to leverage the binary pattern of starting with 1, then appending 0s,
	// then replacing the 0 with a 1 (shifting the 1s to the higher position), then appending 0s and starting over...
	// 1
	// 10
	// 11
	// 100
	// 101 
	// 110 
	public static void printBinaryUsingQueue(int n) {
		if (n <= 0) {
			System.out.println("Nothing to print\n");
			return;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		
		for (int i = 1; i <= n; i++) {
			Integer current = queue.remove();
			System.out.println(current); // we only want to print out the first N binary numbers
			
			queue.add(current * 10); // 2nd binary num
			queue.add(current * 10 + 1); // 3rd binary num
		}
		
		System.out.println();
	}

}
