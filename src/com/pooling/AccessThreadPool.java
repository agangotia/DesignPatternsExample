package com.pooling;
/**
 * @author Anupam Gangotia
 * Profile::http://en.gravatar.com/gangotia
 * github::https://github.com/agangotia
 */
public class AccessThreadPool implements Runnable {

	public static void main(String[] args) {
		ObjectPool.setMaxPoolSize(3);

		for (int i = 0; i < 5; i++) {
			System.out.println("This is Thread Number " + (i + 1));
			Thread t = new Thread(new AccessThreadPool());
			t.setName("Thread_" + i);
			t.start();

		}
	}

	@Override
	public void run() {
		ObjectPool o = ObjectPool.getObject();
		if (null == o) {
			System.out.println("The Pool is Empty");

			while (ObjectPool.getPoolSize() == 0) {
			}
			o = ObjectPool.getObject();
		}

		System.out.println(" Thread: " + "The object retrieved is "
				+ o.getPoolNo());

		try {
			Thread.sleep(3);
		} catch (InterruptedException ex) {
			System.out.println(ex);
		}

		ObjectPool.returnObject(o);

	}

}
