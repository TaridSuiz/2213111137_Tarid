import javax.swing.*;
public class Lab_ex2Method {

	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double Iprice = 0;
	static boolean check = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputItem();
		
		
	}
	public static void inputItem()
	{
		int itemOrder = Integer.parseInt(JOptionPane.showInputDialog("Enter item number to order"));
		//check = checker(itemOrder);
		System.out.print(checker(itemOrder)? "Item "+itemOrder+" Is "+Iprice:"Invalid Item");
	}
	public static boolean checker(int order)
	{
		for(int i = 0 ; i<validValues.length;i++)
		{
			if(order == validValues[i])
			{
				Iprice = price[i];
				check = true;
			}
		}
		return check;
	}

}
