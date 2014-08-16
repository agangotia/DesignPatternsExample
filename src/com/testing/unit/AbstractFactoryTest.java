/**
 * 
 */
package com.testing.unit;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.abstractfactory.CustomerDAO;
import com.abstractfactory.DAOFactory;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class AbstractFactoryTest extends TestCase {

	private DAOFactory objFactory;

	public AbstractFactoryTest(String arg0) {
		super(arg0);

	}

	public static void main(String[] args) {

		junit.textui.TestRunner.run(AbstractFactoryTest.suite());

	}

	private static TestSuite suite() {

		TestSuite suite1 = new TestSuite(
				"Test for com.testengine.AbstractFactoryTest.java");

		// $JUnit-BEGIN$

		suite1.addTestSuite(AbstractFactoryTest.class);

		// $JUnit-END$

		return suite1;

	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test1() throws Exception {

		String className = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(
					"src/properties/LablesAbsFac.properties"));

			className = properties.getProperty("daoFactoryClass");
		} catch (IOException e) {
			System.out.println("Error in reading properties file");
		}

		Class factoryClass = Class.forName(className);
		DAOFactory daoFactory = (DAOFactory) factoryClass.newInstance();
		// CustomerDAO custDAO = daoFactory.getCustomerDao();
		System.out.println(daoFactory.getCustomerDao().getClass());

		assertEquals(daoFactory.getCustomerDao().getClass(),
				com.abstractfactory.CustomerDAOOracleImpl.class);
		assertEquals(daoFactory.getItemDao().getClass(),
				com.abstractfactory.ItemDAOOracleImpl.class);
		assertEquals(daoFactory.getTransactionDao().getClass(),
				com.abstractfactory.TransactionDAOOracleImpl.class);
	}
	
	@Test
	public final void test2() throws Exception {

		String className = "";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(
					"src/properties/LablesAbsFac.properties"));

			className = properties.getProperty("daoFactoryClass");
		} catch (IOException e) {
			System.out.println("Error in reading properties file");
		}

		Class factoryClass = Class.forName(className);
		DAOFactory daoFactory = (DAOFactory) factoryClass.newInstance();
		// CustomerDAO custDAO = daoFactory.getCustomerDao();
		System.out.println(daoFactory.getCustomerDao().getClass());

		assertNotSame(daoFactory.getCustomerDao().getClass(),
				com.abstractfactory.CustomerDAOMySqlImpl.class);
		assertNotSame(daoFactory.getItemDao().getClass(),
				com.abstractfactory.ItemDAOMySqlImpl.class);
		assertNotSame(daoFactory.getTransactionDao().getClass(),
				com.abstractfactory.TransactionDAOMySqlImpl.class);
	}

}
