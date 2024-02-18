package com.amc.lambdaexpression;

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Statement s=() -> {return "Hello world";};
		System.out.println(s.greet());
		

	}

}
