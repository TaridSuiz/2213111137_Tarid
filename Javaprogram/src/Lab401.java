import javax.swing.*;
import java.text.*;
import java.util.*;

public class Lab401 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count;
		String fullName = "", firstName = "", lastName = "";
		System.out.print("Full name : ");
		fullName = sc.nextLine();
		
		if (!fullName.contains(" ")) {
			System.out.println("Incorrect Name");
		} 
		

		else {
			count = fullName.indexOf(' ');
			firstName = fullName.substring(0,count);
			lastName = fullName.substring(count,fullName.length());
			System.out.println("First name : "+firstName.toUpperCase());
			System.out.println("Last name : "+lastName.toLowerCase());
		}

	}
}
