/**
 * 
 */
package com.observer;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */

/**Any class who implements this interface must be notified 
 * when subject or observable object change its status.**/
	
public interface Observer {

	public void update(float interest);
}
