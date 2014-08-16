package com.proxy;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyServer extends UnicastRemoteObject implements ComputePI{

	protected MyServer() throws RemoteException{
		super();
	}
	
	public BigDecimal computePI(int val) throws RemoteException{
		PI pi = new PI(val);
		return pi.execute();
	}
	
	public static void main(String args[]){
		try{
			Registry r =  LocateRegistry.getRegistry();
			r.bind("myserver", new MyServer());
			System.out.println("The PI computer is ready for action");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}