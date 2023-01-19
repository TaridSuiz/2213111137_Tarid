package oop_project;

public class Author {
	public String name;
	public String email;
	public char gender;
	
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
		
	}
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
		this.gender=' ';
		
	}
	public Author() {
		this.name=" ";
		this.email=" ";
		this.gender=' ';
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGenderName() {
		if(this.gender == 'm' || this.gender == 'M') {
			return "Male";
		}
		else if(this.gender == 'f' || this.gender == 'F') {
			return "Female";
		}
		else 
			return null;
	}
	public String toString() {
		return String.format("Author name: %s (%s;%s)",name,email,getGenderName());
	}

}
