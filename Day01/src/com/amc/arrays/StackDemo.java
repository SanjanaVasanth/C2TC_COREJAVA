package com.amc.arrays;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println(stack);
		stack.push(1);
		//stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(null);
		System.out.println(stack);
		//System.out.println("pop operation:"+ stack.pop());
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		System.out.println(stack.search(2));
		System.out.println(stack.peek());
		System.out.println(stack);
		

	}

}
