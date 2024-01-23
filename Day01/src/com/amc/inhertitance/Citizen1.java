package com.amc.inhertitance;

public class Citizen1 {
	private long adhar;
	private long phone;
	private String address;
	
	public Citizen1() {
		System.out.println("default constructor");
	}
	
	public Citizen1(long adhar,long phone,String address) {
		super();
		this.adhar = adhar;
		this.phone = phone;
		this.address = address;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Citizen1 [adhar=" + adhar + ", phone=" + phone + ", address=" + address + "]";
	}
}
