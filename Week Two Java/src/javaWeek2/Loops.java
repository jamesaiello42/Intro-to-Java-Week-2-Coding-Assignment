package javaWeek2;

public class Loops {
	public static void main(String[] args) {
		// To increment in the while loop
		int i = 0;
		
		// I have added this to make grading easier
		System.out.println("First Loop: ");
		
		// Prints evens numbers from 0 to 100 
		while (i >= 0 && i <= 100)
		{
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
		
		// I have added this to make grading easier
		System.out.println("\nSecond Loop: ");
		
		// Second while loop that prints every third number until zero
		while (i > 0)
		{
			if (i % 3 == 0)
				System.out.println(i);
			
			// Decrement
			i--;
			
		}
		
		// I have added this to make grading easier
		System.out.println("\nThird Loop: ");
		
		// Third loop is a for loop that prints every other number, 1 to 100
		for (int count = 1; count <= 100; count++) 
			if (count % 2 == 1)
				System.out.println(count);
		
		// I have added this to make grading easier
		System.out.println("\nFourth Loop: ");
		
		/* Fourth loop that prints according to these requirements
		 * every number from 0 to 100, but if the number is divisible by 3, it prints “Hello” instead of the number, 
		 * and if the number is divisible by 5, it prints “World” instead of the number, 
		 * and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the number. 
		*/
		for (int count = 0; count <= 100; count++)
		{
			if (count % 3 == 0 && count % 5 == 0) 
				System.out.println("HelloWorld");
			else if (count % 3 == 0) 
				System.out.println("Hello");
			else if (count % 5 == 0) 
				System.out.println("World");
			// Prints everything else
			else 
				System.out.println(count);
		}
		
	}
}
