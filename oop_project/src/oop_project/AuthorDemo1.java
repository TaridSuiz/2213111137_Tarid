package oop_project;
import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name , email;
		char gender;
		System.out.print("Input author name   : ");
		name = scn.nextLine();
		System.out.print("Input author e-mail : ");
		email = scn.nextLine();
		System.out.print("Input author gender : ");
		gender = scn.next().charAt(0);
		Author author = new Author(name,email,gender);
		System.out.println();
		System.out.print(author);
	}

}
