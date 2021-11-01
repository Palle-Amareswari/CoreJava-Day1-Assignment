package com.sonata;

public class MyOwnAutoShop {
	MyOwnAutoShop(int Speed, double regularPrice, String Color, int Length){
		super();
	}
	
	MyOwnAutoShop(int Speed, double regularPrice, String Color, int Year, int manfactureDiscount){
		super();
	}
	
	MyOwnAutoShop(int Speed, double regularPrice, String Color){
		super();
	}
	
	public static void main(String[] args) {
		
		   Sedan s1=new Sedan(250,800000.00,"red",45);
		   System.out.println("SalePrice in Sedan is : "+s1.getSalePrice());
		   System.out.println("\n");
		   
		   Ford f1=new Ford(200,900000.00,"green",2019,5000);
		   System.out.println("SalePrice in Ford1 is : "+f1.getSalePrice());
		   System.out.println("\n");
		   
		   Ford f2=new Ford(220,1000000.00,"white",2021,9000);
		   System.out.println("SalePrice in Ford2 is : "+f2.getSalePrice());
		   System.out.println("\n");
		   
		   Car c1=new Car(180,600000.00,"blue");
		   System.out.println("SalePrice in Car is : "+c1.getSalePrice());
		   System.out.println("\n");
		}
	}

	    class Car{
	    	int speed;
	    	double regularPrice;
	        String color;
	        Car(int speed,double regularPrice,String color){
	        	this.speed=speed;
	            this.regularPrice=regularPrice;
	            this.color=color;
	    }
	    public double getSalePrice(){
	        return this.regularPrice;
	    }
	}

	    class Truck extends Car{
	    	int Weight;
	        Truck(int Speed, double regularPrice,String Color,int Weight)
	    {
	        super(Speed,regularPrice,Color);
	        this.Weight=Weight;
	    }
	    public double getSalePrice()
	    {
	        if(Weight>2000)
	        {
	        	return super.getSalePrice()-(0.1*super.getSalePrice());
	        }
	        else {
	        	return super.getSalePrice()-(0.2*super.getSalePrice());
	        }
	        
	    }
	}

        class Ford extends Car{
	    int Year;
	    int manfactureDiscount;
	    Ford(int Speed, double regularPrice,String Color,int Year,int manfactureDiscount ){
	        super(Speed,regularPrice,Color);
	        this.Year=Year;
	        this.manfactureDiscount = manfactureDiscount;
	    }
	    public double getSalePrice(){
	    	return super.getSalePrice()-manfactureDiscount;
	    }
	}

	    class Sedan extends Car{
	    int Length;
	    Sedan(int Speed, double regularPrice,String Color,int Length){
	        super(Speed,regularPrice,Color);
	        this.Length=Length;
	    }
	    public double getSalePrice(){
	    	if(Length>20) {
				return super.getSalePrice()-(0.05*super.getSalePrice());
			}
			else {
				return super.getSalePrice()-(0.1*super.getSalePrice());
			}
	}
 }

