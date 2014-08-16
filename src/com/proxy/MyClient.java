package com.proxy;

import java.io.BufferedReader;  
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class MyClient {
	
	public BigDecimal startClient(ComputePI theServer, String command){
		
		try{
			
			//MyServer theServer = new MyServer();
			
			
				if(null == command || command.equalsIgnoreCase("quit")){
					System.out.println("Done !! :)");
				}else{
					
					try{
						
						int digits = Integer.parseInt(command);
						//PI piComputation = new PI(digits);
						BigDecimal theResult = theServer.computePI(digits);
						System.out.println("Congrats, The answer is "+theResult);
						return theResult;
						
						
					}catch(NumberFormatException e){
						System.out.println("Give 'quit' to exit");
						//e.printStackTrace();
					}
				}

		}catch(Exception ex){
			ex.printStackTrace();			
		}
		finally{/*
			try {
				Registry r =  LocateRegistry.getRegistry();
				r.unbind("myserver");
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (NotBoundException e) {
				e.printStackTrace();
				
			}*/
			
		}
		return new BigDecimal(0.0);
	}
	
	public static void main(String args[]){
		MyClient client = new MyClient();
		System.out.println("Compute Pi to how many decimal points");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ComputePI theServer;
		try {
			theServer = (ComputePI) Naming.lookup("rmi://localhost/myserver");
			
			String command=null;
			try {
				command = reader.readLine();
				new MyClient().startClient(theServer, command);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
				
		//System.out.println(client.startClient(command));
	}

}
