package com.testing.unit;

import java.math.BigDecimal;
import java.rmi.Naming;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




import com.proxy.ComputePI;
import com.proxy.MyClient;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class ProxyTest extends TestCase {
	public ComputePI theServer;

	public ProxyTest(String arg0) {
		super(arg0);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(ProxyTest.suite());
	}

	private static TestSuite suite() {
		TestSuite suite1 = new TestSuite("Test for Client Server RMI class");
		// $JUnit-BEGIN$
		suite1.addTestSuite(ProxyTest.class);
		// $JUnit-END$
		return suite1;
	}

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		theServer = (ComputePI) Naming.lookup("rmi://localhost/myserver");
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public final void test1() {
		MyClient c = new MyClient();
		BigDecimal bd = c.startClient(theServer, "6");
		Assert.assertTrue(bd.compareTo(new BigDecimal("3.142858")) == 0);
	}

	@Test
	public final void test2() {
		MyClient c = new MyClient();
		BigDecimal bd = c.startClient(theServer, "7");

		String estOutput = new String("3.1428572");
		assertEquals(bd.toString(), estOutput);
		Assert.assertTrue(bd.compareTo(new BigDecimal("3.1428572")) == 0);
	}
}