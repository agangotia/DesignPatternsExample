package com.facade.persistance;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.facade.entity.Address;
import com.facade.entity.Customer;

public class PersistanceFramework {
	

	private static Map<Integer, Customer> customerMap = new HashMap<Integer, Customer>();
	private static Map<Integer, Address> addressMap = new HashMap<Integer, Address>();
	
	static{
		Address add1 = new Address();
		add1.setAddressLine1("waterview");
		add1.setAddressLine2("pkwy");
		add1.setCity("Richardson");
		add1.setState("Texas");
		add1.setZipCode(75080);
		addressMap.put(100,add1);
		
		
		Address add2 = new Address();
		add2.setAddressLine1("pepper");
		add2.setAddressLine2("place");
		add2.setCity("Irving");
		add2.setState("Texas");
		add2.setZipCode(78050);
		addressMap.put(200,add2);
		
		Address add3 = new Address();
		add3.setAddressLine1("mccullam");
		add3.setAddressLine2("pkwy");
		add3.setCity("Dallas");
		add3.setState("Texas");
		add3.setZipCode(75080);
		addressMap.put(300,add3);
	}
	
	static{
		
		Customer cust1 = new Customer();
		cust1.setFirstName("Anupam");
		cust1.setSecondName("Gangotia");
		cust1.setMiddleInitial("G");
		cust1.setSsn("123456789");
		cust1.setDob(new Date());

		customerMap.put(100,cust1);
		
		Customer cust2 = new Customer();
		cust2.setFirstName("Karthik");
		cust2.setSecondName("Subravethi");
		cust2.setMiddleInitial("S");
		cust2.setSsn("234567891");
		cust2.setDob(new Date());
		customerMap.put(200,cust2);
		
		
		Customer cust3 = new Customer();
		cust3.setFirstName("Karthik");
		cust3.setSecondName("Gunesekaran");
		cust3.setMiddleInitial("G");
		cust3.setSsn("345678912");
		cust3.setDob(new Date());
		customerMap.put(300,cust3);
	}
	public static Address getAddressDetails(int custId){
		
		Address add1 = new Address();
		
		add1 = (Address)addressMap.get(custId);
		return add1;
	}
	
	
	public static Customer getCustomerDetails(int custId){
		
		Customer cust1 = new Customer();
				
		cust1 = (Customer)customerMap.get(custId);
		
		return cust1;
		
		
		/*System.out.println(cust1.getSecondName());
		cust1 = (CustomerVO)customerMap.get(200);
		System.out.println(cust1.getSecondName());
		cust1 = (CustomerVO)customerMap.get(300);
		System.out.println(cust1.getSecondName());*/
		
		//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//System.out.println(customerMap.get(200).getName());
		//System.out.println(dateFormat.format(cust1.getDob().getTime()));

	}
	
	
	public static void main(String args[]){}
}
