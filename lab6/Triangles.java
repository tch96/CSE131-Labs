package lab6;

import java.awt.Color;

import sedgewick.StdDraw;

public class Triangles {
	public static void triangle(double x, double y, double side) {
		if (side < 0.02) {
			return;
		}
		StdDraw.setPenColor(Color.BLACK);
		double [] trix = {x,x+side/2,x+side};
		double [] triy = {y,y+side*Math.sqrt(3)/2,y};
		StdDraw.filledPolygon(trix, triy);
		
		StdDraw.setPenColor(Color.WHITE);
		double [] midpointx = {x+side/4,x+side/2,x+3*side/4};
		double [] midpointy = {y+side*Math.sqrt(3)/4,y,y+side*Math.sqrt(3)/4};
		StdDraw.filledPolygon(midpointx, midpointy);
		
		triangle(x,y,side/2);
		triangle(x+side/4,y+side*Math.sqrt(3)/4,side/2);
		triangle(x+side/2,y,side/2);
	
	}

	
	public static void main(String[] args) {
		StdDraw.show(10);
		triangle(0, 0, 1);
		StdDraw.show(10); 
	}

}
