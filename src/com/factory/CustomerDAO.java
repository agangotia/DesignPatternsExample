/**
 * 
 */
package com.factory;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface CustomerDAO {
	public void add(Customer cust);

	public void retrieve(Long custId);

	public void update(Customer cust);

	public void remove(Long custId);

}
