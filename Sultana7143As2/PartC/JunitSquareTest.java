package Partc;


import org.junit.Test;
/**
 * 
 * <h1>JunitSquareTest<h1>
 * The JunitSquareTest initializes
 * a test unit class.
 *to test Square class
 * 
 * @author Tamanna
 *
 * 
 */

public class JunitSquareTest {

			private static final double DELTA = 1e-15;
			
			Triangle t = new Triangle(5,6,3);
			
			double s=(5+6+3)/2;
			double expPResult=(5+6+3);
		   
			
			@Test
			public void testgetPerimeter() {
				
				org.junit.Assert.assertEquals(expPResult , t.getPerimeter(),DELTA);
			}
		    
		    double expAResult=Math.sqrt(s*(s-5)*(s-6)*(s-3));
		   
			@Test
			public void testgetArea() {
				
				org.junit.Assert.assertEquals(expAResult , t.getArea(),DELTA);
			}
			
			

		}
