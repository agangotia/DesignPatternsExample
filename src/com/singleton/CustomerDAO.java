package com.singleton;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface CustomerDAO {

	public void create (Customer cust);
	public void retrieve(Long custId);
	public void update(Customer cust);
	public void remove(Long custId);
}
