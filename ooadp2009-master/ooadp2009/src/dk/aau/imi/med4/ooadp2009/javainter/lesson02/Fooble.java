package dk.aau.imi.med4.ooadp2009.javainter.lesson02;

/**
 * Illustrates use of final field. A final field is one that cannot be changed
 * after it has been initialized.
 */
public class Fooble {
	public static final double pi = 3.141;

	public final double ip = 1.413;

	public final double beep;

	/**
	 * Here's the no-args constructor for the Fooble class
	 */
	public Fooble() {

		// beep hasn't been initialized so we can set its value in the
		// constructor
		beep = 1.1111;

		// ip has been initialized when it was declared so we can't set its
		// value in the constructor
//		 ip = 3.3333;
	}
}
