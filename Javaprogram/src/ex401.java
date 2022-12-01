import javax.swing.*;
import java.text.*;
import java.util.*;


public class ex401 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word= "";
		String txtword= "";
		while (true){
			
			System.out.print("Enter Word : ");
			word = scn.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
				
			}
			txtword = txtword + word + " ";
			
		}
		
		System.out.println(txtword.toUpperCase());
		
		
		
	}

}
