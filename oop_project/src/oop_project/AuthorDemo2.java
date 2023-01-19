package oop_project;
import java.util.*;
public class AuthorDemo2 {

	public static void main(String[] args) {
		Author[] author =new Author[4];
		Line l = new Line();
		Scanner scn = new Scanner(System.in);
		
		
		for(int i=0;i<author.length;i++) {
			
			System.out.println("Information Author "+(i+1));
			l.line();
			System.out.print("Input author name :");
			String name = scn.nextLine();
			System.out.print("Input author e-mail :");
			String email = scn.nextLine();
			author[i] = new Author(name,email);
			l.line();
		}// for input
		System.out.println();
		for(int i=0;i<author.length;i++) {
			System.out.printf("%d. %s (%s) \n",(i+1),author[i].getName(),author[i].getEmail());
		}//out author
		
		
		
	}

}
