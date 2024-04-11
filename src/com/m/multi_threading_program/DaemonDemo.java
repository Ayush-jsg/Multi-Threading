package com.m.multi_threading_program;

public class DaemonDemo extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) { // checking for daemon thread
			System.out.println("Daemon thread work");
		} else {
			System.out.println("user thread work");
		}

	}

	public static void main(String[] args) {
		DaemonDemo d1 = new DaemonDemo(); // creating thread
		DaemonDemo d2 = new DaemonDemo();
		DaemonDemo d3 = new DaemonDemo();

		d1.setDaemon(true); // now d1 is daemon thread

		d1.start();
		d2.start();
		d3.start();
	}

}
