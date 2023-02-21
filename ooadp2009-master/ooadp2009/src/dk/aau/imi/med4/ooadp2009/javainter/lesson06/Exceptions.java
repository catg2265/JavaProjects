package dk.aau.imi.med4.ooadp2009.javainter.lesson06;

/**
 * This lesson shows how exception handling is done in Java.
 */
public class Exceptions {

	public static int getDigitValue(char c) throws InvalidArgumentException {
		int[] valArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		if (Character.isDigit(c)) {
			String s = "0123456789";
			return valArray[s.indexOf(c)];
		} else
			throw new InvalidArgumentException(
					"Invalid character argument passed to getDigitValue (" + c
							+ ").");
	}

	public static int parseInt(String s) throws InvalidArgumentException {

		int multiplier = 1;
		int output = 0;

		// Deal with first character in input string which must be a '-' or a
		// digit.
		if (s.charAt(0) == '-')
			multiplier = -1;
		else if (Character.isDigit(s.charAt(0)))
			output = getDigitValue(s.charAt(0));
		else
			throw new InvalidArgumentException(
					"First character in String argument to parseInt is not valid ("
							+ s + ")");

		// Deal with subsequent characters which must all be digits.
		for (int i = 1; i < s.length(); i++) {
			output = (10 * output) + getDigitValue(s.charAt(i));
		}
		return output * multiplier;
	}

	public static void main(String[] args) throws InvalidArgumentException
	// Can cause calling method to throw an exception:
	// throws InvalidArgumentException
	{
		// Can surround with a try...catch block:
//		try {
			System.out.println(parseInt("123"));
			System.out.println(parseInt("0123"));
			System.out.println(parseInt("-123"));
			System.out.println(parseInt("-0123"));
//			System.out.println(parseInt("123.0"));
//			 System.out.println(parseInt("12c3"));
			 System.out.println(parseInt("+123"));
//		} catch (InvalidArgumentException e) {
//			// Define what should be done if an InvalidArgumentException is
//			// caught:
//			e.printStackTrace();
//		} 
		// The following line only prints out when the try...catch block is
		// used.
		// If the main method is made to throw an exception, then the method
		// returns before the following line is executed.
		System.out.println("They think it's all over...it is now!");
	}
}
