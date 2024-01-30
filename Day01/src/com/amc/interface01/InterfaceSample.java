package com.amc.interface01;

public class InterfaceSample {
	public static void main(String[] args) {
		Shape circle = new Circle(5.0);
		Shape rectangle = new Rectangle(4.0,6.0);
		
		displayShapeInfo(circle);
		displayShapeInfo(rectangle);
	}

	private static void displayShapeInfo(Shape shape) {
		// TODO Auto-generated method stub
		System.out.println("Area: "+shape.calculateArea());
		System.out.println("Perimeter: "+shape.calculatePerimeter());
		System.out.println();
		
	}

}
