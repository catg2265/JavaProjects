package dk.aau.imi.med4.ooadp2009.javaintro.classex;

import dk.aau.imi.med4.ooadp2009.javaintro.classex.solutions.Rect;

public class TestRectangle {
	public static void main(String[] args) {

		/*
		 * First we create an instance of the Rect class by using a no-args
		 * constructor.
		 */
		Rect r = new Rect();

		/*
		 * A Rect object is defined by two points, one representing its upper
		 * left corner and one representing its lower right corner. The Point
		 * class from the teaching examples is available in this package, so we
		 * can use it to create Points. The no-args constructor for the Rect
		 * class uses two Point fields, called topLeft and bottomRight to store
		 * the top left and bottom right corners of the rectangle, respectively.
		 * 
		 * The no-args constructor for the Rect class should set both the
		 * topLeft and the bottomRight fields to be equal to (0,0).
		 * 
		 * Let's print out the values of the topLeft and bottomRight fields in
		 * r.
		 * 
		 * Note that you need to define a getter method for each of the two
		 * fields in the Rect class.
		 */

		System.out.println("topLeft = " + r.getTopLeft() + ", bottomRight = "
				+ r.getBottomRight());
		/*
		 * This line should print out
		 * 
		 * topLeft = (0.0,0.0), bottomRight = (0.0,0.0)
		 */

		/*
		 * Now let's set the values of the fields in r to different values using
		 * setter methods that you have to define for the Rect class.
		 * 
		 * We'll set the top left corner of the rectangle to be (1,7) and the
		 * bottom right corner of the rectangle to be (4,1.5).
		 */

		Point topLeft = new Point(1, 7);
		Point bottomRight = new Point(4, 1.5);
		r.setTopLeft(topLeft);
		r.setBottomRight(bottomRight);

		/*
		 * Now let's print out the new values of the fields in r.
		 */
		System.out.println("topLeft = " + r.getTopLeft() + ", bottomRight = "
				+ r.getBottomRight());
		/*
		 * This line should print out
		 * 
		 * topLeft = (1.0,7.0), bottomRight = (4.0,1.5)
		 */

		/*
		 * We now create a new Rect object, called s, using a constructor that
		 * takes two Point arguments. The first argument gives the topLeft value
		 * and the second argument gives the bottomRight value.
		 * 
		 * You need to define the appropriate constructor in the Rect class.
		 */

		topLeft = new Point(2, 3.5);
		bottomRight = new Point(6, 0.5);
		Rect s = new Rect(topLeft, bottomRight);

		/*
		 * Let's print out the values of the fields in s.
		 */
		System.out.println("s.topLeft = " + s.getTopLeft()
				+ ", s.bottomRight = " + s.getBottomRight());
		/*
		 * This line should print out
		 * 
		 * s.topLeft = (2.0,3.5), s.bottomRight = (6.0,0.5)
		 */

		/*
		 * Now define a toString method for the Rect class so that the following
		 * line prints out
		 * 
		 * s is [(2.0,3.5),(6.0,0.5)]
		 */
		System.out.println("s is " + s);

		/*
		 * Similarly, the following line should print out
		 * 
		 * r is [(1.0,7.0),(4.0,1.5)]
		 */
		System.out.println("r is " + r);

		/*
		 * Now define methods for the Rect class that return the width and
		 * height of the Rect object. Defining these methods should allow the
		 * following four lines to work.
		 */
		System.out.println("Width of r is " + r.getWidth());
		// Should print: Width of r is 3.0
		System.out.println("Height of r is " + r.getHeight());
		// Should print: Height of r is 5.5
		System.out.println("Width of s is " + s.getWidth());
		// Should print: Width of s is 4.0
		System.out.println("Height of s is " + s.getHeight());
		// Should print: Height of s is 3.0

		/*
		 * Now define a method for the Rect class that returns the area of the
		 * rectangle represented by the Rect object. The following two lines
		 * should work after you've defined this method.
		 */
		System.out.println("Area of s is " + s.getArea());
		// Should print: Area of s is 12.0
		System.out.println("Area of r is " + r.getArea());
		// Should print: Area of r is 16.5

	}
}
