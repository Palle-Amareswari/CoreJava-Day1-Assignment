package com.sonata;

public class Product {
	int proId ;
	String proName;
	double proPrice;

//Constructor with parameters
	Product(int id, String name, double price){
		this.proId = id;
		this.proName =name;
		this.proPrice =price;
	}
	
	//method to display
	public void display() {
		System.out.println(proId);
		System.out.println(proName);
		System.out.println(proPrice);
	}
	//method to calculate price
	public double totalPrice(double tax) {
		return this.proPrice + tax;
	}
	public static void main(String arg[]) {
		Product p1=new Product(51,"mobile",9999);
		p1.display();
		System.out.println(p1.totalPrice(1000));
	}
}

