package ex10;
import java.util.*;
public class BookDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input author name : ");
		String auName = scn.nextLine();
		System.out.print("Input author e-mail : ");
		String auEmail = scn.nextLine();
		Author1 author = new Author1(auName,auEmail);
		System.out.println();
		
		System.out.print("Input book title : ");
		String bookTile = scn.nextLine();
		System.out.print("Input book page : ");
		int bookPage = scn.nextInt();
		System.out.println();
		Book1 book = new Book1(bookTile,author,bookPage);
		System.out.println(book);
	}

}
