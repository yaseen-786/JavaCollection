package com.citiustech.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add("Yaseen");
		ll.add("Vishal");
		ll.add("Abhishek");
		ll.add("Nikku");
		ll.add("Vaishnavi");
		ll.add("Jyoti");
		System.out.println(ll);
		ListIterator li = ll.listIterator();
		while(li.hasNext()){
			String s = (String)li.next();
			if(s.equals("Vaishnavi")){
				li.remove();
			}
			else if(s.equals("Nikku")){
				li.set("Nikhil");
			}
			
		}
		System.out.println(ll);

	}

}
