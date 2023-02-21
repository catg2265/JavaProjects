package dk.aau.imi.med4.ooadp2009.javaintro.class05;

public class Temperature {

	// Because we make the fields private, we can change the implementation
	// without changing the interface.

	private double fahrenheit;
// 	private double celsius;

	public double getFahrenheit() {
		return fahrenheit;
//		return (celsius * 9/5) + 32;
	}

	public void setFahrenheit(double fahrenheit) {
		this.fahrenheit = fahrenheit;
//		celsius = (fahrenheit - 32) * 5/9;
	}

	public double getCelsius() {
		return (fahrenheit - 32) * 5 / 9;
//		return celsius;
	}

	public void setCelsius(double celsius) {
		fahrenheit = (celsius * 9 / 5) + 32;
//		this.celsius = celsius;
	}

}
