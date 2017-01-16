package Partc;

import org.junit.Test;
/**
 * 
 * <h1>JunitTriangleTest<h1>
 * The JunitTriangleTest initializes
 * a test unit class.
 *to test Triangle class
 * 
 * @author Tamanna
 *
 * 
 */

public class JunitTriangletest {
	
	private static final double DELTA = 1e-15;
	
	Square s = new Square(15);
	
	double expPResult=4*15;
   
	
	@Test
	public void testgetPerimeter() {
		
		org.junit.Assert.assertEquals(expPResult , s.getPerimeter(),DELTA);
	}
    
    double expAResult=15*15;
   
	@Test
	public void testgetArea() {
		
		org.junit.Assert.assertEquals(expAResult , s.getArea(),DELTA);
	}

}
