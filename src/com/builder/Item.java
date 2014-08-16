package com.builder;

public class Item {
	private long itemID;
	private double itemPrice;
	private String itemDescription;
	
	public Item()
	{
		itemID=0l;
		itemPrice=0.00;
		itemDescription="";
	}
	
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

}
