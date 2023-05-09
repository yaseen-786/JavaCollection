package com.citiustech.collections;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args){
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<=v.capacity();i++){
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.addElement("Collections");
		System.out.println(v.capacity());
		System.out.println(v.get(2));
		System.out.println(v.removeElement(3));
		System.out.println(v);
	}

}
