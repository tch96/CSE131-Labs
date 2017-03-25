package lab6;

public class beer {

	public static String bottlesOfBeer(int n) {
		if (n>0) {
		return n + " bottles of beer on the wall, " + n + " bottles of beer; take one down, pass it around, " + (n-1) + " bottles of beer on the wall\n" + bottlesOfBeer(n-1);
		}
		else {
			return "";		
		}
	}

	public static void main(String[] args) {
		System.out.println(bottlesOfBeer(5));

	}

}
