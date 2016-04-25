package edu.howardsys363.collections;


/** Implementation of the Term class that creates coefficient expressions
*
* @author Alanna Walton
*/

public class Term {
	private int coeff;
	private int exp;
	
	
	/**
	 * Constructor.
	 * 
	 * Creates the exponential term
	 *
	 * @param coeff2 (required) the coefficient of the term
	 * @param exp2 (required) the exponent of the term
	 * 
	 */
	public Term(int coeff2, int exp2) {
		this.coeff = coeff2;
		this.exp = exp2;
	}

	/** Return coefficient passed to the constructor.  */
	public int getCoeff() {
		return this.coeff;
	}
	
	/** Return exponent passed to the constructor.  */
	public int getExp() {
		return this.exp;
	}
	
	/** Converts coefficient and exponent into a term that is readable as a term */
	public String toString() {
		String xpart = "";
		if (this.exp == 1) {
			xpart = "x";
		}
		if (this.exp > 1) {
			xpart = "x^" + this.exp;
		}
		
		return Math.abs(this.coeff) + xpart;
	}
}
