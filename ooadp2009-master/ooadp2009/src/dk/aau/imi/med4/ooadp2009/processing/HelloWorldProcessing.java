package dk.aau.imi.med4.ooadp2009.processing;

import processing.core.*;

public class HelloWorldProcessing extends PApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void setup() {
		size(200,200);
		background(0);
	}
	
	public void draw() {
		stroke(255);
		if (mousePressed) {
			line(mouseX,mouseY,pmouseX,pmouseY);
		}
	}
}
