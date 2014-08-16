package com.proxy;

import java.math.BigDecimal;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface ComputePI extends Remote{

	BigDecimal computePI(int val) throws RemoteException;
}
