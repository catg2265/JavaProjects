package dk.aau.create.processing;

import processing.core.*;

@SuppressWarnings("serial")
public class BouncingBall extends PApplet {
	float w = 20;
	float h = 20;
	float xSpeed = 5;
	float ySpeed = 10;
	float x = 0;
	float y = 0;

	public void setup() {
	  size(200,200);
	  smooth();
	  fill(255,0,0);
	  noStroke();
	  ellipseMode(CORNER);
	}

	public void draw() {
	  background(255);
	  if (x+w > width || x < 0)
	    xSpeed = xSpeed * -1;
	  if (y+h > height || y < 0)
	    ySpeed = ySpeed * -1;
	  x = x + xSpeed;
	  y = y + ySpeed;
	  ellipse(x,y,w,h);
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"--present", "dk.aau.create.processing.BouncingBall"});
	}
}
