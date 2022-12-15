import java.util.*;
import java.text.*;
public class Lab602 {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0 ;
		double[] score = new double[5];
		DecimalFormat frm = new DecimalFormat("#.00");
		
		
		for (int i = 0 ; i<score.length;i++)
		{
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scn.nextDouble();
			total += score[i];
		}
		double average = total / score.length;
		System.out.print("Average of "+score.length+" student is "+frm.format(average));
		
		System.out.println("\n");
		for(int i = 0 ; i<score.length;i++)
		{
			if(score[i]>=average)
			{
				System.out.print("> Student "+(i+1)+ " ("+frm.format(score[i])+")\n");
			}
		}
		
	}

}
