package com.singleton;

/**
 * @author anupam gangotia
 *
 */
public interface CustomerDAO {

	public void create (Customer cust);
	public void retrieve(Long custId);
	public void update(Customer cust);
	public void remove(Long custId);
}
