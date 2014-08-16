/**
 * 
 */
package com.abstractfactory;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class SqlServerDAOFactory implements DAOFactory {

	@Override
	public CustomerDAO getCustomerDao() throws Exception {
		return new CustomerDAOSqlServerImpl();
	}

	@Override
	public ItemDAO getItemDao() throws Exception {
		return new ItemDAOSqlServerImpl();
	}

	@Override
	public TransactionDAO getTransactionDao() throws Exception {
		return new TransactionDAOSqlServerImpl();
	}

}
