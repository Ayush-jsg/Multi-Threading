package com.m.multi_threading_program;

// java program with multiple thread

public class MyThread5 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " Thread value: " + i);
		}

	}

	public static void main(String[] args) {
		MyThread5 mt1 = new MyThread5();
		MyThread5 mt2 = new MyThread5();
		MyThread5 mt3 = new MyThread5();

		Thread t1 = new Thread(mt1);
		Thread t2 = new Thread(mt2);
		Thread t3 = new Thread(mt3);

		t1.start();
		t2.start();
		t3.start();
	}

}
