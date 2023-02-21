package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

public class Point {
	private Double x = 0.0;
	private Double y = 0.0;
	
	public Point() {
		setX(0.0);
		setY(0.0);
	}
	
	public Point(Double x, Double y) {
		setX(x);
		setY(y);
	}
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}

	public Point translate(Vec vector) {
		setX(getX()+vector.getX());
		setY(getY()+vector.getY());
		return this;
	}

	public String toString() {
		return "(" + getX() + "," + getY() + ")";
	}
}
