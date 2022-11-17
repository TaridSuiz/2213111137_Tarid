package lab01;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input two integers(a b) :");
		int a = scan.nextInt(), b= scan.nextInt();
		int count=0;
		int sum = a+b;
		System.out.print("Sum of two integer : "+sum);
		while (sum != 0 )
		{
			sum /=10;
			count++;
		}
		System.out.print("Digit number of sum of said two integer : "+count);
		
	}

}
