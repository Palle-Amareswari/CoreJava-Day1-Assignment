package com.sonata;

public class Student {
	int stdID;
	String stdName;
	String stdClass;
	
	//method to display
	
	public void display() {
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
        	
	}
	
	public static void main(String arg[]) {
		Student s1 = new Student(); // object
		s1.stdID = 549;
		s1.stdName = "chinna";
		s1.stdClass = "Tenth";
		s1.display();
		
		Student s2 = new Student(); // object
		s2.stdID = 509;
		s2.stdName = "Bujji";
		s2.stdClass = "Tenth";
		s2.display();
	}

}
