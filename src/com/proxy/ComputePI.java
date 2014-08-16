package com.proxy;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComputePI extends Remote{

	BigDecimal computePI(int val) throws RemoteException;
}
