

import java.io.*;
/**
 * This class takes
 * the creditcard information
 * and make Credit card objects
 * for the Client.
 * This class uses Serializable
 * interface to grab the characteristics
 * of stream of bytes
 * @author Sultana
 *
 */


@SuppressWarnings("serial")
public class CreditCard implements Serializable{

	
	Long CrdtCrNum;
	Boolean CrdVld;
	//Default constructor
	public CreditCard(){
		CrdtCrNum = 0L;
		CrdVld = false;
		
		
	}
	//Overloaded constructor
	public CreditCard(long cn){
		CrdtCrNum = cn;
		CrdVld = false;
		
		
	}
	//Getters for credit card number
	 public long getCreditCard(){
		 
		 return CrdtCrNum;
		 
	 }
	 //Setters which set the credit card number
	 public void setcrdtcrdNm(Long CrNum){
		 
		 CrdtCrNum = CrNum;
		 
	 }
	 //Returns the Credit card's status
	 public Boolean getIsval(){
		 
		 return CrdVld;
		 
	 }
	 //Sets the Credit card's status
	 public void setIsVal(Boolean isVal){
		 
		 CrdVld = isVal;
	 }
	 public String toString() {
			return "Client Credit Card = " + CrdtCrNum + ", Card Validation =" + CrdVld + "]";
		}
	 
	 @Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((CrdVld == null) ? 0 : CrdVld.hashCode());
			result = prime * result + ((CrdtCrNum == null) ? 0 : CrdtCrNum.hashCode());
			return result;
		}
	 //Compares two objects
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			CreditCard other = (CreditCard) obj;
			if (CrdVld == null) {
				if (other.CrdVld != null)
					return false;
			} else if (!CrdVld.equals(other.CrdVld))
				return false;
			if (CrdtCrNum == null) {
				if (other.CrdtCrNum != null)
					return false;
			} else if (!CrdtCrNum.equals(other.CrdtCrNum))
				return false;
			return true;
		}
	 
	
	
}
