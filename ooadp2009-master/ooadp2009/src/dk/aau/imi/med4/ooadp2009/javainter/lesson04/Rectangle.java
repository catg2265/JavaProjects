package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

/**
 * Rectangle encapsulates a rectangle.
 * 
 * Reference point is top left corner.
 * 
 * Also stores width and height explicitly as fields.
 */
public class Rectangle extends Shape {

	private Double width = null;
	private Double height = null;
	
	public Rectangle() {
		setReferencePoint(new Point());
		setWidth(1.0);
		setHeight(1.0);
	}
	
	public Rectangle(Point topLeft, Point bottomRight) {
		setReferencePoint(topLeft);
		setWidth(bottomRight.getX() - topLeft.getX());
		setHeight(topLeft.getY() - bottomRight.getY());
	}
	
	public void setWidth(Double width) {
		this.width = width;
	}

	@Override
	public Double getWidth() {
		return width;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double getHeight() {
		return height;
	}

	@Override
	public Double getArea() {
		return getHeight() * getWidth();
	}

	@Override
	public Point getBottomRight() {
		Double x = getReferencePoint().getX() + width;
		Double y = getReferencePoint().getY() - height;
		return new Point(x,y);
	}

	@Override
	public Point getTopLeft() {
		return getReferencePoint();
	}

	public String toString() {
		return "Rectangle(topLeft = "+ getTopLeft()+", bottomRight = "+getBottomRight()+")";
	}
}
