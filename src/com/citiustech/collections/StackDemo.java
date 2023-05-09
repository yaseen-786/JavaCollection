package com.citiustech.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(1);
		s.push(20);
		s.push(30);
		s.push("A");
		System.out.println(s.peek());
		System.out.println(s.search(20));
		System.out.println(s.search(40));
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.removeAll(s));
		System.out.println(s.empty());
		System.out.println(s);  
	}

}
