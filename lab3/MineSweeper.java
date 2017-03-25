package lab3;

import cse131.ArgsProcessor;

public class MineSweeper {

	public static void main (String[] args) {

		//
		// Do not change anything between here ...
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int cols = ap.nextInt("How many columns?");
		int rows = ap.nextInt("How many rows?");
		double percent = ap.nextDouble("What is the probability of a bomb in decimal form?");
		//
		// ... and here
		//
		//  Your code goes below these comments
		//
		String [][] grid = new String[cols+2][rows+2];

		for (int i=0; i<cols+2; ++i) {
			for (int j=0; j<rows+2; ++j) {
				if ((j==0)||(i==0)||(j==rows+1)||(i==cols+1)) {
					grid[i][j]="";
					System.out.print("");
				}
				else {
					double z = Math.random();
					if (z<percent) {
						grid[i][j]="*";
						System.out.print("*");
					}
					else {
						grid[i][j]=".";
						System.out.print(".");
					}
				}

			}
			System.out.println("");
		}
		System.out.print("\n");

		
		String [][] newgrid = new String[cols+2][rows+2];
		for (int i=0; i<cols+2; ++i) {
			for (int j=0; j<rows+2; ++j) {
				if ((j==0)||(i==0)||(j==rows+1)||(i==cols+1)) {
					grid[i][j]="";
					System.out.print("");
				}
				else {
					if (grid[i][j]=="*") {
						grid[i][j]="*";
						System.out.print("*");
					}
					else {
						int bombs = 0;
						if (grid[i-1][j+1]=="*") {
							bombs++;
						}
						if (grid[i][j+1]=="*") {
							bombs++;
						}
						if (grid[i+1][j+1]=="*") {
							bombs++;
						}
						if (grid[i-1][j]=="*") {
							bombs++;
						}
						if (grid[i+1][j]=="*") {
							bombs++;
						}
						if (grid[i-1][j-1]=="*") {
							bombs++;
						}
						if (grid[i][j-1]=="*") {
							bombs++;
						}
						if (grid[i+1][j-1]=="*") {
							bombs++;
						}
						System.out.print(bombs);
					}
				}
			}
			System.out.println("");
		}
	}}
