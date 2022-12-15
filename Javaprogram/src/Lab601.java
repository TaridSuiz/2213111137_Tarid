import java.util.*;
import java.text.*;
public class Lab601 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int count = 0 ;
		 
		int[] num = new int[7];
		for(int i = 0 ;i <num.length;i++)
		{
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = scn.nextInt();
		}
		
		for(int i = 0 ; i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				count++;
			}
		}
		
		
		
	}

}
