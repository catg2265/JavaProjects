package dk.aau.imi.med4.ooadp2009.javainter.lesson03;

public class StaticTest {
	
	private static void printHello() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		/*
		 * The printHello() method, defined above, is declared as static.
		 * This means we can call it from the main method without having
		 * to first instantiate this class.
		 * 
		 * Conversely, if we want to call a method before instantiating
		 * its class, then the method has to be static.
		 */
		
		printHello();
		
		/*
		 * We can, however, also call a static method on a specific instance of 
		 * its class, as shown here:
		 */
		(new StaticTest()).printHello();
		
		/*
		 * or
		 */
		
		StaticTest s = new StaticTest(); 	//Remember Java provides a no-args constructor,
											//if no constructor is explicitly defined.
		s.printHello(); //Here we get a warning in Eclipse (yellow underline), telling us
						//that we're calling a static method on an instance rather than on
						//the class. We get this warning because it's generally considered
						//bad style to call a static method on an individual object. This is
						//because another programmer looking at your code might mistakenly think
						//that the method is not static.
		
						//So in general, you should call static methods on classes, not objects.
		
		/*
		 * Finally, we now know why the main method is declared as static. This is because it
		 * is the entry point to the program, so it is called by the runtime before any classes
		 * have been instantiated. Therefore it cannot be run on an instantiated object because
		 * at the time that it needs to be called, there are no objects to call it on!
		 * 
		 * Therefore the main method is always static.
		 */
	}
}
