package dk.aau.imi.med4.ooadp2009.javainter.lesson05;

public class House implements Home {

	private String address;
	private Double groundArea;
	private Double internalArea;
	private Integer numberOfRooms;

	public House(String address, Double groundArea, Double internalArea,
			Integer numberOfRooms) {
		this.address = address;
		this.groundArea = groundArea;
		this.internalArea = internalArea;
		this.numberOfRooms = numberOfRooms;
	}

	public String getAddress() {
		return address;
	}

	public Double getGroundArea() {
		return groundArea;
	}

	public Double getInternalArea() {
		return internalArea;
	}

	public Integer getNumberOfRooms() {
		return numberOfRooms;
	}

	public String toString() {
		return "House(address=" + getAddress() + ",groundArea="
				+ getGroundArea() + ",internalArea=" + getInternalArea()
				+ ",numberOfRooms=" + getNumberOfRooms() + ")";
	}
}
