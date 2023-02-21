package dk.aau.imi.med4.ooadp2009.javainter.lesson01;

/**
 * Explains use of a static field to store number of a particular type of object
 * that has been created.
 */
public class Gizmo {

	/**
	 * numberOfGizmos stores the number of Gizmos that have been constructed. It
	 * is static, which means that there is only one copy of this variable,
	 * stored in the class itself. Each Gizmo object does not have its own copy
	 * of this field.
	 */
	public static int numberOfGizmos = 0; //Note that name is in italics in Eclipse

	/**
	 * n is not declared as static, so there is a separate copy of n for each Gizmo
	 * instance.
	 */
	public int n = 0;

	/**
	 * id stores the id of this Gizmo. It is non-static, so there is a separate copy
	 * for each Gizmo instance.
	 */
	public int id = 0;

	/**
	 * nid is another non-static variable that is updated using the value of n instead
	 * of using the value of the static field, numberOfGizmos.
	 */
	public int nid = 0;

	public Gizmo() {
		/*
		 * We increment the value of the static field, numberOfGizmos,
		 * and then assign the result to the non-static variable id.
		 * 
		 * Because numberOfGizmos is static, there is only one copy of it,
		 * stored in the class itself (not any particular instance of the
		 * class). Therefore each time a new Gizmo is instantiated using the 
		 * Gizmo() no-args constructor, the static value of numberOfGizmos is
		 * incremented and the Gizmo gets a unique value for its id variable.
		 */
		
		id = ++numberOfGizmos;

		/*
		 * We then increment n (which is not static) and assign 
		 * the resulting value to nid.
		 * 
		 * Because n is initialized to 0 and there is a separate copy of
		 * the variable for each instance, nid will always be set to 1
		 * for each instance of Gizmo.
		 */
		
		nid = ++n; 
	}

	public String toString() {
		return "Gizmo:\n"
				+ " numberOfGizmos = " + numberOfGizmos + "; "
				+ " n = " + n + "; "
				+ " id = " + id + "; "
				+ " nid = " + nid + "\n";
	}


}
