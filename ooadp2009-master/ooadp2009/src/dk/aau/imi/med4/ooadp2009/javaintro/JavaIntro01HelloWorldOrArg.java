package dk.aau.imi.med4.ooadp2009.javaintro;

/**
 * A program that prints the string "Hello world!" to the console
 * or a command-line argument if one is provided.
 */
public class JavaIntro01HelloWorldOrArg {
	
	/**
	 * Main method
	 * @param args Array of Strings containing command-line parameters.
	 */
	public static void main(String[] args) {
		String s = "";
		if (args.length > 0) {
			for (String q: args) {
				s += " " + q;
			}
		}
		System.out.println("Hello world!"+s);
	}
}

//public class AnotherPublicClass {
//	
//}

//class APrivateClass {
//	
//}
