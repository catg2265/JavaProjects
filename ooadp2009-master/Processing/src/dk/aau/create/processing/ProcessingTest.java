package dk.aau.create.processing;

import processing.core.*;

@SuppressWarnings("serial")
public class ProcessingTest extends PApplet {
	
	float theta = 0.0f;
	float r = 1.0f * width/4; 
	
	public void setup() {
		size(200,200);
		loop();
	}
	
	public void draw() {
		background(255);
		theta += PI / 180;
		float x = r * cos(theta);
		float y = r * sin(theta);
		line(width/2, height/2, x+width/2, y+height/2);
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"--present", "dk.aau.create.processing.ProcessingTest"});
	}
}
