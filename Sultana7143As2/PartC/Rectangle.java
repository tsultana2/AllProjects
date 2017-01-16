package Partc;
/**
 * 
 * <h1>Rectangle<h1>
 * The Rectangle initializes
 * to measure the area
 * and Perimeter of a
 * shape Rectangle
 *  
 * @author Tamanna
 *
 * 
 */
public class Rectangle implements Shape{
double l;
double w;
	//default method
	public Rectangle(){
		l = 0;
		w = 0;
		
	}
	//overloaded method
	public Rectangle(double length, double width){
		l = length;
		w = width;
	}
	
	public String toString() {
		String result; 
		result = "\nRectangle Length :" +this.getLength() + "\n"
				+ "Rectangle Width :" + this.getWidth() + "\n"
				+"Rectangle Perimeter :"+this.getPerimeter()+", Rectangle Area:"+this.getArea();
	    return result;
	 }


	//compares objects
		
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Rectangle)) return false;

	    Rectangle r = (Rectangle) e;

	    if (l!= r.l) return false;
	    if (w!= r.w) return false;
	   
	    return true;
	  }
	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}
    //getter for length
	double getLength(){
		return l;
		
	}
	//getters for width
	double getWidth(){
		return w;
		
	}
	
	//sets the length
	void setRadious(double len){
		l = len;
		
	}
	
	void setwidth(double len, double wid){
		l = len;
		w = wid;
		
	}
	//calculates the perimeter of Rectangle
	@Override
	public double getPerimeter() {
		
		return 2*(l+w);
	}
	//calculates the area of rectangle
	@Override
	public double getArea() {
		
		return l*w;
	}
	
	

}
