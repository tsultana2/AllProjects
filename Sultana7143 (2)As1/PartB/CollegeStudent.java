package PartB;
/**
* <h1>CollegeStudent</h1>
* The CollegeStudent class
* is the sub class of Student.
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

class CollegeStudent extends Student{

	private Course [] stCrse=new Course[6];
	/**
	   * This method is used to overload the passed by information
	   * to the present subclass and super class
	   * and initializes the variables.
	      */
	
	public CollegeStudent(Course[] crs,String stnm, String id){
	super.setStuNm(stnm);
	super.setstuID(id);
	setCrse(crs);
	}
	/**
	   * This method returns the student course
	   * 
	   */
	public Course[] getstCrse(){
		return stCrse;
				
	}
	/**
	   * This method returns the student course
	   * sets the students course
	   * in an array and find the
	   * exceptions if it is more than 6
	   */
	public void setCrse(Course[] studentCrs){
	
		
		try{
			
			if(studentCrs.length > 6){throw new OutOfRange("Out of The range");}
			
			for(int i = 0;i < studentCrs.length;i++){
				stCrse[i] = studentCrs[i];
				
			}
			
			if(studentCrs.length<6)
				for(int i= studentCrs.length;i < 6;i++){
					stCrse[i] = null;
					
				}	
		}
		catch (OutOfRange oe){
			System.out.println(oe.getMessage());
		}
		
	}
    
	//user Define exception
	class OutOfRange extends Exception {
		OutOfRange(String s) {
		      super(s);
		   }
		}
	
	
	public double getTotalBkpr(){
		
		return super.BooksPrice(stCrse);
		
	}	
	
	
	@Override
    protected Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
	
	public String toString() {
		String result; 
		result = super.toString() + "\nStudent Courses:\n";
		int courseNo=1;
		for (int i=0;i<stCrse.length;i++)
		{
			if(stCrse[i]!=null)
			{
				result=result +"\nCourse#"+courseNo+ stCrse[i].toString();
			    courseNo++;
			}
		}
		
		result=result+ "\n\nTotal Book Price : $"+ getTotalBkpr();
			
	    return result;
	 }
	
	
	
	
		public static void main(String args[]){
				
		
		//student course array
		Course[] stCrs= new Course[3];
		
		// 1nd Course		
		Course stCr = new  Course("Java", "444","Java Programming 1");
		
		//Books Array
		Book[] crBooks= new Book[2];
		
		Book crBook= new Book("Java Programming Fundamental", "71238651782364" , 23.25);
		
		//Enter book in books array
		crBooks[0]=crBook;
		
		crBook= new Book("Java Mastering", "37846384" , 73.27);
		//Enter book in books array
		crBooks[1]=crBook;
        
		//Enter Books in course
		stCr.setBook(crBooks);
		
		stCrs[0]=stCr;
		
		// 2nd Course
		stCr = new  Course("Unix", "222","UNIX Fundamental");
		
		crBooks= new Book[3];
		crBook= new Book("Unix Fundamental", "238947334875" , 10.45);
		crBooks[0]=crBook;
		
		crBook= new Book("UNIX 123", "348269456" , 13.24);
		crBooks[1]=crBook;

		crBook= new Book("UNIX Expert Guide", "83w46783" , 103.64);
		crBooks[2]=crBook;
		
		stCr.setBook(crBooks);
		
		stCrs[1]=stCr;
		
		// 3rd Course
		stCr = new  Course("Oracle", "333","Oracle PLSQL");
		
		crBooks= new Book[3];
		crBook= new Book("Oracle Administration", "3892457389475" , 210.45);
		crBooks[0]=crBook;
		
		crBook= new Book("Oracle PLSQL", "38469887468" , 103.24);
		crBooks[1]=crBook;

		crBook= new Book("Oracle 12 Query", "83w46783" , 100.50);
		crBooks[2]=crBook;
		
		stCr.setBook(crBooks);
		
		stCrs[2]=stCr;
		
		 CollegeStudent x = new CollegeStudent(stCrs,"Tamanna","020417");
			x.setHomeAddress(1950, "Kenedy St", "Toronto", "ON", "M134F9");
			x.setCollegeAddress(90, "Pond Rd", "Toronto", "ON", "L134F3");
			
				
		System.out.println(x.toString());
		
		
	}
	
	
}
