package Employee;
/**
* <h1>EmployeeTest</h1>
* The EmployeeTest class 
* has the main method to 
* test the Employee and 
* EmployeeDirectory
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/
public class EmployeeTest {

	public static void main(String [] args)
	{
		EmployeeDirectory empDir = new EmployeeDirectory(); 
		
		Employee emp1 = new Employee("Shyan", "Genius","466-242-8934","Shyan@genius.com"); 
		empDir.add(emp1);
		
		Employee emp2 = new Employee("Badol", "MIS","466-123-8934","Badol@gmail.com"); 
		empDir.add(emp2);
		
		Employee emp3 = new Employee("Tany", "It","466-123-3675","Tany@It.com"); 
		empDir.add(emp3);
		
		System.out.println(empDir.toString());
		empDir.deleteByName("Badol");
		System.out.println(empDir.toString());
		
	}
	
	
	
	
}
