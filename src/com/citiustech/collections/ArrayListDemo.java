package com.citiustech.collections;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("Yaseen");
		al.add(19);
		al.add(null);
		al.add("Yaseen");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"Java");
		al.add("list");
		System.out.println(al);

	}

}
