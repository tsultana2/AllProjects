package Partc;

import org.junit.Test;
/**
 * 
 * <h1>JunitParallelogramTest<h1>
 * The JunitParallelogramTest initializes
 * a test unit class.
 *to test Parallelogram class
 * 
 * @author Tamanna
 *
 * 
 */


public class JunitParallelogramTest {
	
	private static final double DELTA = 1e-15;
	
	Parallelogram p = new Parallelogram(5,4,3);
	
	double expPResult= 2*5+2*4;
   
	
	@Test
	public void testgetPerimeter() {
		
		org.junit.Assert.assertEquals(expPResult , p.getPerimeter(),DELTA);
	}
    
    double expAResult= 5*3;
   
	@Test
	public void testgetArea() {
		
		org.junit.Assert.assertEquals(expAResult , p.getArea(),DELTA);
	}

}
