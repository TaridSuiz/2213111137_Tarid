import javax.swing.*;
import java.text.*;
import java.util.*;

public class Example_403 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String input = "";
		/*
		 * System.out.print("Input a sentence :"); input = scn.nextLine();
		 * 
		 * while(!input.endsWith(".")) { System.out.print("Input a sentence, again :");
		 * input = scn.nextLine(); }
		 * 
		 * System.out.println(); int space = 0; int word = 0; for(int i = 0 ; i <
		 * input.length() ; i++) { if(input.charAt(i)==' ') { space++; }
		 * 
		 * } word = space+1;
		 * 
		 * System.out.println("this sentence has "+space+" spacebar");
		 * System.out.println("this sentence has "+word+" word");
		 */

		input = JOptionPane.showInputDialog("Input a sentence :");

		while (!input.endsWith(".")) {
			input = JOptionPane.showInputDialog("Input a sentence, again :");

		}

		int space = 0;
		int word = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				space++;
			}

		}
		word = space + 1;

		JOptionPane.showMessageDialog(null,
				"this sentence has " + space + " spacebar\n" + "this sentence has " + word + " word");

	}

}
