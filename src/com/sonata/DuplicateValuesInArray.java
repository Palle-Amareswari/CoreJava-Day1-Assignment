package com.sonata;

public class DuplicateValuesInArray {
	public static void main(String arg[]) {
		//Initialize array
		
		int[] myNum = {1,5,6,4,5,8,9,4,1};  
		
		System.out.println("Duplicate Elements in Array:");
		
		// loop for finding duplicates
		
		for(int i = 0; i<myNum.length;i++) {
			for(int j = i+1; j<myNum.length;j++) {
				if(myNum[i] == myNum[j] )
					System.out.println(myNum[j]);
			}
		}
		
		
	}

}
