package ex10;

public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	public PersonalInfo() {
		name=new Person();
		bDay=new Date();
		personID=0;
	}
	
	public PersonalInfo(String first,String last,int mont , int day
			,int year , int id) {
		name = new Person(first,last);
		bDay = new Date(mont,day,year);
		personID = id;
		
	}
	public void setPersonalInfo(String first,String last,int mont , int day
			,int year , int id) {
//		name = new Person(first,last);
//		bDay = new Date(mont,day,year);
		name.setName(first,last);
		bDay.setDate(mont,day,year);
		personID = id;
	}
	public String toString() {
		return "name : "+name+"\nDate : "
				+bDay+"\nPersonal ID : "+personID;
	}
	
}
