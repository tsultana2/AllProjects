

import java.io.*;
import java.net.*;
/**
 * This clas makes connection
 * with the server.
 * @author Sultana
 *
 */

public class Server {
	
	public static void main(String[] args){
		System.out.println("My Computer is my Server");
		
		try{
			//New server socket with port number 7143
			ServerSocket Cc = new ServerSocket(7143);
			//First listen and create a socket
			System.out.println("Server:Listening for a connection...");
			Socket cS = Cc.accept();
			
			// making output/input objects and
			// connect to output/input streams 
			ObjectOutputStream oOS = new ObjectOutputStream(
					cS.getOutputStream());
			ObjectInputStream oIS = new ObjectInputStream(
					cS.getInputStream());
			System.out.println("Server:I/O streams connected to socket-server");
			
			//Transfers objects with the client
			
			CreditCard cCard;
			
			try{
				
				
				while(true){
					//read an object from the client
					cCard = (CreditCard) oIS.readObject();//using readObject method
					System.out.println("Recieving an object from the client:  " + cCard);
					
					new CardValidation();
					//validate the credit card and then sent it back 
					cCard.setIsVal(CardValidation.isValid(cCard.getCreditCard()));
					
					
					//send the object to the client
					oOS.writeObject(cCard);
					oOS.flush();
					System.out.println("Sending object to the client:    " + cCard);
				}
				
			}catch(ClassNotFoundException cnf){
				cnf.printStackTrace();
			} catch (EOFException eof){
				System.out.println("The client has terminated connection!");
			} catch (IOException e){
				e.printStackTrace();
			}
			//close connection with client
			oOS.close();
			oIS.close();
			cS.close();
			Cc.close();
		} catch (IOException e){
			e.printStackTrace();
		}

		System.out.println("Server is going to stop running");
	}
}
