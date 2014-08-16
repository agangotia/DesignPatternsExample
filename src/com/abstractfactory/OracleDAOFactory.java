package com.abstractfactory;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class OracleDAOFactory implements DAOFactory {

	@Override
	public CustomerDAO getCustomerDao() throws Exception {
		return new CustomerDAOOracleImpl();
	}

	@Override
	public ItemDAO getItemDao() throws Exception {
		return new ItemDAOOracleImpl();
	}

	@Override
	public TransactionDAO getTransactionDao() throws Exception {
		return new TransactionDAOOracleImpl();
	}

}
