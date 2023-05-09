package com.citiustech.collectionutility;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,7,6,4,9,0};
		System.out.println(findSecondLargest(arr));
	}
	public static int findSecondLargest(int[] arr) {
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    //System.out.println(Integer.toString(largest));
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > largest) {
	            secondLargest = largest;
	            //System.out.println(secondLargest);
	            largest = arr[i];
	           // System.out.println(largest);
	        } else if (arr[i] > secondLargest ) {
	            secondLargest = arr[i];
	            //System.out.println(secondLargest);
	        }
	    }
	    
	    return secondLargest;
	}

}
