package dk.aau.imi.med4.ooadp2009.javaintro.class03;

/**
 * Default values, Constructors with arguments, this reference
 */
public class TestPoint {
	public static void main(String[] args) {

		/*
		 * If we create a Point object with the default "no-args" constructor,
		 * then all the numeric fields in the object are set to zero by default.
		 */

		Point p = new Point();
		System.out.println("p.x = " + p.x + " and p.y = " + p.y);

		/*
		 * However, we can override the default no-args constructor and have
		 * Java initialize the fields to different values. [Create a new no-args
		 * constructor in Point.java] [Re-run program]
		 */

		// [Make a constructor that sets the values of instance variables.]
		p = new Point(3, 5);
		System.out.println("p.x = " + p.x + " and p.y = " + p.y);

		Point q = new Point(5.5, 7.5);
		System.out.println("q.x = " + q.x + " and q.y = " + q.y);

		Point r = new Point(q.x + p.x, q.y + p.y);
		System.out.println("r.x = " + r.x + " and r.y = " + r.y);

		/*
		 * If the no-args constructor in Point.java is now commented out, then
		 * there will be an error. If a constructor with arguments is defined,
		 * then the default no-args constructor becomes undefined. So if we have
		 * a constructor with arguments and we also want a no-args constructor,
		 * then we have to explicitly define the no-args constructor.
		 */

	}
}
