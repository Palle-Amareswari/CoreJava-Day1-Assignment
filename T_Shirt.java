package com.sonata;

public class T_Shirt {
	
	String Material;
	String Color;
	String Design;
	
	//default constructor
	T_Shirt(){ }
	
	//constructor with parameters
	T_Shirt(String a, String b, String c){
		this.Material=a;
		this.Color=b;
		this.Design=c;
	}
	
	public String smallSize() {
		return smallSize();
	}
	
	public String largeSize() {
		return largeSize();
	}
	
	public String xtraLarge() {
		return xtraLarge();
	}
	
	// method to display
		public void display() {
		System.out.println(Material);
		System.out.println(Color);
		System.out.println(Design);
		
	}
	public static void main(String arg[]) {
		T_Shirt t1 = new T_Shirt("xtraLarge:\n"+ "cotton","green","print personalized");
		t1.display();
		System.out.println("\n");
	    
	    T_Shirt t2 = new T_Shirt("smallSize:\n" + "rayon","blue","design cafe");
		t2.display();
		System.out.println("\n");
		
		T_Shirt t3 = new T_Shirt("largeSize:\n" + "silk","pink","toll design");
		t3.display();
		
		}

}
