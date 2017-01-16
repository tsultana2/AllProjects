package Employee;

/**
* <h1>Employee</h1>
* The Employee class initialize 
* Employee information
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class Employee {
  private String  empName;
  private String  deptName;
  private String phNum;
  private String  email;

  public Employee(){
	  
	  empName = null;
	  deptName = null;
	  phNum = null;
	  email = null;
	  	  
  }
  /**
   * This method is used to overload the passed by information
   * to the present class
   * and initializes the variables.
      */
  public Employee(String emnm, String dpnm,String phnm,String eml){
	  empName = emnm;
	  deptName = dpnm;
	  phNum = phnm;
	  email = eml;
  	
  }
  /**
   * This method returns the employee name
   * 
   */
  public String gtemnm(){
  
	  return empName;
	  
	  
  }
  /**
   * 
   * @returns the department name
   */
  public String gtdpnm(){
  
	  return deptName;
  
  }
  /**
   * 
   * @returns employee phone number
   */
  public String gtphnm(){
	
	  return phNum;
	  
  }
  /**
   * 
   * @returns employee email
   */
  
  public String gteml(){
	
	  return email;
  }
  /**
   * 
   * This method sets the employee name
   */
  public void setnm(String emplynm){
	  
	  empName = emplynm;
	
	  
  }
  /**
   * 
   * This method sets the department name
   */
  public void setdnm(String dptNm){
  deptName = dptNm;
	    
  }
  /**
   * 
   * This method sets the employee phone number
   */
  public void setphnm(String phnum){
	
	  phNum = phnum;
	  
  }
  /**
   * 
   * This method sets the employee email
   */
  public void seteml(String eml ){

	  email = eml;

  }
    
  /**
   * 
   * This method returns all the class variabl's 
   * information in a string
   */
 @Override
  public String toString() {
	 
    return "Employee name :" +this.gtemnm() + " Department name :"
    		 + this.gtdpnm() + " Phone Number :" + this.gtphnm() + " Email :"+ this.gteml();
 }
  
  @Override
  public boolean equals(Object e) {
    if (this == e) return true;
    if (!(e instanceof Employee)) return false;

    Employee emp = (Employee) e;

    if (empName != emp.empName) return false;
    if (deptName!= emp.deptName) return false;
    if (phNum!= emp.phNum) return false;
    if (email != emp.email) return false;
    

    return true;
  }
  
  
  protected Object clone() throws java.lang.CloneNotSupportedException {
      return super.clone();
  }
  
  
  }












