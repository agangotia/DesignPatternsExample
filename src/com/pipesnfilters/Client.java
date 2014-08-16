package com.pipesnfilters;
import java.io.*;
import java.net.*;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class Client {

	public static void main(String[] args) {

		Socket clientSocket = null;
		ObjectOutputStream objStream = null;
		
		
		try
		{
		 
			clientSocket = new Socket("localhost",4040); 
			objStream = new ObjectOutputStream(clientSocket.getOutputStream());
			MessageDetails messageObject = new MessageDetails(" Expense:100000$ Revenue:5000000$ FIRSTQUARTER 2012 ",1);
  	        System.out.println( " Print the record for TRANS ID 1 " );
  	        objStream.writeObject(messageObject); 
	        clientSocket.close(); 
	        objStream.close();
            
			clientSocket = new Socket("localhost",4040); 
			objStream = new ObjectOutputStream(clientSocket.getOutputStream());
			MessageDetails messageObject1 = new MessageDetails(" Expense:200000$ Revenue:7000000$ SECONDQUARTER 2012 ",2);
  	        System.out.println( " Print the record for TRANS ID 2 " );
  	        objStream.writeObject(messageObject1); 
  	        clientSocket.close(); 
	        objStream.close();
  	        
			clientSocket = new Socket("localhost",4040); 
			objStream = new ObjectOutputStream(clientSocket.getOutputStream());
			MessageDetails messageObject2 = new MessageDetails(" Expense:300000$ Revenue:8000000$ THIRDQUARTER 2012 ",3);
  	        System.out.println( " Print the record for TRANS ID 3 " );
  	        objStream.writeObject(messageObject2); 
  	        clientSocket.close(); 
	        objStream.close();
            
			clientSocket = new Socket("localhost",4040); 
			objStream = new ObjectOutputStream(clientSocket.getOutputStream());
 			MessageDetails messageObject3 = new MessageDetails(" Expense:400000$ Revenue:8500000$ FOURTHQUARTER 2012 ",4);
  	        System.out.println( " Print the record for TRANS ID 4 " );
  	        objStream.writeObject(messageObject3); 
  	        clientSocket.close(); 
	        objStream.close();
		}
		
		catch(Exception ex)
	    {
	  	  System.out.println(" Exception caught while sending message to server "+ ex);
	  	  
	    }
  	  
    }			 

	}


