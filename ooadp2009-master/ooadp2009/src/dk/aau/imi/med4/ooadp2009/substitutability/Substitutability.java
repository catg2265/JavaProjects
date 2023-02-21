package dk.aau.imi.med4.ooadp2009.substitutability;

import java.util.ArrayList;

public class Substitutability {
	public static void main(String[] args) {		
		//Create an ArrayList to hold Shape objects
		ArrayList<Shape> shapeList = 
			new ArrayList<Shape>();
		//Create a Shape object
		Shape shape = new Shape();
		//Create at Triangle object
		Triangle triangle = new Triangle();
		//Create a Circle object
		Circle circle = new Circle();
		//Create a Square object
		Square square = new Square();
		//Add all the Shape objects to shapeList
		shapeList.add(shape);
		shapeList.add(triangle);
		shapeList.add(circle);
		shapeList.add(square);
		//Print out the objects in shapeList
		for (Shape s : shapeList) {
			s.display();
		}
	}
}

