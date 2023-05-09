package com.citiustech.collectionutility;

import java.util.Arrays;
import java.util.Random;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		Random r = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = r.nextInt(200);
		}
		for(int i :arr){
			System.out.println(i);
		}

		Arrays.sort(arr);
		for(int i :arr){
					System.out.println(i);
				}

		System.out.println();

	}

}
