package oop_project;

import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishyear;
	public void setTitle(String title) {
	this.title=title;	
	}// end title
	public void setPrice(float price) {
		this.price=price;
	}//end price
	public void setPublishyear(int year) {
		this.publishyear=year;
	}//end pulishyear
	
	public String getTitle() {
		return title;
	}
	public float getPrice() {
		return price;
	}
	public int getPublishyear() {
		return publishyear;
	}
	
	
	public int getTotalYear() {
		
		return  Year.now().getValue()-publishyear;
	}
	
	public String toString() {
		return String.format("Title: %s pulished for %d year (%.2f bath)",title,getTotalYear(),price);
		
	}

}
