package oop_project;

public class Time {
	private int second ;
	private int minute ;
	private int hour ;
	
	
	
	public  Time() {
		//
		this.second=0;
		this.minute=0;
		this.hour=0;
		
		//second = minute = hour =0;
	}
	public  Time(int hour ,int minute ,int second) {
		
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour=hour;
		
	}
	public void setMinute(int minute) {
		this.minute=minute;
		
	}
	public void setSecond(int second) {
		this.second=second;
		
	}
	public String toString() {
		//use build in function String.format() to format
		
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	public void setTime(int hour ,int minute ,int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public Time nextSecond() {
		
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute =0;
				++hour;
				if(hour>=24) {
					hour = 0;
					
				}//end hour
			}//end minute
		}//end second
		return this ; //return instance,to chaining operations
		
	}//end second

}
