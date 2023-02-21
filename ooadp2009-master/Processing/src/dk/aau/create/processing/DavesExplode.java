package dk.aau.create.processing;

import processing.core.*;

@SuppressWarnings("serial")
public class DavesExplode extends PApplet {
	 
	PImage img;
	int cellsize = 2;
	int columns, rows;
	int m = 0;

	int speed = 10;

	public void setup() {
	  size(640, 360, P3D); 
	  img = loadImage("/Users/dave/Documents/Work/Teaching/workspace/Processing/resources/eames.jpg");
	  columns = img.width / cellsize;
	  rows = img.height / cellsize;
	}

	public void draw() {
	  m += speed;
	  background(0);
	  for ( int i = 0; i < columns; i++) {
	    for ( int j = 0; j < rows; j++) {
	      int x = i*cellsize + cellsize/2;
	      int y = j*cellsize + cellsize/2;
	      int loc = x + y*img.width;
	      int c = img.pixels[loc];
	      float z = (m / (float)width) * brightness(img.pixels[loc]);
	      pushMatrix();
	      translate(x + 200, y + 100, z);
	      fill(c, 204);
	      noStroke();
	      rectMode(CENTER);
	      rect(0, 0, cellsize, cellsize);
	      popMatrix();
	    }
	  }
	}
}
