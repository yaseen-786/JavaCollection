package com.citiustech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursorDemo {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		for(int i = 0;i<=10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer I = (Integer)itr.next();
			if(I%2!=0){
				System.out.println(I);
			}
			else{
				itr.remove();
			}
			
		}
		System.out.println(al);
	}
	

}
