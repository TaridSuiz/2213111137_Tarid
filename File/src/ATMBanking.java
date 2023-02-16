import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class ATMBanking {

	public static void main(String[] args)throws IOException {
		Scanner scn = new Scanner(System.in);
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		DecimalFormat dm = new DecimalFormat("0-000-000-00-0");
		String id;
		String pass;
		int money;
		System.out.print("Enter accout number : ");
		id = scn.next();
		int i = 0;
		boolean chk = false;
		char[] idChk = new char[14];
		while(id.length()<idChk.length ) {
			System.out.print("Input wrong type, Enter account number");
			id = scn.next();
			
			//idChk =  Character.isDigit(id.charAt(i));
		}

	}

}
