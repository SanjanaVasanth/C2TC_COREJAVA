package com.amc.threads;

public class Team implements Runnable {
	CakeCounter counter;
	Team(CakeCounter counter){
		this.counter=counter;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++) {
			counter.increment();
		}
		
	}
}
