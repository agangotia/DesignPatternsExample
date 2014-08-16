/**
 * 
 */
package com.builder;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class CreditCard {
private Long creditCardNo;
private Customer customer;

public CreditCard()
{
	creditCardNo=0l;
	customer=new Customer();
}

public Long getCreditCardNo() {
	return creditCardNo;
}
public void setCreditCardNo(Long creditCardNo) {
	this.creditCardNo = creditCardNo;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
}
