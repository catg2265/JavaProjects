package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

/**
 * This package illustrates the use of abstract classes.
 * 
 * An abstract method is one that is not implemented.
 * 
 * An abstract class is one that contains at least one abstract method.
 * 
 * An abstract class cannot be instantiated because not all of its methods are
 * implemented.
 * 
 * In this example, we have an abstract class, Shape, and two concrete 
 * subclasses of shape, Circle and Rectangle.
 * 
 * We instantiate some Circles and Rectangles and put them in an array
 * of Shapes, then iterate over this array, applying various methods
 * to each Shape object in the array (whose runtime type will be
 * either Circle or Rectangle).
 */
public class AbstractClasses {
	public static void main(String[] args) {
		
		/*
		 * Cannot instantiate a Shape object because it is abstract.
		 * 
		 * So the following line is illegal (try uncommenting it).
		 */
		
//		Shape s = new Shape();
		
		/*
		 * The Circle and Rectangle classes are subclasses of Shape. They
		 * are concrete classes, so we can instantiate them as follows:
		 */
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.5,new Point(3.0,3.0));
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(new Point(1.0,4.0), new Point(4.0,1.0));
		
		/*
		 * Now we have some Circles and some Rectangles, we can bung them all
		 * in a single array of type Shape[], because both Circles and Rectangles
		 * are Shapes (i.e., they are specializations of Shape).
		 * 
		 */
		
		Shape[] shapes = {c1, c2, r1, r2};
		
		/*
		 * We can now iterate over the shapes array using the enhanced for loop.
		 * 
		 * Note that the variable s is a polymorphic variable of type Shape, so
		 * it can only access the properties and methods of an object that it shares
		 * with Shape.
		 * 
		 * All Shape objects have getHeight, getWidth, getArea, getTopLeft, getBottomRight
		 * and translate methods, though the way they are implemented depends on their
		 * runtime type (i.e., whether they are Circles or Rectangles).
		 * 
		 * The method calls in the inner for loop below therefore illustrate dynamic binding.
		 */
		
		for (Shape s : shapes) {
			for (int i = 0; i < 2; i++) {
				System.out.print(s);
				System.out.println(" height = " + s.getHeight());
				System.out.println(" width = " + s.getWidth());
				System.out.println(" area = " + s.getArea());
				System.out.println(" topLeft = " + s.getTopLeft());
				System.out.println(" bottomRight = " + s.getBottomRight());
				s.translate(new Vec(3.0,2.0));
			}
		}
	}
}
