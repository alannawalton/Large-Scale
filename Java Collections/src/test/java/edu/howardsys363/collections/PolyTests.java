package edu.howardsys363.collections;

import java.io.IOException;

import org.junit.Test;

import junit.framework.TestCase;

public class PolyTests extends TestCase{
	//To check that item is inserted in ArrayList
	@Test
	public void testThatInserted() throws IOException {
		Polynomial testPoly = new Polynomial();
		testPoly.Insert(1, 2);
	    assertEquals("Polynomial must be inserted", "1x^2", testPoly.Product());
	}
	
	//To check that item is inserted in correct order
	@Test
	public void testInsertedCorrectly() throws IOException {
		Polynomial testPoly = new Polynomial();
		testPoly.Insert(1, 2);
		testPoly.Insert(5,3);
	    assertEquals("Polynomial must be inserted correctly", "5x^3 + 1x^2" , testPoly.Product());
	}
	
	//To check that item is deleted
	@Test
	public void testDeleted() {
		Polynomial testPoly = new Polynomial();
		testPoly.Insert(1, 2);
		testPoly.Insert(5,3);
		testPoly.Delete(1, 2);
		assertEquals("Polynomial must be deleted", "5x^3" , testPoly.Product());
	}
	
	//To check that item is reversed
	@Test
	public void testReversed() {
		Polynomial testPoly = new Polynomial();
		testPoly.Insert(1, 2);
		testPoly.Insert(5,3);
		assertEquals("Polynomial must be deleted", "1x^2 + 5x^3" , testPoly.Reverse());
	}
}
