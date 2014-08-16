/**
 * 
 */
package com.abstractfactory;

/**
 * @author Anupam Gangotia
 * 
 */
public interface CustomerDAO {
	public void add(Customer cust);

	public void retrieve(Long custId);

	public void update(Customer cust);

	public void remove(Long custId);

}
