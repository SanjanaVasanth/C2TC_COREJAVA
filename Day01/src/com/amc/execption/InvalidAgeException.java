package com.amc.execption;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException() {
		super("Invalid age");
	}
	
	public InvalidAgeException(String message) {
		super(message);
	}

}
