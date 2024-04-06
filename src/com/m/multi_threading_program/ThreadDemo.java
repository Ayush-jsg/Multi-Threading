package com.m.multi_threading_program;

// Wap to display the info of currently running thread

public class ThreadDemo {

	public static void main(String[] args) {

		Thread ct = Thread.currentThread();
		System.out.println(ct);
		System.out.println(ct.getName());
		System.out.println(ct.getPriority());
		System.out.println(ct.getThreadGroup());
	}

}
