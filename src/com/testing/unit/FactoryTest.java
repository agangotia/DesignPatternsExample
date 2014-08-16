package com.testing.unit;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.factory.CustomerDAOOracleImpl;
import com.factory.DAOFactory;

public class FactoryTest extends TestCase {
	private DAOFactory objFactory;

	public FactoryTest(String arg0) {
		super(arg0);

		objFactory = new DAOFactory();
	}

	public static void main(String[] args) {

		junit.textui.TestRunner.run(FactoryTest.suite());

	}

	private static TestSuite suite() {

		TestSuite suite1 = new TestSuite(
				"Test for com.testengine.FactoryTest.java");

		// $JUnit-BEGIN$

		suite1.addTestSuite(FactoryTest.class);

		// $JUnit-END$

		return suite1;

	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void test() {

		try {
			assertEquals(objFactory.getCustomerDao().getClass(),
					com.factory.CustomerDAOOracleImpl.class);
			assertEquals(objFactory.getItemDao().getClass(),
					com.factory.ItemDAOOracleImpl.class);
			assertEquals(objFactory.getTransactionDao().getClass(),
					com.factory.TransactionDAOOracleImpl.class);
		} catch (Exception ex) {

		}
	}

	@Test
	public final void test2() {

		try {
			assertNotSame(objFactory.getCustomerDao().getClass(),
					com.factory.CustomerDAOMySqlImpl.class);
			assertNotSame(objFactory.getItemDao().getClass(),
					com.factory.ItemDAOMySqlImpl.class);
			assertNotSame(objFactory.getTransactionDao().getClass(),
					com.factory.TransactionDAOMySqlImpl.class);
		} catch (Exception ex) {

		}
	}

}
