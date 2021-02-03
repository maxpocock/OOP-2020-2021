package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing2 extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}
	
	public void draw()
	{	
		background(255, 0, 0); //black
		stroke(0, 255, 0); //pen colour
		//line(10, 10, 200, 200); //x1 y1 x2 y2

		noStroke();
		fill(255, 255, 0);
		ellipse(250, 250, 420, 420); //center x center y w h
		fill(0, 255, 255);
		triangle(255, 10, 30, 400, 480, 400);
		fill(255);
		ellipse(255, 200, 210, 100);
		fill(0);
		ellipse(255, 200, 75, 75);
		//rect(20, 100, 70, 90); //tlx tly w h
		//point(200, 60);
		//fill(0); 
		//text("Hello World", 300, 300);
	}
}
