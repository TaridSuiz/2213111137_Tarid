import javax.swing.*;
import java.text.*;
import java.util.*;

public class Lab309 {

	static final int SALARY_CEILING = 6000;
	static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
	static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
	
	static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
	static final double EMPLOYER_RATE_55_TO_60 = 0.13;
	
	static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
	static final double EMPLOYER_RATE_60_TO_65 = 0.09;
	
	static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
	static final double EMPLOYER_RATE_65_ABOVE = 0.075;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary, age; // to be input
		int contributableSalary;
		double employeeContribution, 
		employerContribution, 
		totalContribution;
		DecimalFormat frm = new DecimalFormat(".00");
		salary = Integer.parseInt(JOptionPane.showInputDialog("Enter the mothly salary: $"));
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age:"));

		
		
		
		if (age <= 55) { // 55 and below
			if(salary >6000)
			{
				employeeContribution = SALARY_CEILING*EMPLOYEE_RATE_55_AND_BELOW;
				employerContribution = SALARY_CEILING*EMPLOYER_RATE_55_AND_BELOW;
			}
			else {
			employeeContribution = (double)salary*EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary*EMPLOYER_RATE_55_AND_BELOW;
			}
			} 
		else if (age <= 60) { // (60, 65]
			if(salary >6000)
			{
				employeeContribution = SALARY_CEILING*EMPLOYEE_RATE_55_TO_60;
				employerContribution = SALARY_CEILING*EMPLOYER_RATE_55_TO_60;
			}
			else {
			employeeContribution = salary*EMPLOYEE_RATE_55_TO_60;
			employerContribution = salary*EMPLOYER_RATE_55_TO_60;
			} }
		else if (age <= 65) { // (55, 60]
			if(salary >6000)
			{
				employeeContribution = SALARY_CEILING*EMPLOYEE_RATE_60_TO_65;
				employerContribution = SALARY_CEILING*EMPLOYER_RATE_60_TO_65;
			}
			else {
			employeeContribution = salary*EMPLOYEE_RATE_60_TO_65;
			employerContribution = salary*EMPLOYER_RATE_60_TO_65;
			} }
		else { // above 65
			if(salary >6000)
			{
				employeeContribution = SALARY_CEILING*EMPLOYEE_RATE_65_ABOVE;
				employerContribution = SALARY_CEILING*EMPLOYER_RATE_65_ABOVE;
			}else {
			employeeContribution = salary*EMPLOYEE_RATE_65_ABOVE;
			employerContribution = salary*EMPLOYER_RATE_65_ABOVE;
			}}
		
			JOptionPane.showMessageDialog(null, "The employee's contribution is: $"+frm.format(employeeContribution)
			+"\nThe employer's contribution is: $"+frm.format(employerContribution)
			+"\nThe total contribution is: $"+frm.format(employeeContribution+employerContribution),"PensionContributionCalculator",JOptionPane.INFORMATION_MESSAGE);
			
			
			
			
	}

}
