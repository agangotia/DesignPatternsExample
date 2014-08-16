/**
 * 
 */
package engine;

/**
 * @author Anupam Gangotia
 *
 */

/**Any class who implements this interface must be notified 
 * when subject or observable object change its status.**/
	
public interface Observer {

	public void update(float interest);
}
