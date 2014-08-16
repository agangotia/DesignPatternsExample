/**
 * 
 */
package com.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Anupam Gangotia
 * 
 */
public class DAOFactory {

	public CustomerDAO getCustomerDao() throws Exception {

		String dbChoice = "";
		Properties properties = new Properties();
		try {
			/*Loading the values from property file*/
			properties.load(new FileInputStream(
					"src/properties/Lables.properties"));
			dbChoice = properties.getProperty("dbVendor");
		} catch (IOException e) {
			System.out.println("Error in reading properties file");
		}

		if ("oracle".equalsIgnoreCase(dbChoice)) {
			return new CustomerDAOOracleImpl();
		} else if ("mysql".equalsIgnoreCase(dbChoice)) {
			return new CustomerDAOMySqlImpl();
		} else {
			throw new Exception("Unknown DB Vendor: " + dbChoice);
		}
	}

	public ItemDAO getItemDao() throws Exception {

		String dbChoice = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(
					"src/properties/Lables.properties"));
			dbChoice = properties.getProperty("dbVendor");
		} catch (IOException e) {
			System.out.println("Error in reading properties file");
		}

		if ("oracle".equalsIgnoreCase(dbChoice)) {
			return new ItemDAOOracleImpl();
		} else if ("mysql".equalsIgnoreCase(dbChoice)) {
			return new ItemDAOMySqlImpl();
		} else {
			throw new Exception("Unknown DB Vendor: " + dbChoice);
		}
	}

	public TransactionDAO getTransactionDao() throws Exception {

		String dbChoice = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(
					"src/properties/Lables.properties"));
			dbChoice = properties.getProperty("dbVendor");
		} catch (IOException e) {
			System.out.println("Error in reading properties file");
		}

		if ("oracle".equalsIgnoreCase(dbChoice)) {
			return new TransactionDAOOracleImpl();
		} else if ("mysql".equalsIgnoreCase(dbChoice)) {
			return new TransactionDAOMySqlImpl();
		} else {
			throw new Exception("Unknown DB Vendor: " + dbChoice);
		}
	}

	

}
