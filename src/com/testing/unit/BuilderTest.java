package com.testing.unit;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.builder.CreditCard;
import com.builder.Customer;
import com.builder.Item;
import com.builder.Shipment;
import com.builder.Transaction;
import com.builder.TransactionBuilder;

public class BuilderTest extends TestCase {
	private TransactionBuilder objTransactionBuilder;

	public BuilderTest(String arg0) {
		super(arg0);

		objTransactionBuilder = new TransactionBuilder();
	}

	public static void main(String[] args) {

		junit.textui.TestRunner.run(BuilderTest.suite());

	}

	private static TestSuite suite() {

		TestSuite suite1 = new TestSuite(
				"Test for com.testengine.BuilderTest.java");

		// $JUnit-BEGIN$

		suite1.addTestSuite(BuilderTest.class);

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

		objTransactionBuilder.startTransaction();

		// customer
		Customer objCustomer = new Customer();
		objCustomer.setCustID(1l);
		objCustomer.setFirstName("Raj");
		objCustomer.setLastName("Kapoor");
		objCustomer.setPhoneNumber(9802281590l);

		// Creditcard
		CreditCard objCreditCard = new CreditCard();
		objCreditCard.setCreditCardNo(111111l);
		objCreditCard.setCustomer(objCustomer);

		// Item 1
		Item objItem = new Item();
		objItem.setItemID(1l);
		objItem.setItemDescription("item1");
		objItem.setItemPrice(2.2);

		// Item 2
		Item objItem2 = new Item();
		objItem2.setItemID(2l);
		objItem2.setItemDescription("item2");
		objItem2.setItemPrice(3.2);

		// Shipment
		Shipment objShipment = new Shipment();
		objShipment.setShipmentId(1l);
		objShipment.setShipmentDetails("Shipment address 1");

		objTransactionBuilder.setCreditCard(objCreditCard);
		objTransactionBuilder.setCustomer(objCustomer);
		objTransactionBuilder.addLineItem(objItem);
		objTransactionBuilder.addLineItem(objItem2);
		objTransactionBuilder.setShipment(objShipment);

		Transaction objTransaction = objTransactionBuilder.build();
		// System.out.println("Initial "+objCreditCard.getCreditCardNo());
		// System.out.println("final "+objTransaction.getCreditCard().getCreditCardNo());
		
		assertEquals(objTransaction.getCreditCard().getCreditCardNo(),
				objCreditCard.getCreditCardNo());

		assertEquals(objTransaction.getCustomer().getCustID(),
				objCustomer.getCustID());
		
		assertEquals(objTransaction.getShipment().getShipmentId(),
				objShipment.getShipmentId());
	}

}
