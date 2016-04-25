package edu.howardsys363.collections;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class TermTests extends TestCase{
	//To check that coefficients are returned
	@Test
	public void testThatCoeffIsReturned() throws IOException {
		Term testTerm = new Term(3,2);
	    assertEquals("Coefficient must be returned", 3, testTerm.getCoeff());
	}
	
	//To check that exponents are returned
	@Test
	public void testThatExpIsReturned() throws IOException {
		Term testTerm = new Term(3,2);
	    assertEquals("Exponents must be returned", 2, testTerm.getExp());
	}
	
	//To check that string is printed
	@Test
	public void testThatStringIsPrinted() throws IOException {
		Term testTerm = new Term(3,1);
	    assertEquals("String must be printed correctly", "3x", testTerm.toString());
	}
}

