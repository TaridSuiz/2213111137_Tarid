package ex10;

public class Date {
	private int dMont;
	private int dDay;
	private int dYear;
	
	public Date() {
		this.dMont=1;
		this.dDay=1;
		this.dYear=1900;
	}
	public Date(int mont ,int day,int year) {
		setDate(mont,day,year);
	}
	
	public void setDate(int mont ,int day,int year) {
		dMont=mont;
		dDay=day;
		dYear=year;
	}
	public int getMont() {
		return dMont;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		
		
		return dMont+"-"+dDay+"-"+dYear;
	}
	
	
}
