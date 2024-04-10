package com.m.multi_threading_program;

// java program with run() method 

public class MyThread4 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " Thread value: " + i);
		}

	}

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		Thread t = new Thread(mt);
		// t.start();
		t.run();
	}

}
