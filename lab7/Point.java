package lab7;

public class Point {
	private double pointX;
	private double pointY;
	
	public Point(double pointX, double pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}
	
	/**
	 * 
	 * @return the x-coordinate of point
	 */
	public double getX() {
		return pointX;
	}
	/**
	 *
	 * @return the y-coordinate of point
	 */
	public double getY(){
		return pointY;
	}
	/**
	 * Print the point as a coordinate (x,y)
	 */
	public String toString() {
		return "(" +pointX+ ", " +pointY+ ")";
	}
	/**
	 * Adding a vector to a point
	 * @param chipmunk vector that is added
	 * @return the new point with the vector added to original point
	 */
	public Point plus(Vector chipmunk) {
		return new Point (pointX+chipmunk.getDeltaX(),pointY+chipmunk.getDeltaY());
	}
	/**
	 * vector between the two points
	 * @param furball Point to find vector with the input point
	 * @return Vector between two points
	 */
	public Vector minus(Point furball) {
		return new Vector (pointX-furball.getX(),pointY-furball.getY());
	}
	/**
	 * distance between two points
	 * @param furball Point to check distance from another point
	 * @return double distance
	 */
	public double distance(Point furball) {
		return minus(furball).magnitude();
	}
}
