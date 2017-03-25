package lab6;

public class Methods {
	
	public static int f(int x) {
		if (x>100) {
			return x-10;
		}
		else {
			return f(f(x+11));
		}
	}
	
	public static int g(int x, int y) {
		if (x==0) {
			return y+1;
		}
		else if ((x>0)&&(y==0)) {
			return g(x-1,1);
		}
		else {
			return g(x-1,g(x,y-1));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(f(101));
		//System.out.println("\n"+g(2,2));
	}

}
