package lab5;

public class Lab5Methods {

	/**
	 *
	 * @param integer n
	 * @return the sum of n + (n-2) + (n-4) + ...
	 */
	public static int sumDownBy2(int n) {
		int sum = 0;
		for (int i=n;i>=0;i-=2) {
			sum = sum+i;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param positive integer n
	 * @return the sum 1+ 1/2 + 1/3 + ... + 1/(n-1) + 1/n
	 */
	public static double harmonicSum(int n) {
		double sum = 0;
		for (int i=n;i>0;--i) {
			sum = sum + (1.0/i);
		}
		return sum;
	}
	
	/**
	 * 
	 * @param a non-negative integer k
	 * @return the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,k)
	 */
	public static double geometricSum(int k) {
		double sum = 0;
		for (int i=0;i<k+1;++i) {
			sum = sum + 1/Math.pow(2, i);
		}
		return sum;
	}
	
	/**
	 * 
	 * @param positive integer j
	 * @param positive integer k
	 * @return the product j*k
	 */
	public static int multPos(int j,int k) {
		int sum = 0;
		for (int i=0;i<k;++i) {
			sum = sum+j;
		}
		return sum;
	}
	
	/**
	 * 
	 * @param integer j
	 * @param integer k
	 * @return the product j*k
	 */
	public static int mult(int j, int k) {
		int product = multPos(Math.abs(j),Math.abs(k));
		if (j*k<0) {
			return -product;
		}
		else {
			return product;
		}
	}
	
	/**
	 * 
	 * @param integer n
	 * @param integer k, where k>=0
	 * @return the value of n to the power k
	 */
	public static int expt(int n,int k) {
		if (k==0) {
			return 1;
		}
		else {
			int product = 1;
			for (int i=0;i<k;++i) {
				product = product*n;
			}
			return product;
		}
		
	}

}
