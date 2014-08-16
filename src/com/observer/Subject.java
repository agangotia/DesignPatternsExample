/**
 * 
 */
package com.observer;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public interface Subject {

	public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();



}
