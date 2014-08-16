package com.abstractfactory;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class CustomerDAOSqlServerImpl implements CustomerDAO {

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
	
	public CustomerDAOSqlServerImpl createCustomerDAO()
	{
		return new CustomerDAOSqlServerImpl();
	}


}
