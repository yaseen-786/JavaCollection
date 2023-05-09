package com.citiustech.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("B");
		t.add("R");
		t.add("D");
		t.add("n");
//		t.add(new Integer(10)); class cast exception
//		t.add(null); npe 
		System.out.println(t);
	}

}
