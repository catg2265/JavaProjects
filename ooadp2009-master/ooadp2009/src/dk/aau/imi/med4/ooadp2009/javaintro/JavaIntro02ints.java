package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * <h1>int variables</h1>
 * 
 * <ul>
 * <li>a - b subtracts b from a (e.g., 2 - 1 = 1)
 * <li>a + b adds a to b (e.g., 2 + 1 = 3)
 * <li>a * b multiplies a by b (e.g., 4 * 2 = 8)
 * <li>a / b divides a by b. NOTE: This is integer division so the result is the
 * integer part of the result of dividing a by b. For example,
 * <ul>
 * <li>4 / 2 = 2</li>
 * <li>3 / 2 = 1 (the integer part of 1.5)</li>
 * <li>2 / 2 = 1</li>
 * <li>1 / 2 = 0 (the integer part of 0.5)</li>
 * <li>-1 / 2 = 0 (the integer part of -0.5)</li>
 * <li>-3 / 2 = -1 (the integer part of -1.5)</li>
 * </ul>
 * </ul>
 */
public class JavaIntro02ints {
	public static void main(String[] args) {
		/*
		 * Must declare a variable before you can use it. Can initialize a
		 * variable when you declare it. A variable is assigned a value using
		 * the = operator.
		 */
		int a = 1;
		int b = 2;
		int c = -3;
		// Can leave a variable uninitialized when you declare it
		int d;
		int e, f;

		// Use parentheses to explicitly specify precedence.
		d = a + (b * c);
		e = a - (b / c);
		f = c - (b / a);
		int g = (2 * e) - (c / b);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);

		/*
		 * Use System.out.println to print a line to the console and a new line.
		 * Use + operator to concatenate strings and objects.
		 * 
		 */
		System.out.println(d + d);
		System.out.println("a" + d + d);
		System.out.println("a" + (d + d));
		System.out.println(d + d + "a");
		System.out.println(d + "d");
		System.out.println(-3 / 2);
	}
}
