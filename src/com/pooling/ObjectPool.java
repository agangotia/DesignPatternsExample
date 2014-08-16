package com.pooling;

import java.util.ArrayList;
import java.util.Set;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class ObjectPool {

	private static ArrayList<ObjectPool> listOfObject;
	private static int maxPoolSize;
	private static int currentPoolSize;
	private int poolNo;
	private static Object syncObject = new Object();
	private static Object syncObject1 = new Object();

	private ObjectPool(int n) {
		poolNo = n;
	}

	public static int getPoolSize() {
		return currentPoolSize;
	}

	public int getPoolNo() {
		return poolNo;
	}

	public void setPoolNo(int poolNo) {
		this.poolNo = poolNo;
	}

	public static int getMaxPoolSize() {
		return maxPoolSize;
	}

	public static void setMaxPoolSize(int maxPoolSize) {
		ObjectPool.maxPoolSize = maxPoolSize;
		listOfObject = new ArrayList(maxPoolSize);
		for (int i = 0; i < maxPoolSize; i++) {
			listOfObject.add(new ObjectPool(i + 1));
		}
		currentPoolSize = maxPoolSize;
	}

	public static ObjectPool getObject() {

		synchronized (syncObject) {

			if (maxPoolSize < currentPoolSize || currentPoolSize == 0)
				return null;

			ObjectPool o = listOfObject.get(currentPoolSize - 1);
			listOfObject.remove(currentPoolSize - 1);
			currentPoolSize--;
			return o;
		}
	}

	public static void returnObject(ObjectPool obj) {

		synchronized (syncObject) {
			listOfObject.add(obj);
			currentPoolSize++;
			System.out.println("Object " + obj.getPoolNo() + " is returned");
		}
	}
}
