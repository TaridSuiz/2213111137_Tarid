package oop_project;

public class Video {
	private String Title;
	private Boolean checkOut = false;
	private double averageRating;
	private int ratingSum = 0;
	private int ratingCount = 0;
	
	public void setTitle(String iTitle) {
		Title = iTitle;
	}
	public String getTitle() {
		return Title;
	}
	public void addRating(int rate) {
		ratingSum+=rate;
		ratingCount+=1;
		averageRating = ratingSum/ratingCount;
	}
	public double getRating() {
		return averageRating;
	}

	public void checkOut() {
		checkOut = true;
	}
	public void returnToStore() {
		checkOut = false;
	}
	
	public Boolean isCheckedOut() {
		return checkOut;
	}
	
	
}
