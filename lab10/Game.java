package lab10;

import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import sedgewick.StdDraw;

public class Game {

	public static void main(String[] args) {
		final int showPauseTime = 20; // milliseconds
		//
		// Want to be able to continually iterate through a list of
		//    things to draw on the screen.  Each of those things
		//    should be able to draw itself, and also tell me when
		//    it is done.
		//
		List<Anim> scene1 = new LinkedList<Anim>();
		FadingWigglingMessage welcome = new FadingWigglingMessage(showPauseTime, "Welcome to agar!", 5000, 0.005);
		scene1.add(welcome);
		//
		// The HorzBalls and VertBalls are just for show.  In your game you
		//   won't need them
		//
		HorzBall hball = new HorzBall(0.3);
		VertBall vball = new VertBall(0.2, 3000, showPauseTime);
		Blob     blob  = new Blob(.05); // you can use WigglyBlob if you want
		blob.setColor(Color.PINK);
		scene1.add(hball);
		scene1.add(vball);
		for (int i=0; i < 10; ++i) {
			scene1.add(new VertBall(i/10.0, 3000, showPauseTime));
		}
		scene1.add(blob);

		//
		// Stay on this level until scene1 has nothing to animate
		//
		while (!scene1.isEmpty()) {
			StdDraw.clear();
			// draw everything
			for (Anim a : scene1) {
				a.draw();
			}
			//
			// Here would be a good place to
			//    1.  Add Food
			//    2.  See if the Blob is on top of a Food, and if so
			//        cause the Blob to grow and the Food to be done
			//    3.  Determine if the game is over
			//
			//
			
			//
			// Delete what is done, the safe way
			//
			Iterator<Anim> iter = scene1.iterator();
			while (iter.hasNext()) {
				Anim a = iter.next();
				if (a.isDone()) {
					iter.remove();   // removes the current object safely
				}
			}
			StdDraw.show(showPauseTime);
		}
		
		//
		// game over
		// clear the screen
		// and put up a final meassage
		//
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
		StdDraw.text(0.5, 0.5, "Game Over!");
		StdDraw.show(showPauseTime);
		

	}

}
