package com.sonata;

public class GreatestNumberDisplay {
	public static void main(String arg[]) {
		
		//Initializing array
		
		int x=12, y=25, z=89;
		if(x>=y && x>=z) {  //condition for checking the greatest number
			System.out.println("x is greater than y and z");
		}
		else if(y>=z && y>=x){
			System.out.println("y is greater than x and z");
		}
		else {
			System.out.println("z is greater than x and y");
		}

	}

}
