package com.amc.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread tOne = new MyClass(5,"First Thread");
		Thread tTwo = new MyClass(10,"Second Thread");
		tOne.start();
		tTwo.start();
		

	}

}
