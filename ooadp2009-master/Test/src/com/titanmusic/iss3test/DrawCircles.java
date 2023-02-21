package com.titanmusic.iss3test;

import processing.core.*;

@SuppressWarnings("serial")
public class DrawCircles extends PApplet {

	float x = 0, y = 0;

	public void setup() {
		size(200,200);
		smooth();
	}

	public void draw() {
		fill(color(255,0,0));
		x++; y++;
		ellipse(x,y,25,25);
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", "com.titanmusic.iss3test.DrawCircles" });
	}
}
