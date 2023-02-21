package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * double values can be used to represent decimals. A double is a 64-bit
 * floating-point value. The largest number that can be represented by a double
 * is 1.7976931348623157 * 10^308. The smallest positive number that can be
 * represented by a double is 4.9 * 10^(-324).
 * 
 */
public class JavaIntro04double {
	public static void main(String[] args) {
		/*
		 * If we don't use the decimal point, then Java interprets the number as
		 * an int.
		 */
		System.out.println(3 / 2);
		/*
		 * If we use a decimal point in any of the numbers in our expression,
		 * then Java interprets all the numbers in the expression as double.
		 */
		System.out.println(3.0 / 2);
		System.out.println(3 / 2.0);
		System.out.println(3.0 / 2.0);
		// * and / have higher precedence than + and -
		System.out.println(3.0 * 1.5 - 2.5);
		System.out.println(-2.5 + 3.0 * 1.5);
		System.out.println(3.0 * (1.5 - 2.5));
		// Operators with the same precedence are evaluated in order of
		// occurrence. Use parentheses to control order of evaluation.
		System.out.println(3.0 / 2.0 * 3.0);
		System.out.println((3.0 / 2.0) * 3.0);
		System.out.println(3.0 / (2.0 * 3.0));
	}
}
