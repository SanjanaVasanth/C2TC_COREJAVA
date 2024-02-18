package com.amc.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Limit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4,1,1,5,3);
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).findFirst());

	}

}
