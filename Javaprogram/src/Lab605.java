import javax.swing.*;
public class Lab605 {
	
 	
	static String EVE = " ";
	static String ODD = " ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[5];
		
		
		
		for(int i = 0 ; i < nums.length;i++)
		{
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number : "+(i+1)));
		}
		
		showEven(nums);
		showOdd(nums);
		
	}
	
	
	static void showEven(int[] nums)
	{
		
		for(int i = 0 ; i< nums.length; i++)
		{
			if(nums[i]%2==0)
			{
				EVE += nums[i] + " " ; 
			}
		}
		JOptionPane.showMessageDialog(null, "List of Even number : \n"+EVE);
	}
	static void showOdd(int[] nums)
	{
		for(int i = 0 ; i< nums.length; i++)
		{
			if(nums[i]%2!=0)
			{
				ODD += nums[i] + " " ; 			}
		}
		JOptionPane.showMessageDialog(null, "List of Odd number : \n"+ODD);
	}

}
