/**
 * 
 */
package com.abstractfactory;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface DAOFactory {

	public CustomerDAO getCustomerDao() throws Exception;

	public ItemDAO getItemDao() throws Exception;

	public TransactionDAO getTransactionDao() throws Exception;
	
	

}
