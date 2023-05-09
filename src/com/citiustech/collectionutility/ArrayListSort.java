package com.citiustech.collectionutility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(30);
		al.add(2);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al.contains("3"));
		System.out.println(al.getClass().getName());
		LinkedList ll = new LinkedList(al);
		System.out.println(ll.getClass().getName());
		System.out.println(ll);
		
	}

}
