package lab1;

import cse131.ArgsProcessor;

public class Nutrition {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);	
		String name = ap.nextString("What is the name of the food?");
		
		double carbs = ap.nextDouble("How many grams of carbs are in the food?");
		double fat = ap.nextDouble("How many grams of fat are in the food?");
		double protein = ap.nextDouble("How many grams of protein are in the food?");
		double statedCals = ap.nextDouble("How many calories are stated on the label?");
		
		double carbscalories = (carbs*4);
		double proteincalories = (protein*4);
		double fatcalories = (fat*9);
		double unavailablecalories = ((double)(carbscalories+proteincalories+fatcalories)-statedCals);
		double fiber = (unavailablecalories/4);
	
		double percentcarbs = (carbscalories/statedCals)*100;
		double percentfat = (fatcalories/statedCals)*100;
		double percentprotein = (proteincalories/statedCals)*100;

		boolean lowcarb = (percentcarbs <= 25.0);
		boolean lowfat = (percentfat <= 15.0);
		boolean heads = (Math.random()<0.5);
		
		System.out.println(name + " has ");
		System.out.println("\t" + carbs + " grams of carbohydrates = " + ((double)Math.round(carbscalories*100)/100) + " Calories");
		System.out.println("\t" + fat + " grams of fat = " + ((double)Math.round(fatcalories*100)/100) + " Calories");
		System.out.println("\t" + protein + " grams of protein = " + ((double)Math.round(proteincalories*100)/100) + " Calories \n");

		System.out.println("This food is said to have " + statedCals + " (available) Calories.");
		System.out.println("With " + ((double)Math.round(unavailablecalories*100)/100) + " unavailable Calories, this food has " + ((double)Math.round(fiber*100)/100) + " grams of fiber \n");
		
		System.out.println("Approximately");
		System.out.println("\t" + (double)Math.round(percentcarbs*10)/10 + "% of your food is carbohydrates");
		System.out.println("\t" + (double)Math.round(percentfat*10)/10 + "% of your food is fat");
		System.out.println("\t" + (double)Math.round(percentprotein*10)/10 + "% of your food is protein \n");

		System.out.println("This food is acceptable for a low-carb diet? " + lowcarb);
		System.out.println("This food is acceptable for a low-fat diet? " + lowfat);
		System.out.println("By coin flip, you should eat this food? " + heads);
		
		
		
	}

}
