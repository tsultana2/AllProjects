package Partc;
/**
 * 
 * <h1>Picture<h1>
 * The Picture initializes
 * to make array of 
 * shapes.
 * using the interface Shape
 * and making Circle, Triangle,
 * Square,Rectangle and Parallelogram
 * 
 * @author Tamanna
 *
 * 
 */

public class Picture implements Cloneable {	
	private Shape[] pictures;
	
	public Picture(){}
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Picture)) return false;

	    Picture pic = (Picture) e;

	    if (pictures!= pic.pictures) return false;
	   
	    return true;
	  }
	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}
	public Picture(Shape[] array){
		pictures = array;
	}		

	@Override
	public String toString() {
		String out = "";
		
		for(Shape data : pictures) out += "Perimeter : " + data.getPerimeter() + "\n";
		
		return out;
	}
     //captures the array of shapes
	public Shape[] getPicture() {
		return pictures;
	}
//sets the array of shapes to the current object
	public void setPicture(Shape[] picture) {
		this.pictures = picture;
	}		
	
	public  Perimeter t= (x,y,z)->{return x+y+z;}; 
	
	
//lambda
	//Shape Triangle = getPerimeter(x, y, z) -> x + y + z;

public static void main(String [ ] args)
{
	
	// Circle         
    Shape circle = new Circle(5);
    System.out.println(circle);
    
    // Square        
    Shape square = new Square(6);
    System.out.println(square);            
    
	// Rectangle 
    Rectangle rectangle = new Rectangle(5, 7);
    System.out.println(rectangle);

    // Triangle       
    Shape triangle = new Triangle(5, 3, 4);
    System.out.println(triangle);
    
    // Parallelogram        
    Shape parallelogram = new Parallelogram(5, 3, 4);
    System.out.println(parallelogram);
	
    System.out.println("Testing Array of Shapes");
	
	Picture pr = new Picture();
	
	pr.pictures =new Shape[]{new Circle(3), new Triangle(1,3,5), new Rectangle(12, 3), new Square(5), new Parallelogram(3, 5, 1), new Triangle(3,5,6)};
    
	
	for(int i=0;i<pr.pictures.length;i++)
	{
		
		
		System.out.println(pr.pictures[i].toString());
	}
}








}
