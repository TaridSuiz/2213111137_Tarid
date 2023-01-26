package ex10;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
		this.firstName = "";
		this.lastName = "" ;
	}
	public Person(String firstName , String lastName) {
		setName(firstName,lastName);
	}
	public void setName(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return firstName+lastName;
	}
}
