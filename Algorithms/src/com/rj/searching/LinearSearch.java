package com.rj.searching;

public class LinearSearch {
	
	public static int searchOnArray(int[] arr, int value) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == value) {
				return i;
			}
		}
		
		return -1;
	}

}
