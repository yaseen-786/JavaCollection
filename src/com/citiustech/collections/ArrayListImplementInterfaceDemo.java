package com.citiustech.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListImplementInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<Object>();
		System.out.println(al instanceof Serializable );
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		
	}

}
