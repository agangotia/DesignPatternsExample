/**
 * 
 */
package com.singleton;

/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class SingletonClass {

	// SingletonClass INSTANCE should be private and static
	private static SingletonClass INSTANCE = new SingletonClass();
	private int i = 0;

	// constructor should be private
	private SingletonClass() {
	}

	// getter setter
	public int getI() {
		return i;
	}

	public void setI(int a) {
		i = a;
	}

	// public static getInstance Method
	public static SingletonClass getInstance() {
		if (INSTANCE == null)
			INSTANCE = new SingletonClass();
		return INSTANCE;

	}
}
