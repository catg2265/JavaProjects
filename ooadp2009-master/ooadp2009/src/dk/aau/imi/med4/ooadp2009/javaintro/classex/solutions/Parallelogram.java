package dk.aau.imi.med4.ooadp2009.javaintro.classex.solutions;

import dk.aau.imi.med4.ooadp2009.javaintro.classex.Point;

public class Parallelogram extends Rect {
	private double topRightX = 0.0;

	public Parallelogram() {
		super();
		setTopRightX(0.0);
	}
	
	public Parallelogram(Point topLeft, Point bottomRight, double topRightX) {
		super(topLeft,bottomRight);
		setTopRightX(topRightX);
	}
	
	public double getTopRightX() {
		return topRightX;
	}

	public void setTopRightX(double topLeftX) {
		this.topRightX = topLeftX;
	}
	
	public String toString() {
		return "[" + getTopLeft() + "," + getBottomRight() + "," + getTopRightX() + "]";
	}
	
	public double getWidth() {
		if (getTopRightX() > getBottomRight().getX())
			return 2 * getTopRightX() - getBottomRight().getX() - getTopLeft().getX();
		else
			return getBottomRight().getX() - getTopLeft().getX();
	}
	
	public double getArea() {
		return (getTopRightX() - getTopLeft().getX()) * (getTopLeft().getY() - getBottomRight().getY());
	}
}
