package com.amc.polymorphism;

public class RBI {
	public float getRateOfInterest() {
		return 6.7f;
	}

}
//Inheritence
class SBI extends RBI{
	public float getRateOfInterest() {
		return 8.0f;
	}
}

class HDFC extends RBI{
	public float getRateOfInterest() {
		return 15.0f;
	}
}

class ICICI extends RBI{
	public float getRateOfInterest() {
		return 9.0f;
	}
}
