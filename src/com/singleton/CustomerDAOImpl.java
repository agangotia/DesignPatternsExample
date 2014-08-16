/**
 * 
 */
package com.singleton;

/**
 * @author anupam gangotia
 *
 */
public class CustomerDAOImpl implements CustomerDAO{
	
	
	// SingletonClass INSTANCE should be private and static
		private static CustomerDAO INSTANCE = new CustomerDAOImpl();
		private int i = 0;

		// constructor should be private
		private CustomerDAOImpl() {
		}

		

		// public static getInstance Method
		public static synchronized CustomerDAO getInstance() {
			if (INSTANCE == null)
				INSTANCE = new CustomerDAOImpl();
			return INSTANCE;

		}

		@Override
		public void create(Customer cust) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void retrieve(Long custId) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void update(Customer cust) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void remove(Long custId) {
			// TODO Auto-generated method stub
			
		}

}
