package lab10;

import java.awt.Color;

import lab7solved.Point;
import lab7solved.Vector;
import sedgewick.StdDraw;

/**
 * The Blob is like a HorzBall or VertBall except that it moves to
 *   where the mouse currently is when draw() is called.
 *   
 * @author roncytron
 *
 */
public class Blob implements Anim {

	protected double x;
	protected double y;
	protected double radius;   // NOT final, so you can change it as it eats or vomits food
	protected Color color;

	public Blob(double radius) {
		this.radius = radius;
		this.color  = Color.BLACK;
		this.x      = 0.5;
		this.y      = 0.5;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}

	@Override
	public boolean isDone() {
		return false;
	}

	@Override
	public void draw() {
		//
		// Draw myself wherever the mouse happens to be now
		//
		x = StdDraw.mouseX();
		y = StdDraw.mouseY();
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x, y, radius);
	}
	
}