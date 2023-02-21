package dk.aau.imi.med4.ooadp2009.javainter.lesson07;

public class Point implements Comparable<Point>{

	private Integer x = null;
	private Integer y = null;
	
	public Point() {
		setX(0);
		setY(0);
	}
	
	public Point(Integer x, Integer y) {
		setX(x);
		setY(y);
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	/**
	 * a.compareTo(b) < 0, then a < b
	 * a.compareTo(b) > 0, then a > b
	 * a.compareTo(b) == 0, then a.equals(b)
	 * 
	 * Here compareTo implements lexicographical ordering
	 */
	public int compareTo(Point o) {
		if (o.getX() < getX()) return 1;
		if (o.getX() > getX()) return -1;
		if (o.getY() < getY()) return 1;
		if (o.getY() > getY()) return -1;
		return 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Point)) return false;
		Point p = (Point)obj;
		if (!p.getX().equals(getX())) return false;
		if (!p.getY().equals(getY())) return false;
		return true;
	}
	
	public int power(Integer a, Integer b) {
		int output = 1;
		for(int i = 0; i < b; i++) output *= a;
		return output;
	}
	
	@Override
	public int hashCode() {
		return power(2, getX()) * power(3, getY()) % 10000;
	}
	
	@Override
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
	public static void main(String[] args) {
		Point p = new Point(3,2);
		System.out.println(p.hashCode());
		p.setX(4);
		System.out.println(p.hashCode());
		System.out.println((new Point(0,0)).hashCode());
	}
	
}
