package com.sonata;

public class TwoLargeNumbers {
	public static void main(String arg[]) {
		
		//Initializing array
		int[] arrValues = {5,8,12,65,3};
		int largestNum1 = 0; // local variable
		int largestNum2 = 0; // local variable
		
		// loop to find 2 largest numbers 
		
		for(int i=0; i<arrValues.length; i++) {
			if(largestNum1 <arrValues[i]) {
				largestNum2 = largestNum1;
				largestNum1 = arrValues[i];
				
			}else if (largestNum2 < arrValues[i]) {
				largestNum2 = arrValues[i];
			}
		
		}
		System.out.println("First Largest Number:" +largestNum1);
		System.out.println("Second Largest Number:" +largestNum2);
		
	}
		
}

