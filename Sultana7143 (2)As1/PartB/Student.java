package PartB;

/**
* <h1>Student</h1>
* The Student class uses the Calculable
* interface and initialize Student information
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class Student implements Calculable{
	
	private String stuName;
	private String stuID;
	private Address HomeAddress;
	private Address CollegeAddress;
	/**
	 * Default constructor
	 */
	public Student(){
		stuName = null;
		stuID = null;
		HomeAddress=new Address();
		CollegeAddress=new Address();
	}
	//Overloaded Constructor
	public Student(String stnm, String id){
		
		stuName = stnm;
		stuID = id;
		
	}
	
	/**
	 * This method sets the home address
	 * 
	 */
	public void setHomeAddress(int   number, String street, String town, String province, String zipCode)
	{
		HomeAddress = new Address(street,number,town, province, zipCode);
		
	}
	/**
	 * This method sets the 
	 * College address.
	 * 
	 */
	public void setCollegeAddress(int   number, String street, String town, String province, String zipCode)
	{
		CollegeAddress = new Address(street,number,town, province, zipCode);
		
	}
	/**
	 * This method returns
	 * the home address
	 */
	public Address getHomeAddress()
	{
		return HomeAddress;
	}
	/**
	 * This method returns
	 * the college address
	 */
	public Address getCollegeAddress()
	{
		return CollegeAddress;
	}
	/**
	 * This method
	 * returns the 
	 * student number
	 */
	public String getStuNm(){
		return stuName;
		
	}
	/**
	 * This method returns
	 * the student ID
	 * 
	 */
	public String getStuID(){
		return stuID;
		
	}
	/**
	 * This method 
	 * sets the student
	 * name
	 */
	public void setStuNm(String Snm){
		stuName = Snm;
		
	}
	/**
	 * This method 
	 * sets the student
	 * ID
	 */
	public void setstuID(String sid){
		stuID = sid;
		
	}
	 /**
	   * 
	   * This method returns all the class variabl's 
	   * information in a string
	   */
		
	public String toString() {
		String result; 
		result = "Student name :" +this.getStuNm() + "\nStudentID :"
	    		 + this.getStuID() + "\nHome Address: "+ this.getHomeAddress() +
	    		 "\nCollege Address: " + this.getCollegeAddress() + "\n";
			
	    return result;
	 }
	
	
		
	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof Student)) return false;

	    Student st = (Student) e;

	    if (stuName!= st.stuName) return false;
	    if (stuID!= st.stuID) return false;
	    
	    return true;
	  }

	/**
	* This method to 
	* tests the Student class
	*/
	public static void main(String args[]){
						
		Student x = new Student("Tamanna","020417");
		x.setHomeAddress(1950, "Kenedy St", "Toronto", "ON", "M134F9");
		x.setCollegeAddress(90, "Pond Rd", "Toronto", "ON", "L134F3");
		
	}
	/**
	 * Address class is an 
	 * inner class of Student
	 * initializes the student's address
	 *
	 */
	private class  Address{
		private String street;
		private int   number;
		
		private String town;
		private String province;
		private String zipCode;

		public Address(){
			street = null;
			number = 0;
			town = null;
			province = null;
			zipCode = null;
		}
			
		public Address(String st,int nm, String twn,String prvn, String zpCd){
			street = st;
			number = nm;
			town = twn;
			province = prvn;
			zipCode = zpCd;
			}
		
		public String toString() {
			String result; 
			result = number + " " + street +", "+town+", "+province+"-"+zipCode;
		    		 				
		    return result;
		 }
				
		}
	
		
	@Override
    protected Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }
	/**
	 * This method takes the
	 * course information from the
	 * passed by Course array.
	 * Than it calculates the total
	 * book price of all courses
	 * and returns the price.
	 * 
	 */
		
		public double BooksPrice(Course[] semesterCourses)
		{
			double totalprice = 0;
			if(semesterCourses != null){
				
				CourseBkPrThread[] threadCount=new CourseBkPrThread[semesterCourses.length];
				for(int i = 0; i < semesterCourses.length;i++){
					
					try{
						threadCount[i] = new CourseBkPrThread(semesterCourses[i]);
						threadCount[i].start();
					
						threadCount[i].join();
						
					}
					catch(Exception e){
						System.out.println("Inturupted");
					}
					
					totalprice += threadCount[i].getCourseTotal();
						
				}
			}
			return totalprice;
							
		}
		
	
}
