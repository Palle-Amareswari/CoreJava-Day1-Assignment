package com.sonata;

public class ReverseArray {
	public static void main(String arg[]) {
		
		//initialize array
		
		int[] num = {5,4,3,2,1};
		System.out.println("Original Array:");
		
		// 
		
		for(int i=0; i<num.length;i++) {
			System.out.println(num[i]+ " ");
		}
		
		System.out.println("Reverse of an Array:");
		for(int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]+ " ");
		}
		
	}

}
