package com.citiustech.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "Yaseen");
		t = null;
		System.gc();
		System.out.println(m);
		

	}

}
class Temp{
	public String toString(){
		return "Temp";
	}
	public void finalize(){
		System.out.println("Finalize method called");
	}
	
}
