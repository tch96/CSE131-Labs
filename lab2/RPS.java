package lab2;

import cse131.ArgsProcessor;

public class RPS {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many rounds of RPS do you want to play?");
		String random = "";
		String pattern = "";
		int wins = 0;
		int ties = 0;
		int losses = 0;

		for (int i=0; i < N; ++i) {
			double z = Math.random();	
			if (z<0.33) {
				random = random + "R";
			}	
			else if (z<0.66) {
				random = random + "P";
			}
			else {
				random = random + "S";
			}
		}
		System.out.println(random);

		for (int i=0; i<N; ++i) {
			int cycle = i%3;
			if (cycle==0) {
				pattern = pattern + "R";
			}
			else if (cycle==1) {
				pattern = pattern + "P";
			}
			else {
				pattern = pattern + "S";
			}
		}
		System.out.println(pattern);

		for (int i=0; i<N; ++i) {
			char move1 = random.charAt(i);
			char move2 = pattern.charAt(i);
			if (((move1 == 'R')  && (move2=='S')) || ((move1=='P') && (move2=='R')) || ((move1=='S') && (move2=='P'))) {
				wins++;
			}
			else if (((move1 == 'R')  && (move2=='R')) || ((move1=='P') && (move2=='P')) || ((move1=='S') && (move2=='S'))) {
				ties++;
			}
			else {
				losses++;
			}
		}
		System.out.println("Random player has " + wins + " wins, " + ties + " ties, and " + losses + " losses");
		System.out.println("Systematic player has " + losses + " wins, " + ties + " ties, and " + wins + " losses");
		
		System.out.println("Random player wins " + (Math.round(wins*1000/N))/10.0 + "% of games");
		System.out.println("Systematic player wins " + (Math.round(losses*1000/N))/10.0 + "% of games");
	}



}



