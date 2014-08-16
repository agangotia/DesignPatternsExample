/**
 * 
 */
package com.abstractfactory;

/**
 * @author Anupam Gangotia
 * 
 */
public interface ItemDAO {
	public void add(Item item);

	public void retrieve(Long itemID);

	public void update(Item item);

	public void remove(Long itemID);

}
