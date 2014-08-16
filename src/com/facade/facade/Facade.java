package com.facade.facade;

import com.facade.dao.AddressDAO;
import com.facade.dao.CustomerDAO;
import com.facade.entity.Address;
import com.facade.entity.Customer;

public class Facade {

	public static void main(String args[]){
	}
	
	
	public Customer getDetails(int custId){
		CustomerDAO cust = new CustomerDAO();
		Customer cVo = cust.getCustomerDetails(custId);
		
		AddressDAO add = new AddressDAO();
		Address aVo = add.getAddressDetails(custId);
		
		cVo.setAddressVO(aVo);
		return cVo;
	}
}
