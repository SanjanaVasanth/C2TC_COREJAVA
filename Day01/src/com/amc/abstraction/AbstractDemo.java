package com.amc.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Rectangle rOne = new Rectangle(8.0f,9.0f);
		rOne.calculateArea();
		rOne.show();*/
		
		/*Square sOne = new Square(5);
		sOne.calculateArea();
		sOne.show();*/
		
		//Dynamic Binding
		
		Shape shape;
		shape=new Square(3);
		shape.calculateArea();
		shape.show();
		
		Shape shape1;
		shape1=new Rectangle(3,2);
		shape1.calculateArea();
		shape1.show();
		

	}

}
