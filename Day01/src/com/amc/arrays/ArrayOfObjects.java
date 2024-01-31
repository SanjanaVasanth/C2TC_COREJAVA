package com.amc.arrays;

public class ArrayOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student arr[]=new Student[5];
		arr[0]=new Student(11,"Rahul");
		arr[1]=new Student(12,"Ravi");
		arr[2]=new Student(13,"Ravin");
		arr[3]=new Student(14,"Rohith");
		arr[4]=new Student(15,"Roshan");
		
		for(Student s:arr) {
			System.out.println(s.getAge()+ " "+s.getName());
		}

	}

}
