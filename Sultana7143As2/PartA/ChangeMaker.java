package PartA;

/**
 * <h1>CashMaker<h1>
 * The CashMaker initialize
 * the simulation of the cash exchange.
 * Here, customer will get the change
 * according to Canadian dollar
 * 
 * @author Tamanna
 */


public class ChangeMaker implements Cloneable{
	
	CanadianMoney[] billsAndCoins;
	
	
	public ChangeMaker( ){
		billsAndCoins=new CanadianMoney[9];
		CanadianMoney nm = new CanadianMoney();
		nm.setCanadianMoney("$20-Bill(s)",2000,0);
		billsAndCoins[0]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("$10-Bill(s)",1000,0);
		billsAndCoins[1]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("$5-Bill(s)",500,0);
		billsAndCoins[2]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Twoonie(s)",200,0);
		billsAndCoins[3]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Loonie(s)",100,0);
		billsAndCoins[4]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Quarter(s)",25,0);
		billsAndCoins[5]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Dime(s)",10,0);
		billsAndCoins[6]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Nickel(s)",5,0);
		billsAndCoins[7]=nm;
		nm = new CanadianMoney();
		nm.setCanadianMoney("Penny(ies)",1,0);
		billsAndCoins[8]=nm;
	}
	/**
	 * This method returns the money
	 * into a string.
	 * The string will contain 
	 * different changing Canadian Currencies 
	 * @param changeAmt
	 * @return
	 */
	
	public String  getChange(int changeAmt){
		String change="";
		
		for (int i=0;i<billsAndCoins.length-1;i++)
		{
			
			billsAndCoins[i].setCount(changeAmt / billsAndCoins[i].getValue());
			changeAmt=changeAmt % billsAndCoins[i].getValue();
		}
		billsAndCoins[8].setCount(changeAmt);
		
		for(int i=0;i<billsAndCoins.length;i++)
			if(change!="")
				change =change+", "+billsAndCoins[i].toString();
			else
				change =billsAndCoins[i].toString();
		
		return change;
	}
	//getters for class variable
	
	public CanadianMoney[] getCanMon(){
		
		return billsAndCoins;
	}
	//setters for class variable
	public void steCanMon(CanadianMoney [] CanMon){
		
		billsAndCoins = CanMon;
		
	}
	/**
	 * Inner class of ChangeMaker
	 * using to name the bill,
	 * to make the bill into
	 * pennies and count the number
	 * for change 
	 * @author Tamanna
	 *
	 */
	public class CanadianMoney implements Cloneable{
		
		
		String cbName;
		int cbValue;
		int cbCount;
		public CanadianMoney(){
			cbName = null;
			cbValue = 0;
			cbCount = 0;
			
		}
		//Overloaded method
		public CanadianMoney(String blName, int blValue,int blCount){
			 cbName = blName;
			 cbValue = blValue;
			 cbCount = blCount;
		}
		
		public void setCanadianMoney(String blName, int blValue,int blCount){
			 cbName = blName;
			 cbValue = blValue;
			 cbCount = blCount;
		}
		//setters bill count
		public void setCount(int blCount){
			cbCount=blCount;
		}
		//setters for bill value
		public void setValue(int cbV){
			cbValue = cbV;
		}
		//getters for value
		public int getValue(){
			return cbValue;
		}
		//getters for count
		public int getCount(){
			return cbCount;
		}
		//getters for name
		public String getName(){
			return cbName;
		}
		//setters for name
		public void setName(String cbnm){
			cbName = cbnm;
		}

        //returns a string
		public String toString() {
			String result; 
		    result =getCount() + " "+getName();
				
		    return result;
		 }


	    //matching two objects
		public boolean equals(Object e) {
		    if (this == e) return true;
		    if (!(e instanceof CanadianMoney)) return false;
		
		    CanadianMoney cm = (CanadianMoney) e;
		
		    if (cbName!= cm.cbName) return false;
		    if (cbValue!= cm.cbValue) return false;
		    if (cbCount!= cm.cbCount) return false;
		    
		    return true;
		  }

        //cloning the super object
		@Override
		protected Object clone() throws java.lang.CloneNotSupportedException {
		    return super.clone();
		}
	
	}
	

	public String toString() {
		String result; 
	    result = getCanMon() + "\n";
			
	    return result;
	 }



	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof CanadianMoney)) return false;
	
	    ChangeMaker cmk = (ChangeMaker) e;
	
	    if (billsAndCoins!= cmk.billsAndCoins) return false;
	    
	    return true;
	  }


	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}
	
	

}
