package com.pipesnfilters;
import java.io.*;
import java.net.*;




public class Process2 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket;
	    Socket clientSocket;
	    File fileObject;
	    ObjectInputStream clientInputStream = null;
	    MessageDetails msgObject;
		
		/* Server code - accept connect requests from the clients */
 
		   try
		   {

		     serverSocket = new ServerSocket(1616);
		     clientSocket = null;
		     fileObject = new File("Transaction_Log.txt");
		      
              
		      if(fileObject.exists())
		      {
		    	  
		    	  fileObject.delete();
		    	  System.out.println( "  Existing File is deleted " );
		    	  
		      }
		      else
		      {
		    	  fileObject.createNewFile();
		    	  System.out.println( " New File is created " );
		    	  
		      }
		      
		      
		     while(true)
		     {
		    		 System.out.println("Waiting for client to connect Process2: ");
		    	     clientSocket = serverSocket.accept();                        // accept client connection
		    	     clientInputStream = new ObjectInputStream(clientSocket.getInputStream());
	       		     msgObject = (MessageDetails)clientInputStream.readObject();  // blocking input pipe
	       		     new Thread(new Process1Requests(msgObject)).start();  // create multiple thread to handle client requests

		     }
		   }
		   
		   catch(Exception ex)
		   {
			 System.out.println( " Exception caught " + ex );  
		   }


	}

}

/* This thread handles multiple requests from Process1 */

class Process1Requests implements Runnable
{

	MessageDetails msgObject;
	PrintWriter pw;
	
	Process1Requests(MessageDetails msgObject1)
	{
		this.msgObject = msgObject1;
		
	}
	
    public void run()
    
    {
    	String outputFile = "Transaction_Log.txt";
    	   
    	try
    	{   
    		    pw = new PrintWriter(new BufferedWriter(new FileWriter(outputFile, true)));
		    	System.out.println( " Ready to write to the file Transaction ID: " + msgObject.transID );
		    	pw.println("Transaction ID: " + msgObject.transID + " Record: " + msgObject.Message);
		    	pw.close();
		    	System.out.println( " Write to the Transaction log file for transID: " + msgObject.transID + " is complete " );
		
    	}
    	
    	catch(Exception ex)
    	{
    		System.out.println( " Exception caught " + ex );
    	}
    	
    }
}