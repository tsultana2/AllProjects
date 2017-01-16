package PartA;
/**
 * <h1>Produce<h1>
 * The Produce initializes
 * the product name,
 * price, PLU code 
 * and unit price. 
 * 
 * @author Tamanna
 * 
 * 
 *
 */


public class Produce implements Cloneable {
String pluCode;
String name;
int price;
String priceUnit; 
	//default constructor
public Produce(){
	 pluCode = null;
	 name = null;
	 price = 0;
	 priceUnit = null; 
		
}
//overloaded constructor
public Produce(String plCd, String nm, int pr, String prUnt){
	pluCode = plCd;
	name = nm;
	price = pr;
	priceUnit = prUnt;
		
}
//returns a string
public String toString() {
	String result; 
	double pr = (double)this.getprice()/100.0;
	result = this.getPLcd() + "\t\t" +pr+"/"+this.getprUnt()+"\t\t"+ this.getPrname();
		
    return result;
 }


//Comparing two objects	
public boolean equals(Object e) {
    if (this == e) return true;
    if (!(e instanceof Produce)) return false;

    Produce pro = (Produce) e;

    if (pluCode!= pro.pluCode ) return false;
    if (name!= pro.name) return false;
    if (priceUnit!= pro.priceUnit) return false;
    
    return true;
  }
//getters for product PLU code
public String getPLcd(){
	
	return pluCode;
}
//getters for product name
public String getPrname(){
		
	return name;
}	
//getters for price of the product	
public int getprice(){
	
	return price;
}
//getters for unit price for a product
public String getprUnt(){
	
	return priceUnit;
}
//setters for PLU code
public void setPLcd(String plcd){
	
	 pluCode = plcd;
}
//setters for product name
public void setPrname(String nm){
		
	name = nm;
}	
//setters for price	
public void setprice(int pr){
	
	price = pr;
}
//setters for unit price
public void setprUnt(String prunt){
	
	 priceUnit = prunt;
}

//setters the passed by value to the current object
public void setProduce(String Name, String PLUCode, double Price, String PriceUnit){
	this.name=Name;
	this.price=(int) (Price*100);
	this.pluCode=PLUCode;
	this.priceUnit=PriceUnit;
}


@Override
protected Object clone() throws java.lang.CloneNotSupportedException {
    return super.clone();
}

}
