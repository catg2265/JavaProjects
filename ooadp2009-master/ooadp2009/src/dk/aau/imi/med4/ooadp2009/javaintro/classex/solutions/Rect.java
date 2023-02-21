package dk.aau.imi.med4.ooadp2009.javaintro.classex.solutions;

import dk.aau.imi.med4.ooadp2009.javaintro.classex.Point;

public class Rect {
	private Point topLeft = null;
	private Point bottomRight = null;
	
	public Rect() {
		setTopLeft(new Point(0,0));
		setBottomRight(new Point(0,0));
	}
	
	public Rect(Point topLeft, Point bottomRight) {
		setTopLeft(topLeft);
		setBottomRight(bottomRight);
	}
	
	public Point getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}
	public Point getBottomRight() {
		return bottomRight;
	}
	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	}
	
	public double getWidth() {
		return (getBottomRight().getX() - getTopLeft().getX());
	}
	
	public double getHeight() {
		return (getTopLeft().getY() - getBottomRight().getY());
	}
	
	public double getArea() {
		return getWidth() * getHeight();
	}
	
	public String toString() {
		return "[" + getTopLeft()+","+getBottomRight()+"]";
	}
}
