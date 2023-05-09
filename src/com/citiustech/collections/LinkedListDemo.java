package com.citiustech.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.add("Yaseen");
		ll.add(30);
		ll.add(null);
		ll.add("Yaseen");
		ll.set(1, "Java");
		ll.add(0,20);
		ll.removeLast();
		ll.addFirst("Demo");
		System.out.println(ll);
	}

}
