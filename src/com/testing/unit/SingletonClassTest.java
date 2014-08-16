/**
 * 
 */
package com.testing.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.singleton.CustomerDAO;
import com.singleton.CustomerDAOImpl;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class SingletonClassTest extends TestCase {

	private CustomerDAO objCustomerDAO;

	public SingletonClassTest(String arg0) {
		super(arg0);

		objCustomerDAO = CustomerDAOImpl.getInstance();
	}

	public static void main(String[] args) {

		junit.textui.TestRunner.run(SingletonClassTest.suite());

	}

	private static TestSuite suite() {

		TestSuite suite1 = new TestSuite("Test for Engine.SingletonClass.java");

		// $JUnit-BEGIN$

		suite1.addTestSuite(SingletonClassTest.class);

		// $JUnit-END$

		return suite1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link engine.SingletonClass#getI()}.
	 */
	@Test
	public final void test1() {
		CustomerDAO objCustomerDAO2 = CustomerDAOImpl.getInstance();

		assertEquals(objCustomerDAO, objCustomerDAO2);

	}

	
	/**
	 * Test method for {@link engine.SingletonClass#getI()}.
	 */
	@Test
	public final void test2() {
		CustomerDAO objCustomerDAO2 = CustomerDAOImpl.getInstance();
		CustomerDAO objCustomerDAO3 = CustomerDAOImpl.getInstance();
		assertEquals(objCustomerDAO, objCustomerDAO3);

	}
}
