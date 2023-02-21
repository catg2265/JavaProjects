package dk.aau.imi.med4.ooadp2009.javainter.lesson05;

/**
 * Illustrates the use of interfaces.
 * 
 * An interface is like a class in which all the methods are abstract.
 * 
 * An interface contains no implemented methods - it is pure design. An abstract
 * class is a mixture of design and implementation and a concrete class is pure
 * implementation.
 * 
 * An interface contains a collection of method declarations that form a
 * contract for a type.
 * 
 * A class can only extend a single superclass but it can implement more than
 * one interface. This means that a class can fulfil many different roles, each
 * defined by a different interface.
 * 
 * "Every major class in an application should be an implementation of some
 * interface that captures the contract of that class." (Arnold et al, 2006, p.
 * 117)
 * 
 * Liskov substitutability principle applies to implemented interfaces as well
 * as superclasses: a reference to any interface implemented by a class, C, can
 * refer to an object of class, C.
 * 
 * Interfaces can be variable types just as classes can.
 * 
 * An interface can extend more than one superinterface.
 * 
 * An interface can define constants, that is, public, static, final fields. The
 * modifiers are always omitted by convention.
 * 
 * All methods in an interface must be public and abstract. The modifiers are
 * omitted by convention.
 */
public class Interfaces {
	public static void main(String[] args) {
		Car car = new Car(1800.0, 12.0, FuelType.PETROL, 200.0);
		House house = new House("Ny Kastet Vej 20, 9000 Aalborg", 1200.0,
				120.0, 6);
		MobileHome mobileHome = new MobileHome("Aalborg Camp site", 0.0, 30.0,
				2, 4500.0, 6.0, FuelType.DIESEL, 150.0);

		Home[] homes = { house, mobileHome };
		Vehicle[] vehicles = { mobileHome, car };

		// Note that mobileHome can act as a Vehicle and as a Home because it
		// implements both interfaces.

		System.out.println("Some homes:");
		for (Home home : homes)
			System.out.println(home);

		System.out.println("\nSome vehicles:");
		for (Vehicle vehicle : vehicles)
			System.out.println(vehicle);
	}
}
