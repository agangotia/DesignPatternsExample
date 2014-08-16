package com.pipesnfilters;
import java.io.*;
import java.net.*;


public class Process1 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket;
	    Socket clientSocket;
	    ObjectInputStream clientInputStream = null;
	    MessageDetails msgObject;
		
		/* Server code - accept connect requests from the clients */
 
		   try
		   {

		     serverSocket = new ServerSocket(4040);
		     clientSocket = null;
		   
		     while(true)
		     {
		    		 System.out.println("Waiting for client to connect Process1: ");
		    	     clientSocket = serverSocket.accept();                        // accept client connection
		    	     clientInputStream = new ObjectInputStream(clientSocket.getInputStream());
	       		     msgObject = (MessageDetails)clientInputStream.readObject();  // blocking input pipe
	       		     new Thread(new ProcessIncomingRequests(msgObject)).start();  // create multiple thread to handle client requests

		     }
		   }
		   
		   catch(Exception ex)
		   {
			 System.out.println( " Exception caught " + ex );  
		   }


	}

}




/* This thread handles multiple client requests */

class ProcessIncomingRequests implements Runnable
{

	MessageDetails msgObject;
	
	ProcessIncomingRequests(MessageDetails msgObject1)
	{
		this.msgObject = msgObject1;
		
	}
	
    public void run()
    
    {   
    	try
    	{
    		Socket clientSocket = new Socket("localhost",1616);  // try connecting to Process2
    		ObjectOutputStream objStream = new ObjectOutputStream(clientSocket.getOutputStream());
  	        System.out.println( " Send record to Process 2 " );
  	        objStream.writeObject(this.msgObject); 
            clientSocket.close(); 
	        objStream.close();
		
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println( " Exception caught " + ex );
    	}
    	
    }
}