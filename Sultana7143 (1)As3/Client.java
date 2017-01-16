
import java.net.*;
import java.io.*;
/**
 * Client class taking Credit Card
 * information as Credit Card objects
 * from the client and sends to the
 *  Server to validate.
 * 
 *  @author Sultana
 *
 */

public class Client {
	
	//Sends information to the Server for validation
	public static void main(String[] args){
		
		Socket clntCrdSocket;
		try{
			//Creating new Socket with ID numbers(last 4 digit)
			
			clntCrdSocket = new Socket(InetAddress.getByName("localhost"),7143);
			System.out.println("Client Connected to: " + clntCrdSocket.getInetAddress().getHostName());
			
			//Creating input/output objects
			ObjectInputStream InfoServer = new ObjectInputStream(
					clntCrdSocket.getInputStream());
			ObjectOutputStream outServer = new ObjectOutputStream(
					clntCrdSocket.getOutputStream());
			System.out.println("Input/Output Streams connect to the socket");
			
			
			//Creating new CreditCard objects
			CreditCard[] cards = new CreditCard[4];
			
			cards[0] = new CreditCard(4012888888881881L);//valid
			cards[1] = new CreditCard(1012888888881881L);//false
			cards[2] = new CreditCard(8812888888881881L);//false
			cards[2] = new CreditCard(4724090015674060L);
			
			System.out.println("Credit Card1: " + cards[0]);
			//Looping, up to the Array limit
			for(int i = 0;i < 4;i++){
				try{
					//send an object to server
					
					outServer.writeObject(cards[i]);
					outServer.flush();
					System.out.println("Sending the CreditCard obect to server:   " + cards[i]);
					
					//receive an object from the server
					cards[i] = (CreditCard) InfoServer.readObject();
					System.out.println("Received the CreditCard object from server:   " + cards[i]);
					
					try {
			            Thread.sleep(2000);
			          } catch (InterruptedException e) {
			        }
					
				}catch (ClassNotFoundException cnf) {
			          cnf.printStackTrace();
		        } catch (EOFException eof) {
		          System.out.println("The connection has been terminated");
		        } catch (IOException e) {
		          e.printStackTrace();
		        }
			}
			System.out.println("Credit Card after examination  " + cards[0]);
			//Server connection closing
			System.out.println("Client: Closing connection to server.");
			outServer.close();
			InfoServer.close();
			clntCrdSocket.close();
		} catch (IOException ioe) {
		      ioe.printStackTrace();
	    }
		System.out.println("Client:The client is going to stop running");

		
	}

}
