package dk.aau.imi.med4.ooadp2009.javaintro.class04;

/**
 * Private fields, public getter and setter methods
 */
public class TestPoint {
	public static void main(String[] args) {

		// Let's make a Point object and print its values

		Point p = new Point(2.0, 3.0);
//		 System.out.println("p.x = " + p.x + " and p.y = " + p.y);
		// Cannot do this because x and y fields are now private and therefore
		// invisible outside of a Point object.

		// So we have to use the getter methods in the Point class to access the
		// x and y values of p.

		System.out.println("p.x = " + p.getX() + " and p.y = " + p.getY());

		// Now let's change the values of the x and y fields in p:
		// p.x = 2 * p.x;
		// p.y = 3 * p.y;
		// Can't do this because we can't access the x and y fields directly.

		// Have to use the setter methods defined in the Point class:
		p.setX(2 * p.getX());
		p.setY(3 * p.getY());

		System.out.println("p.x = " + p.getX() + " and p.y = " + p.getY());

		// Note that setY and setX are methods defined on the Point class. To
		// call a method on an object of a particular class, you first write the
		// name of the object, then a dot ("."), then the name of the method
		// followed by parentheses. Any arguments to the method go between the
		// parentheses. A method is essentially a function that acts on the
		// object for which it is defined. So if we write

		// p.doSomething(x,y);

		// you can interpret this as an instruction to p to doSomething with the
		// arguments x and y.

		// Note that it is good practice to use getters and setters in
		// constructors too. This usually avoids the need to use the "this"
		// reference.

	}
}
