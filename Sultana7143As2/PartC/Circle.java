
package Partc;
/**
 * 
 * <h1>Circle<h1>
 * The circle initializes
 * to measure the area
 * and Perimeter of a
 * shape Circle
 * 
 * @author Tamanna
 *
 * 
 */



public class Circle implements Shape,Cloneable{
	
	double r;
	//default constructor
	public Circle(){
		r = 0;
	}
	//overloaded constructor
	public Circle(double radious){
		r = radious;
	}
	//Returns a string
	public String toString() {
		String result; 
		result = "\nCircle Radious :" +this.getRadious() + "\n"
				+"Circle Perimeter :"+this.getPerimeter()+", Circle Area:"+this.getArea();
	    return result;
	 }

  //comparing two objects
		
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Circle)) return false;

	    Circle c = (Circle) e;

	    if (r!= c.r) return false;
	   
	    return true;
	  }
	//cloning the super object
	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}
  //getters for radious
	double getRadious(){
		return r;
		
	}
	//setters for radious
	void setRadious(double rad){
		r = rad;
		
	}
	//calculates the perimeter of a circle
	@Override
	public double getPerimeter() {
		
		return 2*Math.PI*r;
	}
	//calculates the area of a circle
	@Override
	public double getArea() {
		
		return Math.PI*r*r;
	}
	
}
