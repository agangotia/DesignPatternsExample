package com.abstractfactory;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class CustomerDAOOracleImpl implements CustomerDAO {

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
	

	public CustomerDAOOracleImpl createCustomerDAO()
	{
		return new CustomerDAOOracleImpl();
	}

}
