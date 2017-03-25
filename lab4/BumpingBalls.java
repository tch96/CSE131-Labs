package lab4;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many balls?");

		// set the scale of the coordinate system
		StdDraw.setXscale(-1.00, 1.00);
		StdDraw.setYscale(-1.00, 1.00);

		double[][] grid = new double [N][4];
		double radius = 0.05;

		//position
		for (int i=0; i<N; ++i) {
			//vx
			grid[i][2]=(0.01+Math.random()*0.01);
			//vy
			grid[i][3]=(0.01+Math.random()*0.01);
			//rx	
			grid[i][0]=(-0.95+1.9*Math.random());
			//ry	
			grid[i][1]=(-0.95+1.9*Math.random());
		}

		while (true) {
			// clear the background
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0, 0, 1.0);

			for (int i=0; i<N; ++i) {
				//if ((1-grid[i][0]<radius)||((grid[i][0]+1)<radius)) {
					//grid[i][2]=-grid[i][2];
				//}
				//if ((1-grid[i][1]<radius)||((grid[i][1]+1)<radius)) {
					//grid[i][3]=-grid[i][3];
				//}
				if ((Math.abs(grid[i][0]+grid[i][2]))>(1.0-radius)) {
					grid[i][2]=-grid[i][2];
				}
				if ((Math.abs(grid[i][1]+grid[i][3]))>(1.0-radius)) {
					grid[i][3]=-grid[i][3];
				}
				for (int j=0; j<N;++j) {
					if (i<j) {
						double d = Math.sqrt((Math.pow(((grid[i][0]+grid[i][2])-(grid[j][0]+grid[j][2])),2))+(Math.pow(((grid[i][1]+grid[i][3])-(grid[j][1]+grid[j][3])),2)));
						if (d<=2*radius) {
							double subX = grid[i][2];
							grid[i][2]=grid[j][2];
							grid[j][2]=subX;
							double subY = grid[i][3];
							grid[i][3]=grid[j][3];
							grid[j][3]= subY;
						}
					}
				}

				grid[i][0]=grid[i][0]+grid[i][2];
				grid[i][1]=grid[i][1]+grid[i][3];
			}
			for (int i=0; i<N; ++i) {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledCircle(grid[i][0], grid[i][1], radius);
			}
			StdDraw.show(15);

			// initial values
			//double rx = 0.480, ry = 0.860;     // position
			//double vx = 0.015, vy = 0.023;     // velocity
			//double radius = 0.05;              // radius

			// main animation loop
			//while (true)  { 

			// bounce off wall according to law of elastic collision
			//if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
			//if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

			// update position
			//rx = rx + vx; 
			//ry = ry + vy; 

			// clear the background
			//StdDraw.setPenColor(StdDraw.GRAY);
			//StdDraw.filledSquare(0, 0, 1.0);

			// draw ball on the screen
			//StdDraw.setPenColor(StdDraw.BLACK); 
			//StdDraw.filledCircle(rx, ry, radius); 

			// display and pause for 20 ms
			//StdDraw.show(pause); 
		} 
	} 

}


