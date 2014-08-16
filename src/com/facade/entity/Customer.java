package com.facade.entity;

import java.util.Date;

public class Customer {
	
	protected String firstName;
	protected String secondName;
	protected String middleInitial;
	protected String ssn;
	protected Date dob;
	protected Address addressVO;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddressVO() {
		return addressVO;
	}
	public void setAddressVO(Address addressVO) {
		this.addressVO = addressVO;
	}
	
}
