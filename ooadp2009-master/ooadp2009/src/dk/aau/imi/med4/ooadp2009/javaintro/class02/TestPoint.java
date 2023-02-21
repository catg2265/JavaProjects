package dk.aau.imi.med4.ooadp2009.javaintro.class02;

/**
 * Null and reference types
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

		// Set the values of x and y in p to 1.5 and 2.5, respectively.
		p.x = 1.5;
		p.y = 2.5;

		// Print out the values of x and y in p.
		System.out.println("p.x = " + p.x + " and p.y = " + p.y);

		// Declare a Point variable called q but do not make it refer to any
		// Point object. We do this by setting it to equal null.
		// Any variable that can refer to an object can also be set to null,
		// meaning that it refers to "nothing".
		Point q = null;

		// Let's see what happens when we print out q.
		System.out.println("q = " + q); // Java prints out "null"

		/*
		 * Every variable that refers to an object in Java is actually a
		 * "reference" which is the same as a pointer in C. So when we set q to
		 * "equal" p, we are actually just making q "refer to" (or point at) the
		 * same thing that p is referring to.
		 */

		q = p; // This makes q refer to the same object as p refers to.

		// So now we can print out q.x which will give the same as printing out
		// p.x
		System.out.println("q.x = " + q.x);
		// Similarly for q.y:
		System.out.println("q.y = " + q.y);
		/*
		 * Notice that q.x is the same as p.x and that q.y is the same as p.y.
		 * This is because q is now referring to exactly the same object as p.
		 */

		// Let's now multiply the value of q.x by 2 and print it out.
		q.x = q.x * 2;
		System.out.println("q.x = " + q.x);

		/*
		 * q.x is now 3.0. But q refers to the same object as p does, so p.x is
		 * also now 3.0.
		 */
		System.out.println("p.x = " + p.x);

		/*
		 * Let's create a new Point object, set p to refer to it and set the x
		 * and y fields in the new object to equal 10.0 and 20.0, respectively.
		 */

		p = new Point();
		p.x = 10.0;
		p.y = 20.0;

		/*
		 * Now p and q refer to DIFFERENT Point objects:
		 */

		System.out.println("p.x = " + p.x + " and p.y = " + p.y);
		System.out.println("q.x = " + q.x + " and q.y = " + q.y);
		/*
		 * Note that q is still pointing to the first Point object we created!
		 */

		/*
		 * If we now set q to null, then we no longer have any variables that
		 * refer to the first object we made. This means that we will never be
		 * able to access that object again. If we did this in C, the object
		 * would remain in the memory space and use up memory unnecessarily.
		 * This is why in C we have to deallocate the memory used by all our
		 * objects after we have finished using them. However, in Java, there is
		 * a "Garbage Collector" that periodically goes through the memory space
		 * ("heap") and automatically seeks and destroys objects that are not
		 * referred to by any variables.
		 */
		
		q = null; //Goodbye, Point object!
	}
}
