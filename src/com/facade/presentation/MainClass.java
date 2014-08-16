package com.facade.presentation;

import java.util.Date;

import com.facade.facade.*;
import com.facade.entity.Address;
import com.facade.entity.Customer;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		int custId;
		
		custId =200;
		
		Facade facCust = new Facade();
		Customer objCustomer =facCust.getDetails(custId);
		//CustomerVO cust = facCust.getCustomerDetails(custId);
		//AddressVO add = facCust.getAddressDetails(custId);
				
		System.out.println(objCustomer.getFirstName());
		System.out.println(objCustomer.getSecondName());
		System.out.println(objCustomer.getMiddleInitial());
		System.out.println(objCustomer.getSsn());
		System.out.println(objCustomer.getDob());
		System.out.println(objCustomer.getAddressVO().getAddressLine1());
		System.out.println(objCustomer.getAddressVO().getAddressLine2());
		System.out.println(objCustomer.getAddressVO().getCity());
		System.out.println(objCustomer.getAddressVO().getState());
		System.out.println(objCustomer.getAddressVO().getZipCode());

	}

}
