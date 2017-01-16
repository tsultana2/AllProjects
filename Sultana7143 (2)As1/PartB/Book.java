package PartB;
/**
* <h1>Book</h1>
* The Book class initializes  
* all the variables to
* identify a book 
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class Book implements Cloneable{
	
	private String Bkname;
	private String ISBN;
	private double price;
     public Book(){
		Bkname = null;
		ISBN = null;
		price = 0;
		
	}
     
     @Override
     protected Object clone() throws java.lang.CloneNotSupportedException {
         return super.clone();
     }
     
     /**
      * This method is used to overload the passed by information
      * to the present class
      * and initializes the variables.
         */
	public Book(String Bnm, String isbn , double pr){
		Bkname = Bnm;
		ISBN = isbn;
		price = pr;
				
	}
	/**
	 * This method returns
	 * Book name.
	 */
	public String getBkname(){
		return Bkname;
			}
	/**
	 * This method returns
	 * Book ISBN.
	 */
	
	public String getISBN(){
		return ISBN;
			}
	/**
	 * This method returns
	 * Book price.
	 */
    public double getprice(){
    	
    	return price;
    	
    }
    /**
	 * This method sets
	 * Book name.
	 */
    public void setBkname(String bknm){
    	Bkname = bknm;
    	    	
    }
    /**
	 * This method sets
	 * Book ISBN.
	 */
    public void setISBN(String isbn){
    	ISBN = isbn;
    	
     }
    /**
	 * This method sets
	 * Book price.
	 */
    public void setprice(double pr)
    {
    	price = pr;
    	
    }
    /**
	   * This method returns all the class variabl's 
	   * information in a string
	   */
       
    public String toString() {
		String result; 
		result = "Book name :" +this.getBkname() + " ISBN :"
	    		 + this.getISBN() + " Price  "+ this.getprice() +"\n";
	
		
	    return result;
	 }
	
	
		
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Book)) return false;

	    Book bk = (Book) e;

	    if (Bkname != bk.Bkname) return false;
	    if (ISBN!= bk.ISBN) return false;
	    if (price!= bk.price) return false;
	       

	    return true;
	  }
	
	/**
	 * Main method to test the 
	 * Book class
	  */
	 public static void main(String args[]){
	 
				
		Book x = new Book("Java2010","647234",32.45);
		
		Book cloned = null;
		try {
			cloned = (Book) x.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(x.toString());
		System.out.println(cloned.toString());
	}
	
	
    
    
}

