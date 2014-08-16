/**
 * 
 */
package com.observer;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class Internet  implements Observer {
	
	@Override
    public void update(float interest) {
           System.out.println("Internet: Interest Rate updated, new Rate is: "
                        + interest);
    }

}
