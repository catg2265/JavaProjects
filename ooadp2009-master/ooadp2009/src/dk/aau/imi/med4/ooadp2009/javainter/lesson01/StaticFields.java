package dk.aau.imi.med4.ooadp2009.javainter.lesson01;

public class StaticFields {
	public static void main(String[] args) {
		/*
		 * When we access a static field, we can access it through
		 * the class itself rather than through any specific instance
		 * of the class. Indeed, we don't need to have instantiated 
		 * the class at al in order to be able to print out the value
		 * of one of its static fields.
		 */

		System.out.println("numberOfGizmos = " + Gizmo.numberOfGizmos);
		
		/*
		 * Note that we cannot access a non-static field through the class
		 * because there is a separate copy of such a field for each instance
		 * of the class. So the following is not legal because n is not static.
		 */
		
//		System.out.println("n = " + Gizmo.n);
		
		/* 
		 * We need to first make an instance of the Gizmo class then access its
		 * non-static variables through that instance, as follows:
		 */
		
		Gizmo g = new Gizmo();
		System.out.println("g.n = " + g.n);

		/*
		 * We'll now make 10 Gizmo objects and print them out.
		 */
		Gizmo[] gizmoArray = new Gizmo[10];
		for (int i = 0; i < gizmoArray.length; i++)
			gizmoArray[i] = new Gizmo();
		for (Gizmo gizmo : gizmoArray)
			System.out.println(gizmo);
		
	}

}
