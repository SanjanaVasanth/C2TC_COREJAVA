package com.amc.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List obj=new ArrayList();
		System.out.println(obj);
		obj.add(7);
		obj.add("Rahul");
		obj.add(4.8f);
		System.out.println(obj);
		obj.add(new Integer(9));
		obj.add(true);
		System.out.println(obj);
		obj.add(7);
		System.out.println(obj);

	}

}
