package com.titanmusic.iss3test;

import processing.core.*;

@SuppressWarnings("serial")
public class DynamicZoog extends PApplet{


	// Learning Processing
	// Daniel Shiffman
	// http://www.learningprocessing.com

	// Example 3-1: Zoog as dynamic sketch

	// setup() runs first one time.  
	// size() should always be first line of setup() since 
	// Processing won't be able to do anything before the window size is specified.
	boolean up = true;
	int col = 0;

	public void setup() {
	  // Set the size of the window
	  size(200,200);  
	  //frameRate(5);
	}

	// draw() loops continuously until you close the sketch window.
	public void draw() {
	  // Draw a white background
	  background(col);   
	  
	  // Set CENTER mode
	  ellipseMode(CENTER);
	  rectMode(CENTER); 

	  // Draw Zoog's body
	  stroke(0);
	  fill(150);
	  rect(100,100,20,100);

	  // Draw Zoog's head
	  stroke(0);
	  fill(255);
	  ellipse(100,70,60,60); 

	  // Draw Zoog's eyes
	  fill(0); 
	  ellipse(81,70,16,32); 
	  ellipse(119,70,16,32);

	  // Draw Zoog's legs
	  stroke(0);
	  up = !up;
	  if (up) {
	    line(90,150,80,160);
	    line(110,150,120,160);
	  } else {
	    line(90,150,80,140);
	    line(110,150,120,140);
	  }
	}
	
}
