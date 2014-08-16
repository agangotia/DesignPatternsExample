/**
 * 
 */
package com.abstractfactory;

import java.util.ArrayList;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class Transaction {
	Customer customer;
	ArrayList<Item> itemsList;

	Transaction() {
		customer = new Customer();
		itemsList = new ArrayList<Item>();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ArrayList<Item> getItemsList() {
		return itemsList;
	}

	public void setItemsInList(Item item) {
		itemsList.add(item);
	}

	public void removeItemFromList(Item item) {

		/*
		 * for (Item temp : itemsList) { if (temp.getItemID()==item.getItemID())
		 * { itemsList.remove(o) } }
		 */
		itemsList.remove(item);
	}

}
