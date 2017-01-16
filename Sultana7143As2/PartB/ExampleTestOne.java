package PartB;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * <h1>ExampleTestOne<h1>
 * The ExampleTestone initializes
 * a test unit class.
 * It is the sample of
 * testing class
 * 
 * @author Tamanna
 *
 * 
 */

public class ExampleTestOne {

	Example e = new Example();
	@Test
	public void testAddString() {
	assertEquals("Test for add(s1, s2): ", "Hello World", e.add("Hello", " World"));
	}
	
	@Test
	public void testAddInteger() {
	assertEquals("Test for add(): ", 3, e.add());
	}
	@Test
	public void testBuildString() {
	Example e = new Example();
	assertEquals("Test for buildString(): ", "31 + 13", e.buildString(3));

	
	}
	
	
	

}
