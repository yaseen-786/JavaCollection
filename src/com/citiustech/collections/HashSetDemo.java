package com.citiustech.collections;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args){
		HashSet h = new HashSet();
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
