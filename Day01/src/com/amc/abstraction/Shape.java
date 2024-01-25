package com.amc.abstraction;

public abstract class Shape {
	float area;
	public abstract void calculateArea(); //no implementation
	void show() {
		System.out.println("Area of the shape"+area);
	}
	

}
