package week14exam1;
import javax.swing.*;
import java.util.Scanner;

public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		double[] radius = new double[5];
		double[] height = new double[5];
		
		

		for(int i = 0 ; i<radius.length;i++) {
			radius[i] = Double.parseDouble(JOptionPane.showInputDialog("Input radius "+(i+1)));
			height[i] = Double.parseDouble(JOptionPane.showInputDialog("Input height "+(i+1)));
			
		}
		Cylinder[] cylinder = new Cylinder[5];

		for(int i = 0 ; i< cylinder.length;i++) {
			cylinder[i] = new Cylinder(radius[i],height[i]);

			JOptionPane.showMessageDialog(null,"Cylinder "+(i+1)+", volume="+cylinder[i].getVolume());
		}
		JOptionPane.showMessageDialog(null,"Cylinder "+1+", volume="+cylinder[0].getVolume()+"\n"+
				"Cylinder "+2+", volume="+cylinder[1].getVolume()+"\n"+
				"Cylinder "+3+", volume="+cylinder[2].getVolume()+"\n"+
				"Cylinder "+4+", volume="+cylinder[3].getVolume()+"\n"+
				"Cylinder "+5+", volume="+cylinder[4].getVolume()+"\n");


	}

}
