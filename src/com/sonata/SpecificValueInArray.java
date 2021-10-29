package com.sonata;

public class SpecificValueInArray {
	public static void main(String arg[]) {
		
		//initializing array
		int[] num = {5,4,7,1,6,2,8,9};
		int se = 5;
		for(int i =0; i<num.length; i++) {
			if(se==num[i]) //conditon for finding specific element
			{
				System.out.println("Specific value is found and the element is:"+num[i]);
			    }
	
     	}
    }

}