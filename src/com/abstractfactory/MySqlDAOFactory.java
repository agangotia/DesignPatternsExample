package com.abstractfactory;

/**
 * @author Anupam GAngotia
 * 
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
