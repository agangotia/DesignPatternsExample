/**
 * 
 */
package engine;

/**
 * @author Anupam Gangotia
 *
 */
public interface Subject {

	public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();



}
