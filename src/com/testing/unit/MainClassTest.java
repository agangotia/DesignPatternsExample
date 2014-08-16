package com.testing.unit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facade.entity.Customer;
import com.facade.facade.Facade;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainClassTest extends TestCase {

	/**
	 * @param args
	 */
	Facade facCust;
	
	public MainClassTest(String arg){
		super(arg);
		facCust = new Facade();
	}
	public static void main(String[] args) {
		
		junit.textui.TestRunner.run(MainClassTest.suite());

	}
	
	private static TestSuite suite() {
		
		TestSuite suite1 = new TestSuite("Test for Facade.Facade class");
		// $JUnit-BEGIN$
				suite1.addTestSuite(MainClassTest.class);
		// $JUnit-END$
		return suite1;
	}
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public final void test1() {
		
		Facade facCust = new Facade();
		Customer objCustomer = facCust.getDetails(100);
		assertEquals(objCustomer.getFirstName(),"Anupam");

	}
	
	@Test
	public final void test2() {
		Facade facCust = new Facade();
		Customer objCustomer = facCust.getDetails(200);
		assertEquals(objCustomer.getSecondName(),"Subravethi");
	}

}
