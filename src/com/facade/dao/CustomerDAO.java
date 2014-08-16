package com.facade.dao;

import com.facade.persistance.PersistanceFramework;
import com.facade.entity.Customer;

public class CustomerDAO {

	public Customer getCustomerDetails(int custId){
		
		
		return PersistanceFramework.getCustomerDetails(custId);
	}

}
