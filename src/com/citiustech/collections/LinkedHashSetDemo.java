package com.citiustech.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet h = new LinkedHashSet();
		h.add("yaseen");
		h.add("This");
		h.add("is");
		h.add("java hashset");
		h.add(null);
		h.add(17);
		System.out.println(h.add("yaseen"));
		System.out.println(h);
	}

}
