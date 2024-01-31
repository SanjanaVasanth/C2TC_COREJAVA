package com.amc.execption;

public class NestedTry {

	public static int divide(int x,int y) {
		// TODO Auto-generated method stub
		int z=x/y;
		return z;
	}
	public static void main(String[] args) {
		try {
			int x,y,z;
			x=5;
			y=0;
			try {
				z=divide(x,y);
			}
			catch(ArithmeticException ex) {
				System.err.println("Arithmetic exception occured: "+ex.getMessage());
			}
		}catch(Exception ex) {
			System.err.println("Super class exception occured:"+ex.getMessage());
		}
	}
}

