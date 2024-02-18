package com.amc.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Distinct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = Arrays.asList(1,2,3,4,5,6,5,6,4,3);
		list.stream().distinct().forEach(System.out::println);

	}

}
