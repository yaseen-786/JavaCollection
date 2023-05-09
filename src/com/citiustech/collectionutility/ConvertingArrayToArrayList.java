package com.citiustech.collectionutility;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ConvertingArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[10];
		Random r = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = r.nextInt(100);
		}
		System.out.println(Arrays.asList(arr).getClass().getName());
		List l = Arrays.asList(arr);
		System.out.println(l);
		System.out.println(Arrays.toString(arr));


	}

}
