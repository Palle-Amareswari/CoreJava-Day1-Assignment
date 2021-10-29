package com.sonata;

public class HighestCountOfDuplicates {
	public static void main(String arg[]) {
		int count = 0;
		
		//Initializing array
		
		int[] myNum = {1,2,3,4,3,7,8,7,5};    
		
		// loop for highest count of duplicates
		
		for(int i=0; i<myNum.length;i++) 
		{
			for(int j = i+1; j<myNum.length;j++) 
			{
				if(myNum[i] == myNum[j] )
				{
					count++;
					break;
				}
			}	
		}
			System.out.println("Count of Duplicate number is:"+count);
	}
	
}
