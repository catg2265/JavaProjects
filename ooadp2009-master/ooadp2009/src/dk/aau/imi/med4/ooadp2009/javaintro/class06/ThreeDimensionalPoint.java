package dk.aau.imi.med4.ooadp2009.javaintro.class06;

/**
 * Inheritance, "extends", "super", toString method.
 * 
 * We indicate that this class is a subclass of some other class by using the
 * "extends" keyword in the class header as follows:
 */
public class ThreeDimensionalPoint extends Point {

	/**
	 * A ThreeDimensionalPoint contains all the fields in Point (i.e., x and y)
	 * and also has one extra field called z to represent the co-ordinate in the
	 * third space dimension.
	 */
	private double z;

	/**
	 * A constructor must have the same name as its class. Therefore a class
	 * cannot inherit a constructor! If we want a no-args constructor for a
	 * subclass, we therefore have to explicitly define it. The first thing a
	 * no-args constructor does is call the no-args constructor of its
	 * superclass. However this is not explicitly written in the constructor. In
	 * this case, the no-args constructor will first set the x and y fields to 0
	 * using the Point() constructor and then call the line setZ(0).
	 * 
	 * In other words, there is an invisible call to the superclass's no-args
	 * constructor (in this case Point()) that comes before the first written
	 * line of this class's no-args constructor.
	 */
	public ThreeDimensionalPoint() {
		setZ(0.0);
	}

	/**
	 * Now we define a constructor that takes some values to initialize the
	 * fields in the object being constructed. This class inherits the private x
	 * and y fields from its superclass, Point. These fields have to be set to
	 * the values given in the x and y arguments of this constructor.
	 * 
	 * It is usually best to do this by calling an appropriate constructor
	 * defined on the superclass as the first line in the constructor. This is
	 * done by using the "super" construct. In this case,
	 * 
	 * super(x, y)
	 * 
	 * calls the constructor of Point that takes two double arguments (since x
	 * and y are both doubles) (i.e., it calls Point(double x, double y)).
	 */
	public ThreeDimensionalPoint(double x, double y, double z) {
		super(x, y);
		setZ(z);
	}

	/*
	 * This class inherits getters and setters for x and y from the Point class.
	 * We therefore only have to define a getter and a setter for the new z
	 * field.
	 */

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	/**
	 * We define an appropriate toString method - see discussion in Point.java
	 * class.
	 * 
	 * This toString method overrides the one defined in Point.java
	 */
	public String toString() {
		return "("+getX()+","+getY()+","+getZ()+")";
	}
}
