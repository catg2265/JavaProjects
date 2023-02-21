package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * The % operator and
 * conditional statements: if, else and switch
 *
 */
public class JavaIntro06Conditionals {
	public static void main(String[] args) {
		
		/*
		 * a % b returns the remainder when
		 * a is divided by b. Specifically, if
		 * a / b = c where a and b are integers,
		 * then a % b = a - (c * b).
		 * For example:
		 * 5 / 3 = 1 (if they are ints)
		 * so 5 % 3 = 5 - (1 * 3) = 2
		 * -5 / 3 = -1 (if they are ints)
		 * so -5 % 3 = -5 - (-1 * 3) = -2
		 * -5 / -3 = 1 (when ints)
		 * so -5 % -3 = -5 - (1 * -3) = -2
		 * 5 / -3 = -1 (when ints)
		 * so 5 % -3 = 5 - (-1 * -3) = 2
		 */
		
		System.out.println("5 % 3 = " + (5 % 3));
		System.out.println("-5 % 3 = " + (-5 % 3));
		System.out.println("-5 % -3 = " + (-5 % -3));
		System.out.println("5 % -3 = " + (5 % -3));

		System.out.println("\nExamples of i % 3:");
		for(int i = -5; i < 6; i++)
			System.out.println(i + " % 3 = " + (i % 3));
		
		/*
		 * Loop that tests that a % b = a - (c * b)
		 * for a range of positive and negative values of a and b.
		 * Should print nothing!
		 */
		System.out.println("The following cases disprove that a % b = a - (c * b):");
		for(int a = -5; a < 6; a++) {
			for(int b = -5; b < 6; b++) {
				if (b != 0) {//Cannot divide by zero.
					int c = a / b;
					if ((a % b) != (a - (c * b)))
						System.out.println(a+" % "+b+" = " + 
								(a % b)+ " but ("+a+" - ("+c+" * "+b+")) = "+ (a - (c * b)));
				}
			}
		}
		
		System.out.println("\nSay whether a number is odd or even");
		for(int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else
				System.out.println(i + " is odd");
		}
		
		System.out.println("\nCycle through Red, Green and Blue");
		//Note absence of {..}: Only needed if block contains more than one statement.
		for(int i = 0; i < 10; i++)
			if (i % 3 == 0) 
				System.out.println("Red");
			else if (i % 3 == 1) 
				System.out.println("Green");
			else
				System.out.println("Blue");
		
		System.out.println("\nUsing switch to print out number names");
		for(int i = 0; i < 12; i++) {
			switch (i) {
			case 0: System.out.println("Zero"); break;
			case 1: System.out.println("One"); break;
			case 2: System.out.println("Two"); break;
			case 3: System.out.println("Three"); break;
			case 4: System.out.println("Four"); break;
			case 5: System.out.println("Five"); break;
			case 6: System.out.println("Six"); break;
			case 7: System.out.println("Seven"); break;
			case 8: System.out.println("Eight"); break;
			case 9: System.out.println("Nine"); break;
			case 10: System.out.println("Ten"); break;
			default: System.out.println("Unrecognized number!");
			}
		}
	}
}
