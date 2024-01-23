package com.amc.polymorphism;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		
		//Dynamic binding you create child class object to the parent class variable as a reference
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterest());
		
	}

}
