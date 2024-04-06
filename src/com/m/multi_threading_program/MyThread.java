package com.m.multi_threading_program;

public class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("user thread value" + i);

		}
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
	}

}
