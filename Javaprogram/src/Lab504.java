import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter your name, separated by a space. :");
		String fullname = scn.nextLine();
		String firstName = abbreviatName(fullname);
		System.out.print(firstName);
		
		
	}
	static String abbreviatName(String fullname) {
		
		String name = fullname;
		String firstname = "";
		String lastname = ""  ;
		String m = "", l = "";
		String fullName;
		int count,count2;
		for(int i = 0 ; i<name.length();i++)
		{
			if (name.charAt(i) == ' ')
			{
				
				firstname = name.substring(0,i);
				lastname = name.substring(i,name.length());
				break;
			}
			
				
		}
		
		for(int i = 0 ; i<lastname.length();i++)
		{
			if (lastname.charAt(i) == ' ')
			{
				
				m = lastname.substring(0,i);
				l = lastname.substring(i,lastname.length());
			}
			
				
		}
		m.toUpperCase();
		l.toUpperCase();
		fullName = m.charAt(1)+"."+l.charAt(1)+"."+firstname;
		
		
		

		
		return fullName;
	}

}
