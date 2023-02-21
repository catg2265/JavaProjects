package dk.aau.imi.med4.ooadp2009.javainter.lesson02;

public class FinalFields {
	public static void main(String[] args) {

		// Let's print out the value of the final static field, pi.
		System.out.println("Fooble.pi = " + Fooble.pi);

		// Now try to change value of pi field in Fooble
//		 Fooble.pi = 22.0/7;
		// Can't do it because the pi field is final and it has already been
		// assigned.

		// Now we create a Fooble object. Its final ip field is
		// initialized to 1.413 in the declaration of the ip field.
		Fooble f = new Fooble();
		System.out.println("f.ip = " + f.ip);
		System.out.println("f.beep = " + f.beep);
		System.out.println("f.beep = " + f.pi);
	}

}
