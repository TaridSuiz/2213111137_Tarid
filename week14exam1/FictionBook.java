package week14exam1;

public class FictionBook implements Author,Book {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	public FictionBook(String title,int publicYear) {
		this.title=title;
		this.publicYear=publicYear;
	}
	
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getFirstName() {
		return FirstName.toUpperCase();
	}
	public boolean checkFormatName() {
		if(author_name == null) {
			return false;
			
		}
	}
	
	
	
	
	
	public String toString() {
		return getTitle()+"write by "+getLastName().charAt(0)+"."+getFirstName()
		+"("+email+") \nPublished for "+publicYear+" years.";
	}

}
