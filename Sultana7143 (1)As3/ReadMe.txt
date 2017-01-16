Assignment 3 project include
cardValidation,Creditcard,Server,CreditCard, and Client classes

To validate the Client credit card the project follows 
four steps such as
First make an interface, then make an implementation class
to implement the method of interface, creates the server class
to register and finally make the client class to connect with
the server. Also the project makes the credit card class to make
the infrustructure of the credit card.

 * CaredValidation class
 * This class validates 
 * cards
 static List<Long> toDigitsReverse(long l)
This method Reverse the passed by credit card number
static List<Long> doubleSecond(List<Long> list)
* This method will
	 * double the every second number of the List
	 * and return the new List
static long sumDigits(List<Long> list)
 * This method is
	 * adding all the 
	 * numbers of the
	 * List
static boolean isValid(long l)
 * If the sum of the 
	 * whole card number
	 * modulate by 2 and
	 * the result is 0, the 
	 * card is valid
	 * otherwise invalid.

   Client class
 * Client class taking Credit Card
 * information as Credit Card objects
 * from the client and sends to the
 *  Server to validate.
 * 

CreditCard Class

* This class takes
 * the creditcard information
 * and make Credit card objects
 * for the Client.
 * This class uses Serializable
 * interface to grab the characteristics

Server Class

* This clas makes connection
 * with the server.