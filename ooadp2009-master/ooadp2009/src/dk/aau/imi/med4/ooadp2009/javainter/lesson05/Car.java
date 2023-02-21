package dk.aau.imi.med4.ooadp2009.javainter.lesson05;

public class Car implements Vehicle {

	private Double engineCapacity = 0.0; // cc
	private Double fuelEconomy = 0.0; // km/l
	private FuelType fuelType;
	private Double topSpeed = 0.0; // km/h

	public Car(Double engineCapacity, Double fuelEconomy, FuelType fuelType,
			Double topSpeed) {
		this.engineCapacity = engineCapacity;
		this.fuelEconomy = fuelEconomy;
		this.fuelType = fuelType;
		this.topSpeed = topSpeed;
	}

	public Double getEngineCapacity() {
		return engineCapacity;
	}

	public Double getFuelEconomy() {
		return fuelEconomy;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public Double getTopSpeed() {
		return topSpeed;
	}

	public String toString() {
		return "Car(engineCapacity=" + getEngineCapacity() + ",fuelEconomy="
				+ getFuelEconomy() + ",fuelType=" + getFuelType()
				+ ",topSpeed=" + getTopSpeed() + ")";
	}
}
