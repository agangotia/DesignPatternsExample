/**
 * 
 */
package com.abstractfactory;

/**
 * @author Anupam GAngotia
 * 
 */
public interface DAOFactory {

	public CustomerDAO getCustomerDao() throws Exception;

	public ItemDAO getItemDao() throws Exception;

	public TransactionDAO getTransactionDao() throws Exception;
	
	

}
