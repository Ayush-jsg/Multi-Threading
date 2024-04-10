package com.m.multi_threading_program;
//java program with start() method 

public class MyThread3 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		for (int i = 1; i <= 5; i++) {
			System.out.println(t.getName() + " Thread value: " + i);
		}

	}

	public static void main(String[] args) {
		MyThread3 mt = new MyThread3();
		Thread t = new Thread(mt);
		t.start();
	}

}
