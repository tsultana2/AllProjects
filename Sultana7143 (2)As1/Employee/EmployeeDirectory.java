package Employee;
/**
* <h1>EmployeeDirectory</h1>
* The EmployeeDirectory class initializes and makes 
* an Employee Directory .
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class EmployeeDirectory {
	
	private Employee[] empList;
	private String orgName;
	private int totEmp;
	
	/**
	   * This method is used to 
	   * make a default constructor
	   */
	public EmployeeDirectory(){
	
		orgName = "Seneca College";
		totEmp = 800;
		empList = new Employee[totEmp];		
	}
	/**
	   * This method is used to 
	   * make a default constructor
	   */
	
	public EmployeeDirectory(String OrNm, int totalEmp){
		
		orgName = OrNm;
		totEmp = totalEmp;
		empList = new Employee[totalEmp];
	}
	/**
	   * This method returns
	   * Organization name
	   */
	public String getOrgNm(){
		return orgName;
		
	}
	/**
	 * This method returns
	 * number of employees
	  */
	public int getNosEmp (){
		int noEmp=0;
		for (int i=0;i<empList.length;i++) { 
	        if (empList[i] != null) {
	        	noEmp++;
	        }
		}
		return noEmp;
	}
	/**
	 * This method sets
	 * the organization name
	 * 
	 */
	public void setOrgNm(String orgNm){
		orgName = orgNm;
		
	}
	public void setTolEmp(int tEmp){
		
		totEmp = tEmp;
	}
	/**
	 * This method sets
	 * the total employee
	 * 
	 */
	public int getTolEmp(){
		
		return totEmp ;
	}
	/**
	 *This method adds the passed by
	 *employee to the employee list.
	 *If the operation adds, the method
	 *returns true  
	 *
	 */
	public boolean add(Employee emp){
		boolean retVal=false;
		for (int i=0;i<empList.length;i++) { 
	        if (empList[i] == null) {
	        	empList[i] = emp;
	        	retVal=true;
	            break;                       
	        }
	    }
		return retVal;
	}
	
	/**
	 *This method deletes the passed by
	 *employee name and returns the
	 *new employee list
	 *
	 */
	
	
	public Employee[] deleteByName(String name ){
		Employee[] empDelListAll= new Employee[totEmp];
		int d=0;
		for (int i=0;i<empList.length;i++) {
			if(empList[i]!=null)
	        if (empList[i].gtemnm() == name) {
	        	empDelListAll[d] = empList[i];
	        	empList[i]=null;
	        	d++;
	        }
	        
	    }
		Employee[] empDelList= new Employee[d];
		System.arraycopy( empDelListAll, 0, empDelList, 0, d);
	
		
		return empDelList;
	}
	
	/**
	   * This method returns all the class variabl's 
	   * information in a string
	   */
	public String toString() {
		String outPut; 
		outPut= "Organization name :" +this.orgName + " Current Employee(s) :"
	    		 + this.getNosEmp() + " Max. Employee(s) "+ this.getTolEmp() +"\n"
	    		 + "Employee List:";
		int empno=1;
		
		for (int i=0;i<empList.length;i++) { 
	        if (empList[i]!=null) {
	        	outPut = outPut + "\n"+ "Emp #"+ empno +" "+ empList[i].toString();
	        	empno++;
	        	
	        	
	        }
	        
	    }
		
	    return outPut;
	 }
	
	
}
