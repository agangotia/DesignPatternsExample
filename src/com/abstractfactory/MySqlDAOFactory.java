package com.abstractfactory;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class MySqlDAOFactory implements DAOFactory {

	@Override
	public CustomerDAO getCustomerDao() throws Exception {
		return new CustomerDAOMySqlImpl();
	}

	@Override
	public ItemDAO getItemDao() throws Exception {
		return new ItemDAOMySqlImpl();
	}

	@Override
	public TransactionDAO getTransactionDao() throws Exception {
		return new TransactionDAOMySqlImpl();
	}

}
