package dk.aau.imi.med4.ooadp2009.javainter.lesson03;

/**
 * Illustrates use of static methods. A static method is one that is defined for
 * a class rather than an object. You call a static method by giving the class
 * name, followed by a dot, followed by the method name and its arguments.
 * 
 * The main method is an example of a static method.
 * 
 * The Gizmo class contains a static method that returns the number of Gizmos
 * constructed so far.
 */
public class StaticMethods {

	public static void main(String[] args) {
		Gizmo[] gizmoArray = new Gizmo[10];
		for (int i = 0; i < gizmoArray.length; i++)
			gizmoArray[i] = new Gizmo();
		for (Gizmo gizmo : gizmoArray)
			System.out.println(gizmo);

		/*
		 * We now call the static method, getNumberOfGizmos to print out the 
		 * number of Gizmos created.
		 * 
		 * Note that we call the getNumberOfGizmos() method on the class itself,
		 * not on any specific instance of the class.
		 */
		System.out.println("numberOfGizmos = " + Gizmo.getNumberOfGizmos());

		/*
		 * Several standard classes also have useful static methods.
		 * 
		 * For example, the wrapper classes for the primitive numeric types 
		 * have parseXXX methods that interpret a String of characters as a 
		 * numeric value.
		 * 
		 * Here are some examples
		 */
		
		Integer i = Integer.parseInt("123");
		System.out.println(2*i);
		
		Double d = Double.parseDouble("123.456");
		System.out.println(2*d);
		
	}
}
