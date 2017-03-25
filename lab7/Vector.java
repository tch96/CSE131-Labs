package lab7;

public class Vector {
	private double deltaX;
	private double deltaY;
	
	public Vector(double deltaX, double deltaY) {
		this.deltaX = deltaX;
		this.deltaY = deltaY;
	}
	/**
	 * prints vector as [deltaX,deltaY]
	 */
	public String toString() {
		return "[" +deltaX+ "," +deltaY+ "]";
	}
	/**
	 * 
	 * @return deltaX of vector
	 */
	public double getDeltaX() {
		return deltaX;
	}
	/**
	 * 
	 * @return deltaY of vector
	 */
	public double getDeltaY() {
		return deltaY;
	}
	/**
	 * Finds the magnitude of the vector
	 * @return double magnitude
	 */
	public double magnitude() {
		return Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
	}
	/**
	 * creates a new vector with opposite x-direction
	 * @return Vector(-deltaX, deltaY)
	 */
	public Vector deflectX() {
		return new Vector(-deltaX, deltaY);
	}
	/**
	 * creates a new vector with opposite y-direction
	 * @return Vector(deltaX, -deltaY)
	 */
	public Vector deflectY() {
		return new Vector(deltaX, -deltaY);
	}
	/**
	 * Adds two vectors
	 * @param panda Vector that is added to the input Vector
	 * @return new Vector of sum
	 */
	public Vector plus(Vector panda) {
		return new Vector(deltaX + panda.getDeltaX(),deltaY + panda.getDeltaY());
	}
	/**
	 * Subtracts two vectors
	 * @param panda Vector that is subtracted from the input Vector
	 * @return new subtracted Vector
	 */
	public Vector minus(Vector panda) {
		return new Vector(deltaX - panda.getDeltaX(),deltaY - panda.getDeltaY());
	}
	/**
	 * Scales a vector by multiplying with a specific factor
	 * @param factor; factor in which the vector is scaled
	 * @return a new vector that is facing the same direction of original vector but scale is multiplied by factor
	 */
	public Vector scale(double factor) {
		return new Vector(deltaX*factor,deltaY*factor);
	}
	/**
	 * Returns a vector whose direction is the same but a different magnitude (specified)
	 * @param magnitude the magnitude in which the vector is rescaled into
	 * @return a vector in the same direction as input but with the specified magnitude
	 */
	public Vector rescale(double magnitude) {
		double m = magnitude();
		double m2 = magnitude/m;
		if (m==0){
			return (new Vector(magnitude,0));
		}
		else{
			return scale(m2);
		}
	}
	//public static void main(String[] args) {
		//System.out.println(new Vector(4,3).toString());
	//}
}
