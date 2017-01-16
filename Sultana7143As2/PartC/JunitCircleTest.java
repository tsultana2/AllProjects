package Partc;


import org.junit.Test;
/**
 * 
 * <h1>JunitCircleTest<h1>
 * The JunitCircleTest initializes
 * a test unit class.
 *to test Circle class
 * 
 * @author Tamanna
 *
 * 
 */

	
	public class JunitCircleTest {
		private static final double DELTA = 1e-15;
		
		Circle c = new Circle(5);
		
		double expPResult=2*Math.PI*5;
	   
		
		@Test
		public void testgetPerimeter() {
			
			org.junit.Assert.assertEquals(expPResult , c.getPerimeter(),DELTA);
		}
	    
	    double expAResult=Math.PI*5*5;
	   
		@Test
		public void testgetArea() {
			
			org.junit.Assert.assertEquals(expAResult , c.getArea(),DELTA);
		}
		
		

	}