package com.sonata;

public class SumOfArray {
	public static void main(String arg[]) {
		int[] MyNum = {1, 2, 3, 4, 5, 6};
		int Sum = 0;
		for(int i=0;i<MyNum.length;i++) {
			Sum = Sum + MyNum[i]; 
		}
			System.out.println("The Sum of given all elements in array:" +Sum);
		}
		
	}


