package dk.aau.imi.med4.ooadp2009.javaintro.class04;

/**
 * Illustrating getter and setter methods.
 */
public class Point {

	// Fields are now set to have private visibility. This means that the values
	// of these fields in a Point object can only be seen from inside that Point
	// object.

	private double x, y;

	// Getter and setter methods

	// Because we have now declared our x and y fields to be private, we need to
	// define public methods to access ("get") and modify ("set") the values in
	// these fields from outside a Point object.

	// By convention, a getter method should be called "getVar()" where "var" is
	// the name of the field that is being accessed. A getter method returns a
	// value of an appropriate type (or class). Usually, the return type will be
	// the same as the type of the field that is being accessed, but this is not
	// necessarily always the case.

	// For example, the getter method for the x field in Point is called getX()
	// and returns a double value.

	public double getX() {

		// Note that, within the class, we can refer to private members such as
		// x and y.

		return x;
	}

	// By convention, a setter method should have the signature
	// "public void setVar(VarType newValue)"
	// where the name of the field is var and the
	// type of the field is VarType. The setter will then set the field called
	// var to have the value newValue. A return type of a setter method should
	// usually be void, as they usually don't need to return any values.

	// It is normal for the argument of a setter to be given the same name as
	// the name of the field that is being set. This means that the "this"
	// reference has to be used in the body of the setter in order to avoid
	// ambiguity.

	// For example, the setter method for the x field in Point is called setX,
	// it takes a single double argument called x and its return type is void.

	// You can get Eclipse to automatically write all your getter and setter
	// methods for you once you have defined your fields. Choose
	// "Generate Getters and Setters..." from the "Source" menu.

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	// Our very own no-args constructor, defined to override the default one
	// provided by Java. Remember that, if you define a constructor with
	// arguments, then the default no-args constructor provided by Java becomes
	// undefined, so you have to explicitly define your own if you want one.

	// Note that, within the class, if there is no ambiguity, there is no need
	// to use the "this" reference.
	public Point() {
		setX(0.0);
		setY(0.0);
	}

	/**
	 * Constructor that takes two double arguments, x and y. Now this
	 * constructor uses the setter methods for x and y. Note that a constructor
	 * can use any of the methods defined for a class even though the object
	 * that it constructs is not fully constructed until the constructor has
	 * completed.
	 */
	public Point(double x, double y) {
		setX(x);
		setY(y);
	}

}
