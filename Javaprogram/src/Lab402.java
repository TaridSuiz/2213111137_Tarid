import javax.swing.*;
import java.text.*;
import java.util.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputSentence = "" ;
		System.out.print("Input some sentence : ");
		inputSentence = sc.nextLine();
		while (!inputSentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			inputSentence = sc.nextLine();
			
		}
		System.out.println();
		for (int i = 0 ; i < inputSentence.length() ; i++) {
			
			if(inputSentence.charAt(i) != ' ') {
				System.out.print(inputSentence.charAt(i));
				
				
			}
			else {
				System.out.println();
			}
			
			
		}
		
	}

}
