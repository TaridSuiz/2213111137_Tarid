import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read data(from file)?:");
		choice = scn.next().toLowerCase();
		while(!choice.equals("insert")&&!choice.equals("read")) {
			System.out.print("Please text insert or read data :");
			choice = scn.next().toLowerCase();
			
		}
		
		SaveandOpen file = new SaveandOpen();
		if(choice.equals("insert")) {
			file.insert();
		}
		else if (choice.equals("read")) {
			System.out.print("\nEnter department: ");
			department = scn.next();
			file.setDept(department);
			file.read();
		}
	}

}
