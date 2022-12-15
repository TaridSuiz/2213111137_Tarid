import javax.swing.*;
public class Lab606 {

	static boolean check = false;
	public static void main(String[] args) {
		
		int[] nums = {25,78,41,22,36,85,37}; //6
		int indexArr = Integer.parseInt(JOptionPane.showInputDialog("Input index of aray :"));
		while(checkIndex(nums,indexArr))
		{
			indexArr = Integer.parseInt(JOptionPane.showInputDialog("Input index of aray, again :"));

			
		}
		JOptionPane.showMessageDialog(null, "Current data, num"+"["+indexArr+"] is"+currentData(nums,indexArr)+"\n"
				+(prevData(nums,indexArr)!= 0? "Previous data, num"+"["+(indexArr-1)+"] is "+nums[prevData(nums,indexArr)]+"\n" :"No previoux data\n")
				+(nextData(nums,indexArr)!= 0? "Next data, num"+"["+(indexArr+1)+"] is "+nums[nextData(nums,indexArr)] :"No next data"));
		
		
		
	}//main
	
	static boolean checkIndex(int[] nums,int indexArr)
	{
		
			return indexArr < 0 || indexArr > (nums.length-1) ? true: false;
		
		
	}
	
	static int currentData(int[] nums,int indexArr)
	{
	
		return nums[indexArr];
		
	}
	static int prevData(int[] nums,int indexArr)
	{
	
		return indexArr >0 ? indexArr-1 : 0;
		
	}
	static int nextData(int[] nums,int indexArr)
	{
	
		return  indexArr+1 < nums.length ? indexArr+1 : 0;
		
	}
	

}
