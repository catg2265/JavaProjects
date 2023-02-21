package dk.aau.imi.med4.ooadp2009.javainter.lesson04;

public abstract class Shape {
	private Point referencePoint = null;
	
	abstract public Double getHeight();
	abstract public Double getWidth();
	abstract public Double getArea();
	abstract public Point getTopLeft();
	abstract public Point getBottomRight();

	public Point getReferencePoint() {
		return referencePoint;
	}
	
	public void setReferencePoint(Point point) {
		this.referencePoint = point;
	}
	
	public void translate(Vec vec) {
		setReferencePoint(getReferencePoint().translate(vec));
	}
}
