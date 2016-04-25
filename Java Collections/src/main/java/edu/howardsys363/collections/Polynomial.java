package edu.howardsys363.collections;
import java.util.ArrayList;

/** Implementation of the Polynomial class that creates 
 * expressions out of ArrayList of Terms
*
* @author Alanna Walton
*/

public class Polynomial{

	private ArrayList<Term> listOfPolynomials;
	
	/**
	 * Constructor.
	 * 
	 * Creates the polynomial expression
	 *
	 * 
	 */
	public Polynomial() {
		listOfPolynomials = new ArrayList<Term>();
	}
	
	/** Inserts a new term into the expression in order of highest degree to lowest */
	public void Insert(int coeff, int exp){
		boolean insert = false;
		Term obj = new Term(coeff, exp);

		for (int i = 0; i < listOfPolynomials.size(); i++) {
			if (listOfPolynomials.get(i).getExp() < exp) {
				listOfPolynomials.add(i, obj);
				insert = true;
				return;
			}
		}
		
		if (!insert) {
			listOfPolynomials.add(obj);
		}
	}
	
	/** Deletes specified term from polynomial expression */
	public void Delete(int coeff, int exp){
		for (int i = 0; i < listOfPolynomials.size(); i++) {
			if (listOfPolynomials.get(i).getCoeff() == coeff) {
				if (listOfPolynomials.get(i).getExp() == exp) {
					listOfPolynomials.remove(listOfPolynomials.get(i));
					return;
				}
			}
		}
		System.out.println("Polynomial not found.");
	}
	
	/** Writes expression in descending degree order */
	public String Reverse() {
		String string = "";
		for (int i = listOfPolynomials.size()-1 ; i >= 0; i--) {
			if (true){
				if (listOfPolynomials.get(i).getCoeff() < 0){
					string += " - ";
				}
				if (i < listOfPolynomials.size() - 1){
					if (listOfPolynomials.get(i).getCoeff() > 0){
						string += " + ";
					}
				}
			}
			string += listOfPolynomials.get(i).toString();
			
			
		}
		
		return string;
	}
	
	/** Writes expression in ascending degree order */
	public String Product() {
		String string = "";
		for (int i = 0; i < listOfPolynomials.size(); i++) {
			if (true){
				if (listOfPolynomials.get(i).getCoeff() < 0){
					string += " - ";
				}
				if (i > 0){
					if (listOfPolynomials.get(i).getCoeff() > 0){
						string += " + ";
					}
				}
			}
			string += listOfPolynomials.get(i).toString();
			
		}
		return string;
	}
	
}
