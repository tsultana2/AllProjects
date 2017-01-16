package Partc;
/**
 * 
 * <h1>Circle<h1>
 * The Parallelogram initializes
 * to measure the area
 * and Perimeter of a
 * shape Parallelogram
 * 
 * @author Tamanna
 *
 * 
 */

public class Parallelogram implements Shape,Cloneable{
	
	double l;
	double w;
	double h;
		//default constructor
		public Parallelogram(){
			l = 0;
			w = 0;
			h = 0;
			
		}
		//overloaded method
		public Parallelogram(double length, double width, double height){
			l = length;
			w = width;
			h = height;
		}
		//returns a string
		public String toString() {
			String result; 
			result = "\nParallelogram Length :" +this.getLength() + "\n"
					+ "Parallelogram Width :" + this.getWidth() + "\n"
			         + "Parallelogram Height :" + this.getHeighth() + "\n"
			+"Parallelogram Perimeter :"+this.getPerimeter()+", Parallelogram Area:"+this.getArea();
		    return result;
		    
		    
		    
		 }


			
		public      boolean equals(Object e) {
		    if (this == e) return true;
		    if (!(e instanceof Rectangle)) return false;

		    Parallelogram p = (Parallelogram) e;

		    if (l!= p.l) return false;
		    if (w!= p.w) return false;
		    if (h!= p.h) return false;
		    
		   
		    return true;
		  }
		@Override
		protected Object clone() throws java.lang.CloneNotSupportedException {
		    return super.clone();
		}
       //getters for the length
		double getLength(){
			return l;
			
		}
		//getters for the width
		double getWidth(){
			return w;
			
		}
		//getters for the height
		double getHeighth(){
			
			return h;
			
		}
		
		//setters for the length
		void setLength(double len){
			l = len;
			
		}
		//setters for the width
		void setWidth(double len, double wid){
			l = len;
			w = wid;
			
		}
		//calculates the Perimeter for parallelogram
		@Override
		public double getPerimeter() {
			
			return 2*(l+w);
		}
		//calculate area for parallelogram
		//
		@Override
		public double getArea() {
			
			return l*h;
		}
		
		

}
