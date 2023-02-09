package week14exam1;
import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Input title ");
		String title = scn.nextLine();
		System.out.print("Input year of book ");
		int year = scn.nextInt();
		
		FictionBook book = new FictionBook(title , year);
		
		System.out.print("Input author name ");
		String name = scn.nextLine();
		System.out.print("Input author email ");
		String email = scn.nextLine();
		book.setAuthorName(name);
		book.setEmail(email);
		
		System.out.print(book);
	}

}
