package Partc;
/**
 * 
 * <h1>Square<h1>
 * The Square initializes
 * to measure the area
 * and Perimeter of a
 * shape Square
 *  
 * @author Tamanna
 *
 * 
 */

public class Square implements Shape,Cloneable{
	
	double l;
	
	public Square(){
		l = 0;
		
	}
	public Square(double length){
		l = length;
	}
	public String toString() {
		String result; 
		result = "\nSquare Length :" +this.getLength() + "\n"
		+"Square Perimeter :"+this.getPerimeter()+", Square Area:"+this.getArea();	
	    return result;
	 }


		
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Square)) return false;

	    Square s = (Square) e;

	    if (l!= s.l) return false;
	   
	    return true;
	  }
	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}

	double getLength(){
		return l;
		
	}
	
	void setRadious(double len){
		l = len;
		
	}
	@Override
	public double getPerimeter() {
		
		return 4*l;
	}
	@Override
	public double getArea() {
		return l*l;
	}

}
