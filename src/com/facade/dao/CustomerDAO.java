package com.facade.dao;

import com.facade.persistance.PersistanceFramework;
import com.facade.entity.Customer;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class CustomerDAO {

	public Customer getCustomerDetails(int custId){
		
		
		return PersistanceFramework.getCustomerDetails(custId);
	}

}
