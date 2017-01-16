package PartA;
/**
 * 
 * <h1>CashRegister<h1>
 * The CashRegister initialize
 * the simulation of the cash register.
 * Here, customer will choose the item and
 * amount.
 * The program will calculate the price of the
 * product and give the total and change of money
 * if any issue occurs.
 * @author Tamanna
 *
 * 
 */


import java.util.Scanner;
import java.util.stream.IntStream;

import PartA.ChangeMaker.CanadianMoney;
//Implement the interface Findable
public class CashRegister implements  Findable,Cloneable {

	Produce [] produces;
	//Default constructor
	public CashRegister(){
		produces=null;
		
	}
	//Overloaded constructor
	public CashRegister(Produce [] pro){
		produces = pro;
		
	}
	//getter for produces
	public Produce [] getProduce(){
		
		return produces;
	}
	//Method sets produces
	public void setProduce(Produce [] prduce){
		produces = prduce;
		
	}
	//Returns a string
	public String toString() {
		String result; 
	    result = getProduce()+"\n";
			
	    return result;
	 }

//equal method compares two objects

	public boolean equals(Object e) {
	    if (this == e) return true;
	    if (!(e instanceof CashRegister)) return false;
	
	    CashRegister CR = (CashRegister) e;
	
	    if (produces!= CR.produces) return false;
	    	    
	    return true;
	  }

//clone uses the Cloneable interface and return the clone of super class
	@Override
	protected Object clone() throws java.lang.CloneNotSupportedException {
	    return super.clone();
	}
//returns the PLU index
	
	public int getProductIndex(String pluc, Findable find){
		return find.findIndex(this.produces, pluc);
				
		}
	/*method passing array of Produce with PLU
	Matching the passed by PLU string in the
	passed by array.
	If matches
	method returns index*/
	
	@Override
	public int findIndex(Produce[] ps, String pluc) {
		int index=-1;
		
		try{
		index= IntStream.range(0, ps.length)
                .filter(i -> (ps[i].getPLcd().equals(pluc)))
                .findFirst().getAsInt();
		}
		catch(Exception ex )
		{
		 
		}
		
			return index;
	}
	//This method truncates the decimals after two digit
	static double truncateDouble(double number, int numDigits) {
	    double result = number;
	    String arg = "" + number;
	    int idx = arg.indexOf('.');
	    if (idx!=-1) {
	        if (arg.length() > idx+numDigits) {
	            arg = arg.substring(0,idx+numDigits+1);
	            result  = Double.parseDouble(arg);
	        }
	    }
	    return result ;
	}
	//main function to implement CashRegister class
	public static void main(String [ ] args)
	{
		
		
		CashRegister cr= new CashRegister();
		cr.produces=new Produce[10];
		Produce p= new Produce();
		p.setProduce("Apple Alkmene", "3000", 3.99, "lb");
		cr.produces[0]=p;
		
		p= new Produce();
		p.setProduce("Apple Golden Delicious", "3005", 2.49, "lb");
		cr.produces[1]=p;
		
		p= new Produce();
		p.setProduce("Pear Clara Friis", "3015", 1.88, "lb");
		cr.produces[2]=p;
		
		p= new Produce();
		p.setProduce("Pear General Leclerc", "3020", 2.99, "lb");
		cr.produces[3]=p;
		
		p= new Produce();
		p.setProduce("Orange Shamouti", "3027", 1.29, "lb");
		cr.produces[4]=p;
		
		p= new Produce();
		p.setProduce("Mandarin Nova", "3030", 1.89, "lb");
		cr.produces[5]=p;
		
		p= new Produce();
		p.setProduce("Pineapple Queen", "3037", 2.99, "ea");
		cr.produces[6]=p;
		
		p= new Produce();
		p.setProduce("Cabbage Spring", "3051", 3.99, "ea");
		cr.produces[7]=p;
		
		p= new Produce();
		p.setProduce("Tomato Beefsteak", "3061", 0.99, "lb");
		cr.produces[8]=p;
		
		p= new Produce();
		p.setProduce("Avocado Pinkerton", "3080", 0.69, "ea");
		cr.produces[9]=p;
		
		System.out.println("\nPLU Code\tPrice\t\tProduce Name");
		System.out.println("-----------------------------------------------");
		for (int i=0;i<10;i++)
		{
			System.out.println(cr.produces[i].toString());
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("\nEnter PLU code and quantity (separated by space[s]. Enter \"0\" to end.");
		double total=0.0;
		boolean loop=true;
		while(loop)
		{
			Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
			//if(scan!=null) scan.close();
			if(s.equals("0")) 
				loop=false;
			else
			{
				double qty=0;
				int fi=-1; //Produce item index if found
				try
				{
				String[] ui=s.split(" ",2);
				String pc=ui[0].trim();
				qty=Double.parseDouble(ui[1]);
				fi=cr.getProductIndex(pc, cr);
				}
				catch (Exception ex)
				{
					System.out.println(ex.getMessage());
					System.out.println("Invalid input, ignored!");
				}
				if (fi<0 || qty<=0)
					System.out.println("Invalid input, ignored!");
					else
					{
						
						System.out.println("  " +cr.produces[fi].getPrname()); 
						System.out.printf("\t"+qty+" @ "+ (double)cr.produces[fi].getprice()/100.0 +"/"+cr.produces[fi].priceUnit+"\t\t\t");
						double pr = truncateDouble(qty*cr.produces[fi].getprice()/100,2);
						System.out.printf("%.2f\n",pr);
						total = total+pr;
					}
				}
				
			}
		total=truncateDouble(total,2);
		System.out.printf("TOTAL\t\t\t\t\t$%.2f",total);
	
		System.out.printf("\n\nEnter the amount the customer paid:$");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		//if(scan!=null) scan.close();
		 
		double cp=Double.parseDouble(s);
		int ch=(int)(cp*100)-(int)(total*100);	
		
		System.out.printf("\nThe change is: $%.2f",(double)ch/100.0);
		ChangeMaker cm= new ChangeMaker();
		int ich=(int)(ch);
		
		System.out.println("\n\n"+cm.getChange(ich));
		System.out.println("\nCash Register program end.");
		
	}
	
}

	
	
	
	

