package com.facade.dao;

import com.facade.persistance.PersistanceFramework;
import com.facade.entity.Address;

public class AddressDAO {

	public Address getAddressDetails(int custId){

		return PersistanceFramework.getAddressDetails(custId);
	}
}
