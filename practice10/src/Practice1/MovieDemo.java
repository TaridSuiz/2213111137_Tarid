package Practice1;
import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	
	System.out.print("Input movie id   : ");
	String mvID = scn.nextLine();
	System.out.print("Input movie name : ");
	String mvName = scn.nextLine();
	System.out.println();
	
	System.out.print("Input Director name   : ");
	String direcName = scn.nextLine();
	System.out.print("Input Director e-mail : ");
	String direcMail = scn.nextLine();
	System.out.print("Input Director gender : ");
	char gd = scn.next().charAt(0);
	while(gd != 'm' && gd !='M' && gd!='f' &&gd != 'F') {
		
			
		System.out.print("Input Director gender, again : ");
		gd = scn.next().charAt(0);
	}
	System.out.println();
	System.out.print("Input movie theater no.  : ");
	int thNo = scn.nextInt();
	while(thNo <1 || thNo > 15) {
	System.out.print("Please input 1 - 15 only :");
	thNo = scn.nextInt();
		
	}
	Director director = new Director(direcName,direcMail,gd);
	Theater theater = new Theater(mvID,mvName,director,thNo);
	
	System.out.println();
	System.out.println(theater);

	
	}

}
