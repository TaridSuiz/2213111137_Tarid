package week14exam1;
import java.util.*;
import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input width = ");
		double width = scn.nextDouble();
		System.out.print("Input length = ");
		double length = scn.nextDouble();
		System.out.print("Input color =");
		String color = scn.nextLine();
		
		Rectangle rec = new Rectangle(width,length,color);
		System.out.println(rec);
		
		
		double wd = Double.parseDouble(JOptionPane.showInputDialog("input width"));
		double lg = Double.parseDouble(JOptionPane.showInputDialog("input length"));
		String cl = JOptionPane.showInputDialog("Input colot");
		JOptionPane.showMessageDialog(null,rec + "Rectangle of"+rec.getArea());


	}

}
