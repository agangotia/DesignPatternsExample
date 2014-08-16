package com.builder;

public class Shipment {
	private Long shipmentId;
	private String shipmentDetails;
	
	
	public Shipment()
	{
		shipmentId=0l;
		shipmentDetails="";
	}
	public Long getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(Long shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getShipmentDetails() {
		return shipmentDetails;
	}
	public void setShipmentDetails(String shipmentDetails) {
		this.shipmentDetails = shipmentDetails;
	}
	

}
