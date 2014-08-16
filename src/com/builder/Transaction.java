/**
 * 
 */
package com.builder;

import java.util.ArrayList;

/**
 * @author akg
 *
 */
public class Transaction {
	
	Customer customer;
	CreditCard creditCard;
	Shipment shipment;
	ArrayList <Item> itemsList;
	
	Transaction()
	{
		customer=new Customer();
		creditCard=new CreditCard();
		shipment=new Shipment();
		itemsList=new ArrayList <Item>();
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public Shipment getShipment() {
		return shipment;
	}
	public void setShipment(Shipment shipment) {
		this.shipment = shipment;
	}
	public ArrayList<Item> getItemsList() {
		return itemsList;
	}
	public void setItemsInList(Item item) {
		itemsList.add(item);
	}
	public void removeItemFromList(Item item) {
		
		/*for (Item  temp : itemsList)
		{
			if (temp.getItemID()==item.getItemID())
			{
				itemsList.remove(o)
			}
		}*/
		itemsList.remove(item);
	}
	

}
