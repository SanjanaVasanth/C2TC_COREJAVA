package com.amc.threads;

public class Synchronized {
	static CakeCounter counter=new CakeCounter();
	public static void main(String[] args) {
		Thread teamOne = new Thread(new Team(counter));
		Thread teamTwo = new Thread(new Team(counter));
		
		teamOne.start();
		teamTwo.start();
		
		try {
			teamOne.join();
			teamTwo.join();
		}catch(Exception ex) {
			
		}
		System.out.println(counter);
		
	}

}
