import javax.swing.*;
public class Lab_Example602_2 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean check = false ; 
		String job = JOptionPane.showInputDialog("Enter a department name");
		
		for(int i = 0 ; i< deptName.length;i++)
		{
			if(job.equalsIgnoreCase(deptName[i]))
			{
				check = true;
			}
		}
		
		JOptionPane.showMessageDialog(null, check ? job+" was found in the list":job+" was not found in the list");
		
	}

}
