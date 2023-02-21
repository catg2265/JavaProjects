package com.titanmusic.iss3test;

import processing.core.*;
import com.titanmusic.iss3test.RaindropGame2.FancyRaindrop;

public class Catcher2 {
	float r;      // radius
	float x, y;   // location
	PApplet parent;

	public Catcher2(PApplet parent, float radius) {
		r = radius;
		x = 0;
		y = 0;
		this.parent = parent;
	}

	public void setLocation(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void display() {
		parent.stroke(0);
		parent.fill(175);
		parent.ellipse(x, y, r*2, r*2);
	}

	public boolean intersects(FancyRaindrop raindrop) {
		if (raindrop.diameter/2 + r > PApplet.dist(raindrop.x,raindrop.y,x,y))
			return true;
		return false;
	}

}
