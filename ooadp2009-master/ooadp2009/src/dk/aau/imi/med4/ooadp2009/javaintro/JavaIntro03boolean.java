package dk.aau.imi.med4.ooadp2009.javaintro;
/**
 * A boolean variable can be either true or false.
 * The operators !=, >, <, >=, <= and == can be used
 * to compare int values.
 */
public class JavaIntro03boolean {
	public static void main(String[] args) {
		System.out.println("3 == 3 is " + (3 == 3));
		System.out.println("3 != 3 is " + (3 != 3));
		System.out.println("3 == 2 is " + (3 == 2));
		System.out.println("3 != 2 is " + (3 != 2));
		System.out.println("3 > 2 is " + (3 > 2));
		System.out.println("3 < 2 is " + (3 < 2));
		System.out.println("3 < 3 is " + (3 < 3));
		System.out.println("3 >= 2 is " + (3 >= 2));
		System.out.println("3 >= 3 is " + (3 >= 3));
		System.out.println("3 <= 3 is " + (3 <= 3));
		System.out.println("3 <= 2 is " + (3 <= 2));
		System.out.println("3 == 3 is " + (3 == 3));
		
		boolean b = ((3 / -2) > - 1.5);
		System.out.println("b is "+ b );
	}
}
