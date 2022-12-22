package oop_project;

public class Product {
	private String id;
	private int unit;
	private double price;
	
	public void setId(String ID) {
		
		id = ID ;
	}
	
	public String getID() {
		return id;
		
	}
	
	
	public void setUnit(int UNIT) {
		unit = UNIT;
		
	}
	
	public int getUnit() {
		return unit;
	}
	
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	
	public double getPrice() {
		return price;
		
	}
	
	public double calculate() {
		return price*unit;
	}
	
	public boolean status(int unit) {
		return unit >=50 ? true : (unit >=5 ? true : false);
		
		
	}
	
}
