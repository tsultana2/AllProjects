package Partc;
/**
 * 
 * <h1>Triangle<h1>
 * The Triangle initializes
 * to measure the area
 * and Perimeter of a
 * shape Triangle
 *  
 * @author Tamanna
 *
 * 
 */

public class Triangle implements Shape,Cloneable{
	
	double a;
	double b;
	double c;
		//default constructor
		public Triangle(){
			a = 0;
			b = 0;
			c = 0;
			
		}
		//overloaded constructor
		public Triangle(double sideA, double sideB, double sideC){
			a = sideA;
			b = sideB;
			c = sideC;
		}
		public String toString() {
			String result; 
			result = "\nTrianle side A :" +this.getSideA() + "\n"
					+ "Trianle Side B :" + this.getSideB() + "\n"
			         + "Trianle Side C :" + this.getSideC() + "\n"
				+"Trianle Perimeter :"+this.getPerimeter()+", Trianle Area:"+this.getArea();
		    return result;
		    
		    
		    
		 }


			
		public      boolean equals(Object e) {
		    if (this == e) return true;
		    if (!(e instanceof Triangle)) return false;

		    Triangle t = (Triangle) e;

		    if (a!= t.a) return false;
		    if (b!= t.b) return false;
		    if (c!= t.c) return false;
		    
		   
		    return true;
		  }
		@Override
		protected Object clone() throws java.lang.CloneNotSupportedException {
		    return super.clone();
		}
       //returns a side of a triangle
		double getSideA(){
			return a;
			
		}
		//returns  side b of triangle 
		double getSideB(){
			return b;
			
		}
		//returns side c of a triangle
		double getSideC(){
			
			return c;
			
		}
	
		//setters 
		void setSideA(double one ){
			a = one;
			
		}
		
		void setSideB(double two){
			b = two;
			
		}
		
		void setSideC(double three){
			c = three;
			
		}
		
		
		@Override
		public double getPerimeter() {
			return a+b+c;
		}
		
		@Override
		public double getArea() {
			double s=(a+b+c)/2.0;
			return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
			
	

}
