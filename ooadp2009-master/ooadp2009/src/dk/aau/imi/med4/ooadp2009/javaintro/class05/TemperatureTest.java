package dk.aau.imi.med4.ooadp2009.javaintro.class05;

/**
 * Why we use getters and setters rather than public fields - so we can change
 * the implementation of a class without changing the interface
 */
public class TemperatureTest {
	public static void main(String[] args) {

		// Let's construct a Temperature object and set the temperature it
		// represents to various values.

		Temperature t = new Temperature();

		t.setCelsius(0); // Sets the temperature represented by t to 0 degrees
		// celsius
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		t.setFahrenheit(0); // Sets the temperature represented by t to 0
		// degrees Fahrenheit
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		t.setCelsius(100); // Sets the temperature represented by t to 100
		// degrees celsius
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		t.setFahrenheit(100); // Sets the temperature represented by t to 100
		// degrees Fahrenheit
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		t.setCelsius(-40); // Sets the temperature represented by t to -40
		// degrees celsius
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		t.setFahrenheit(-40); // Sets the temperature represented by t to -40
		// degrees Fahrenheit
		System.out.println("Temperature of t is " + t.getFahrenheit()
				+ " degrees fahrenheit and " + t.getCelsius()
				+ " degrees celsius");

		/*
		 * If we had used public fields and accessed them directly, we would
		 * have had to do the conversion every time we accessed or set the 
		 * field values and manually made sure that they were always in
		 * agreement with each other.
		 */
	}
}
