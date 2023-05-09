package com.citiustech.collections;

import java.util.Comparator;
import java.util.TreeSet;

import javax.jws.soap.SOAPBinding;

public class TreeSetUsingCustomizedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t = new TreeSet(new MyComparator());
		t.add(1);
		t.add(10);
		t.add(100);
		t.add(25);
		t.add(25);
		System.out.println(t);

	}

}
class MyComparator implements Comparator{


	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
//		if(I1>I2){
//			return -1;
//			
//		}
//		else if(I1<I2){
//			return +1;
//		}
//		else{
//			return 0;
//		}
		//return -I1.compareTo(I2);
		return I2.compareTo(I1);
		
	}}
