package dk.aau.imi.med4.ooadp2009.javaintro.class01;

/**
 * Demonstrates how to construct an object and how to get, set and modify the
 * values of its fields.
 */
public class TestPoint {
	public static void main(String[] args) {

		/*
		 * Create an instance of the Point class using the default "no-args"
		 * constructor and store this Point object in a variable called p. The
		 * constructor must always have the same name as the class whose objects
		 * it constructs. If no constructor is defined in a class, then Java
		 * creates a default one anyway that takes no arguments.
		 */
		Point p = new Point();

		/*
		 * We refer to a field within an object in Java by writing the variable
		 * name followed by a dot ("."), followed by the name of the field. So we set
		 * the x field in p to equal 1.5 as follows:
		 */
		p.x = 1.5;

		// Set the y field in p to equal 2.5
		p.y = 2.5;

		// Print out the x field in p
		System.out.println("p.x = " + p.x);

		// Print out the y field in p
		System.out.println("p.y = " + p.y);

		// Multiply the value of the x field in p by 2
		p.x = p.x * 2; // What does p.x equal now?

		// Print out the new value of the x field in p
		System.out.println("p.x = " + p.x);

		// Add the value of the x field to the value in the y field and place
		// the result in the y field of p
		p.y = p.x + p.y;

		// Print out the new value of the y field in p
		System.out.println("p.y = " + p.y);

	}
}
