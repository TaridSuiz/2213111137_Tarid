import java.util.*;
import java.text.*;
public class Lab_Example603 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] num = new int[5];
		for(int i = 0 ; i< num.length;i++)
		{
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = scn.nextInt();
		}
		
		System.out.print("\nSummation of positive number is "+sumOfPos(num));
		
	}
	static int sumOfPos(int[] num)
	{
		int sum = 0;
		for(int i =0;i<num.length;i++)
		{
			sum+=num[i];
		}
		return sum;
	}

}
