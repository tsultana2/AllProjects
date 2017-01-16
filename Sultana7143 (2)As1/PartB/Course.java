package PartB;

import Employee.Employee;
/**
* <h1>Course</h1>
* The Course class uses 
* to make an object with
* all student Course 
* information
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class Course {

	private String CrsName;
	private String id;
	private String description;
	Book [] book =new Book[3];
	public Course(){
		CrsName = null;
		id = null;
		description = null;
		
	}
	/**
	   * This method is used to overload the passed by information
	   * to the present class
	   * and initializes the variables.
	      */
	public Course(String nm, String Id,String des){
		CrsName = nm;
		id = Id;
		description = des;
				
	}
	/**
	 * This method
	 * returns the 
	 * Course name
	 */
	public String getNm(){
		return CrsName;
	}
	/**
	 * This method
	 * returns the 
	 * ID
	 */
	public String getId(){
		return id;
	}
	/**
	 * This method
	 * returns the 
	 * description
	 */
	public String getDes(){
		return description;
	}
	/**
	 * This method 
	 * sets the Course
	 * name
	 */
	public void setNm(String nm){
		CrsName = nm;
	}
	/**
	 * This method 
	 * sets the ID
	 */
	public void setId(String Id){
	id =Id;
	}
	/**
	 * This method
	 * sets the 
	 * description
	 */
	public void setDes(String des){
		description = des;
		
	}
	/**
	 * This method
	 * returns the 
	 * array of book
	 */
	public Book[] getBooks()
	{
		return book;
	}
	/**
	 * This method
	 * sets the 
	 * array of book
	 */
	
	public void setBook(Book[] books){
		
		try{
			for(int i = 0;i < books.length;i++){
			  	
				book[i] = books[i];
				
			}
			if(books.length<3)
				for(int i = books.length;i < 3;i++){
				  	
					book[i] = null;
					
				}
		}catch (Exception e){
			System.out.println("Out of the range");
		}
	
		
	}
	/**
	   * 
	   * This method returns all the class variabl's 
	   * information in a string
	   */
	
	public String toString() {
		String result; 
		result = "Course name :" +this.getNm() + " Student ID :"
	    		 + this.getId() + " Description  "+ this.getDes() +"\n"
	    		 + "Book List:\n";
		int bookNo=1;
		
		for (int i=0;i<book.length;i++) { 
	        if (book[i]!=null) {
	        	result = result + "Book #"+ bookNo +" "+ book[i].toString();
	        	bookNo++;
	        	
	        	
	        }
	        
	    }
		
	    return result;
	 }
	@Override
    protected Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Employee)) return false;

	    Course cr = (Course) e;

	    if (CrsName != cr.CrsName) return false;
	    if (id!= cr.id) return false;
	    if (description!= cr.description) return false;
	    if (book != cr.book) return false;
	    

	    return true;
	  }
}





