package dk.aau.imi.med4.ooadp2009.javaintro.class03;

public class Point {
	public double x, y;

	public Point() {
		x = 2.0;
		y = 3.0;
	}

	/**
	 * Constructor that takes two double arguments, x and y.
	 * 
	 * The special "this" reference refers to the object that is
	 * being constructed. So, for example, if we say
	 * 
	 * Point p = new Point(3,5);
	 * 
	 * then "this" refers to p.
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
































