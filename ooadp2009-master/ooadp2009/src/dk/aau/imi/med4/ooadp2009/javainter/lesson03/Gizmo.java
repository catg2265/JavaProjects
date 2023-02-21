package dk.aau.imi.med4.ooadp2009.javainter.lesson03;

/**
 * Example of a static method
 */
public class Gizmo {

	/**
	 * numberOfGizmos stores the number of Gizmos that have been constructed. It
	 * is static, which means that there is only one copy of this variable,
	 * stored in the class itself. Each Gizmo object does not have its own copy
	 * of this field.
	 */
	private static int numberOfGizmos = 0;

	/**
	 * id stores the id of this Gizmo. Mustn't be initialized here because it
	 * has to be initialized in the constructor.
	 */
	private final int id;

	public Gizmo() {
		// Increase static field numberOfGizmos before setting id.
		id = ++numberOfGizmos;
	}

	/** 
	 * @return The current value of the static field numberOfGizmos.
	 */
	public static int getNumberOfGizmos() {
		return numberOfGizmos;
	}

	/*
	 * No setter method for numberOfGizmos because we want it only to be set in
	 * the constructor.
	 */

	/*
	 * No setter method for the id field - it is final so it cannot be set after
	 * it has been initialized in the constructor.
	 */

	/**
	 * @return Returns the value of the final field, id
	 */
	public int getId() {
		return id;
	}

	public String toString() {
		return "Gizmo with id " + id;
	}
}
