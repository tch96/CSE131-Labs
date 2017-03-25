package lab8;

import java.util.Iterator;
import java.util.LinkedList;

public class Polynomial {

	final private LinkedList<Double> list;

	/**
	 * Constructs a Polynomial with no terms yet.
	 */
	public Polynomial() {
		//
		// Set the instance variable (list) to be a new linked list of Double type
		//
		list = new LinkedList<Double>();   // FIXME
	}
/**
 * Iterator method
 * Returns the polynomial in 5+3x+4x^2+8x^3 form
 */
	public String toString() {
		String s = "";
		int i = 0;
		Iterator<Double> coeff = list.iterator();
		while (coeff.hasNext()) {
			if (i==0) {
				s = s + coeff.next() + " + ";
				++i;
			}
			else if (i==1) {
				s =  s + coeff.next() + "x";
				++i;
			}
			else {
				s = s + " + " + coeff.next() + "x^" +i;
				++i;
			}
		}
		return s; // FIXME
	}
/**
 * 
 * @param coefficient added to the polynomial
 * @return the polynomial with added coefficient
 */
	public Polynomial addTerm(double coeff) {
		list.add(coeff);
		return this;  // required by lab spec
	}
/**
 * 
 * @param a value of x
 * @return the value of the polynomial after pluggin in x; based on recursion of helper
 */
	public double evaluate(double x) {
		return helper(x,0);  // FIXME
	}
/**
 * 	
 * @param value of x
 * @param i - the index for recursion
 * base case = i==list.size()
 * @return the value of the polynomial given the value of x
 */
	public double helper(double x, int i) {
		if (i==list.size()) {
			return 0;
		}
		else {
			return list.get(i) + x*helper(x,i+1);
		}
	}
/**
 * 
 * @return the first derivative of the polynomial
 */
	public Polynomial derivative() {
		Polynomial derivative = new Polynomial();
		int i = 1;
		while (i<list.size()) {
			derivative.addTerm(list.get(i)*i);
			++i;
		}
		return derivative;   // FIXME
	}
/**
 * 	
 * @param a polynomial "another"
 * @return the sum of "another" polynomial and this polynomial
 */
	public Polynomial sum(Polynomial another) {
		Polynomial sum = new Polynomial();
		int i = 0;
		if (list.size()==another.list.size()) {
			while (i<list.size()) {
				sum.addTerm(list.get(i)+another.list.get(i));
				++i;
			}
		}
		else if (list.size()>another.list.size()) {
			while (i<another.list.size()) {
				sum.addTerm(list.get(i)+another.list.get(i));
				++i;
			}
			while (i<list.size()) {
				sum.addTerm(list.get(i));
				++i;
			}
		}
		else {
			while (i<list.size()) {
				sum.addTerm(list.get(i)+another.list.get(i));
				++i;
			}
			while (i<another.list.size()) {
				sum.addTerm(another.list.get(i));
				++i;
			}
		}
		return sum;   // FIXME
	}

	/**
	 * This is the "equals" method that is called by
	 *    assertEquals(...) from your JUnit test code.
	 *    It must be prepared to compare this Polynomial
	 *    with any other kind of Object (obj).  Eclipse
	 *    automatically generated the code for this method,
	 *    after I told it to use the contained list as the basis
	 *    of equality testing.  I have annotated the code to show
	 *    what is going on.
	 */

	public boolean equals(Object obj) {
		// If the two objects are exactly the same object,
		//    we are required to return true.  The == operator
		//    tests whether they are exactly the same object.
		if (this == obj)
			return true;
		// "this" object cannot be null (or we would have
		//    experienced a null-pointer exception by now), but
		//    obj can be null.  We are required to say the two
		//    objects are not the same if obj is null.
		if (obj == null)
			return false;

		//  The two objects must be Polynomials (or better) to
		//     allow meaningful comparison.
		if (!(obj instanceof Polynomial))
			return false;

		// View the obj reference now as the Polynomial we know
		//   it to be.  This works even if obj is a BetterPolynomial.
		Polynomial other = (Polynomial) obj;

		//
		// If we get here, we have two Polynomial objects,
		//   this and other,
		//   and neither is null.  Eclipse generated code
		//   to make sure that the Polynomial's list references
		//   are non-null, but we can prove they are not null
		//   because the constructor sets them to some object.
		//   I cleaned up that code to make this read better.


		// A LinkedList object is programmed to compare itself
		//   against any other LinkedList object by checking
		//   that the elements in each list agree.

		return this.list.equals(other.list);
	}

}
