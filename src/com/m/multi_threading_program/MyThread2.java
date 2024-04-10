package com.m.multi_threading_program;

public class MyThread2 implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("user thread value:" + i);
		}

	}

	public static void main(String[] args) {
		MyThread2 mt = new MyThread2();
		Thread t = new Thread(mt);
		t.start();
	}

}
