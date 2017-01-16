package PartB;
/**
* <h1>CourseBkPrThread</h1>
* The CourseBkPrThread class is
* the sub class of Thread
* <p>
*
* @author  Tamanna Sultana 
* @version 1.0
* @since   2016-06-12 
*/

public class CourseBkPrThread extends Thread {
    Course pCr=null; 
    double courseTotal=0.0;
    //Overloads the passed by Course object
	public CourseBkPrThread(Course cr){
		pCr=cr;
	}
	
	public void run(){
		if(pCr!=null)
		{
			Book[] bks=pCr.getBooks();
			for(int i=0;i<bks.length;i++)
			{
				if(bks[i]!=null)
				courseTotal=courseTotal + bks[i].getprice();
			}
		}
	}
	//Returns the Course total
	public double getCourseTotal(){
		return courseTotal;
	}
	
}
