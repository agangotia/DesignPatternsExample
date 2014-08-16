package com.facade.dao;

import com.facade.persistance.PersistanceFramework;
import com.facade.entity.Address;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class AddressDAO {

	public Address getAddressDetails(int custId){

		return PersistanceFramework.getAddressDetails(custId);
	}
}
