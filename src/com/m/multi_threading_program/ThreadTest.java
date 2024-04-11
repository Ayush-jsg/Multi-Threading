package com.m.multi_threading_program;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("run() method logic-1");

			}
		};
		t1.start();

		Runnable r = new Runnable() {
			public void run() {
				System.out.println("run() method logic-2");

			}

		};
		Thread t2 = new Thread(r);
		t2.start();

		Callable c = new Callable() {
			public Object call() throws Exception {
				System.out.println("call() method logic-3");
				return null;
			}

		};
		ExecutorService exservic = Executors.newFixedThreadPool(1);
		exservic.submit(c);
	}

}
