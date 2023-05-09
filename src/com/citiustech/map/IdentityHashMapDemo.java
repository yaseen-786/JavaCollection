package com.citiustech.map;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap m = new IdentityHashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "Yaseen");
		m.put(i2,"Yash");
		System.out.println(m);
	}

}
