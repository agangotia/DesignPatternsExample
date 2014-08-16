/**
 * 
 */
package com.builder;

/**
 * @author Anupam Gangotia
 *
 */
public class TransactionBuilder {
	Transaction objTransaction;
	
	
	
	public void startTransaction()
	{
		objTransaction=new Transaction();
	}
	
	public void setCustomer(Customer cust)
	{
		objTransaction.setCustomer(cust);
	}
	
	public void setCreditCard(CreditCard cc)
	{
		objTransaction.setCreditCard(cc);
	}
	public void setShipment(Shipment s)
	{
		objTransaction.setShipment(s);
		
	}
	public void addLineItem(Item i)
	{
		objTransaction.setItemsInList(i);
		
	}
	public void removeLineItem(Item i)
	{
		objTransaction.removeItemFromList(i);
	}
	public Transaction build()
	{
		return  objTransaction;
	}

}
