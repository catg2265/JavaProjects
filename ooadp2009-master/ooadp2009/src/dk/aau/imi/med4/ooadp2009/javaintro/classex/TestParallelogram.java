package dk.aau.imi.med4.ooadp2009.javaintro.classex;

import dk.aau.imi.med4.ooadp2009.javaintro.classex.solutions.Parallelogram;

public class TestParallelogram {
	public static void main(String[] args) {
		/*
		 * We first create an instance of the Parallelogram class. Parallelogram
		 * is a subclass of Rect that represents a parallelogram with two sides
		 * parallel to the x axis. The topLeft field and bottomRight field that
		 * Parallelogram inherits from Rect again represent the top left and
		 * bottom right corners of the parallelogram. However, the Parallelogram
		 * class also has a third field called topRightX which gives the x
		 * co-ordinate of the top right corner of the parallelogram.
		 * 
		 * Let's create a Parallelogram object using a no-args constructor. You
		 * will have to define this constructor in the Parallelogram class.
		 */

		Parallelogram para1 = new Parallelogram();

		/*
		 * This no-args constructor should set the topLeft and bottomRight
		 * fields to (0,0) and the topRightX field to 0.0.
		 */

		System.out.println("para1.topLeft is " + para1.getTopLeft()
				+ ", para1.bottomRight is " + para1.getBottomRight()
				+ ", para1.topRightX is " + para1.getTopRightX());

		/*
		 * The previous statement should print out
		 * 
		 * para1.topLeft is (0.0,0.0), para1.bottomRight is (0.0,0.0), para1.topRightX is 0.0
		 */

		/*
		 * Now let's set topLeft in para1 to (1,5), bottomRight in para1 to
		 * (6,1) and topRightX to 8.
		 */

		para1.setTopLeft(new Point(1, 5));
		para1.setBottomRight(new Point(6, 1));
		para1.setTopRightX(8);

		/*
		 * Let's print out the new values of the fields in para1.
		 */

		System.out.println("para1.topLeft is " + para1.getTopLeft()
				+ ", para1.bottomRight is " + para1.getBottomRight()
				+ ", para1.topRightX is " + para1.getTopRightX());

		/*
		 * The previous line should now print out
		 * 
		 * para1.topLeft is (1.0,5.0), para1.bottomRight is (6.0,1.0), para1.topRightX is 8.0
		 */

		/*
		 * Now override the getWidth() method that Parallelogram inherits from
		 * Rect so that it always gives the correct total width of the
		 * parallelogram.
		 */

		System.out.println("Total width of para1 is " + para1.getWidth());

		/*
		 * The previous line should print out
		 * 
		 * Total width of para1 is 9.0
		 */

		/*
		 * Now override the getArea() method that Parallelogram inherits from
		 * Rect so that it always gives the correct result.
		 */
		
		System.out.println("Area of para1 is " + para1.getArea());
		
		/*
		 * The previous line should print out
		 * 
		 * Area of para1 is 28.0
		 */
		
		/*
		 * Now override the toString() method that Parallelogram inherits from
		 * Rect so that it prints out all three fields in Parallelogram.
		 */
		
		System.out.println("para1 is " + para1);
		
		/*
		 * The previous line should print out
		 * 
		 * para1 is [(1.0,5.0),(6.0,1.0),8.0]
		 */
		
		/*
		 * Now you need to define a new constructor for Parallelogram that takes
		 * three arguments, topLeft, bottomRight and topRightX. We should then 
		 * be able to run the following line.
		 */
		
		Parallelogram para2 = new Parallelogram(new Point(3,6), new Point(4,2), 3.5);
		
		/*
		 * If you have defined the getWidth, getArea and toString methods correctly,
		 * then the following three lines should give the output shown.
		 */
		
		System.out.println("para2 is " + para2); 
		//Should print: para2 is [(3.0,6.0),(4.0,2.0),3.5]
		System.out.println("Total width of para2 is " + para2.getWidth());
		//Should print: Total width of para2 is 1.0
		System.out.println("Area of para2 is " + para2.getArea());
		//Should print: Area of para2 is 2.0
	}
}
