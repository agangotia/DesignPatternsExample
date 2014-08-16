package com.abstractfactory;

public class CustomerDAOMySqlImpl implements CustomerDAO {

	@Override
	public void add(Customer cust) {
		// TODO Auto-generated method stub

	}

	@Override
	public void retrieve(Long custId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Customer cust) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Long custId) {
		// TODO Auto-generated method stub

	}
	
	public CustomerDAOMySqlImpl createCustomerDAO()
	{
		return new CustomerDAOMySqlImpl();
	}

}
