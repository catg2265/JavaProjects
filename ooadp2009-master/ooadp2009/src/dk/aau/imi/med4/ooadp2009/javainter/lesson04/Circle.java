package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

/**
 * Circle encapsulates a circle.
 * 
 * Reference point is centre.
 */
public class Circle extends Shape {

	private Double radius = null;
	
	public Circle() {
		setRadius(1.0);
		setReferencePoint(new Point());
	}
	
	public Circle(Double radius, Point centre) {
		setRadius(radius);
		setReferencePoint(centre);
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double getArea() {
		return Math.PI * getRadius() * getRadius();
	}

	@Override
	public Point getBottomRight() {
		Double x = getReferencePoint().getX() + getRadius();
		Double y = getReferencePoint().getY() - getRadius();
		return new Point(x,y);
	}

	@Override
	public Point getTopLeft() {
		Double x = getReferencePoint().getX() - getRadius();
		Double y = getReferencePoint().getY() + getRadius();
		return new Point(x,y);
	}

	@Override
	public Double getHeight() {
		return 2*getRadius();
	}

	@Override
	public Double getWidth() {
		return 2*getRadius();
	}

	public String toString() {
		return "Circle(centre="+getReferencePoint()+",radius="+getRadius()+")";
	}
}
