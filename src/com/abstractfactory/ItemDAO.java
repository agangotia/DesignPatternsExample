/**
 * 
 */
package com.abstractfactory;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface ItemDAO {
	public void add(Item item);

	public void retrieve(Long itemID);

	public void update(Item item);

	public void remove(Long itemID);

}
