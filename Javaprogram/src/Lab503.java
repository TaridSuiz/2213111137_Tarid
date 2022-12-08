import javax.swing.*;
public class Lab503 {

	static int year;
	static final int midyear = 1000;
	static final int maxyear = 3000;
	public static void main(String[] args) {
		
		year = Integer.parseInt(JOptionPane.showInputDialog("Input year")) ;
		chcleYear(year);
		
		chkYear(year);
		
		System.out.print(chcleYear(year));
		System.out.println();
		System.out.print(chkYear(year));
		
		

	}
	
	static boolean chcleYear(int year) {
		if ((year % 4 == 0) && ((year%100 != 0) || (year % 400 == 0)))
		{
			return true ;
		}
		return false;
	}
	static boolean chkYear(int year)
	{
		if (year >= 1000 || year<= 3000)
			return true;
		else
			return false;
	}

}
