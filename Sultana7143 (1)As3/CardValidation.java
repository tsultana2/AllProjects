
import java.util.ArrayList;
import java.util.List;
/**
 * CaredValidation class
 * This class validates 
 * cards
 * @author Tamanna Sultana
 *
 */
public class CardValidation {
	public static void main(String[] args) {
	long creditCardNumber = 4012888888881881L;
	
	System.out.println(isValid(creditCardNumber));
	}
	
	//This method Reverse the passed by credit card number
	public static List<Long> toDigitsReverse(long l) {
		// l='782657834675634786523478'
		//Transferring passed by long into String
	    String sL = Long.toString(l).trim();
        //Making a list of Long
	    List<Long> iL = new ArrayList<Long>();
	   
	    //Looping from the String Length up to null
	    //It will reverse the Long
	    for(int i=sL.length()-1;i>=0;i--){
	    	
	    iL.add(Long.parseLong(sL.substring(i, 	i+1)));
	    }
	    return iL;
	
	}
	/**
	 * This method will
	 * double the every second number of the List
	 * and return the new List
	 * @param list
	 * @return
	 */
	
	public static List<Long> doubleSecond(List<Long> list) {
	
	for(int i =1;i<=list.size();i=i+2){
	
	list.set(i,list.get(i)*2);
	}
	return list;
	}
	/**
	 * This method is
	 * adding all the 
	 * numbers of the
	 * List
	 * @param list
	 * @return
	 */
	public static long sumDigits(List<Long> list) {
	   Long sum =0L;
	for(int i =0;i<list.size();i++){
	sum +=list.get(i);
	}
	return sum;
	
	}
	/**
	 * 
	 * If the sum of the 
	 * whole card number
	 * modulate by 2 and
	 * the result is 0, the 
	 * card is valid
	 * otherwise invalid.
	 * @param l
	 * @return
	 */
	public static boolean isValid(long l) {
		boolean cardValid=false;
	List<Long> rL=toDigitsReverse(l);
	rL=doubleSecond(rL);
	Long sm=sumDigits(rL);
	if(sm%2==0)cardValid=true;
	return cardValid;
	}
}
	

