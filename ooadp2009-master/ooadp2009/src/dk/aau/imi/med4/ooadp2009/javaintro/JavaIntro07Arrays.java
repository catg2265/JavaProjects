package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * Arrays in Java
 */
public class JavaIntro07Arrays {
	public static void main(String[] args) {
		
		//First we create an array with 5 ints in it.
		int[] intArray = {1,2,3,4,5};
		
		//Note that array indices are zero-based!!!
		//That is, the first element is at index 0, not index 1.
		System.out.println(intArray[0]); //Prints out 1
		System.out.println(intArray[1]); //Prints out 2
		
		System.out.println("Print out the values in an array");
		for(int i = 0; i < intArray.length; i++) 
			//No need for {...} because there's only one line in the loop
			//Comments don't count!
			System.out.println(intArray[i]);
		
		System.out.println("\nNow print out the array in reverse");
		for(int i = intArray.length - 1; i >= 0; i--)
			//No need for {...} because there's only one line in the loop
			//Comments don't count!
			System.out.println(intArray[i]);
		
		//Now we make an array to hold 10 strings.
		String[] stringArray = new String[10];
		//Now let's put some strings into stringArray.
		stringArray[0] = "Zero";
		stringArray[1] = "One";
		stringArray[2] = "Two";
		stringArray[3] = "Three";
		stringArray[4] = "Four";
		stringArray[5] = "Five";
		stringArray[6] = "Six";
		stringArray[7] = "Seven";
		stringArray[8] = "Eight";
		stringArray[9] = "Nine";
		System.out.println("\nNow let's count using words instead of numbers");
		for(int i = 0; i < stringArray.length; i++)
			System.out.println(stringArray[i]);
		
		System.out.println("\nCounting using the enhanced for statement (only in Java 1.5 and greater)");
		for (String s : stringArray){
			System.out.println(s);
		}

	}
}
