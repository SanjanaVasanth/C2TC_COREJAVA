package com.amc.execption;

import java.util.Scanner;

public class UserdefinedExceptionDemo {
	
	public static void validate(int age)throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Your age is invalid and you are not eligible to vote");
		}else {
			System.out.println("You are eligible to vote!");
		}
	}
	
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		age=sc.nextInt();
		try {
			validate(age);
		}catch(InvalidAgeException ex) {
			System.err.println("invalid age,please check your age: "+ex.getMessage());	
		}
	}

}
