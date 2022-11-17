package lab01;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class ex04 {

	public static void main(String[] args) {
		String cdId = "";
		String cdTitle = "";
		int cdQuantity;
		double cdPrice;
		double cdSubtotal;
		double cdTotal;
		final double TAX_RATE = .0625;
		DecimalFormat frm=new DecimalFormat("0.00");
		cdId = JOptionPane.showInputDialog("This program calculates the total cost of CD order \nPlease enter the ID of the CD");
		cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
		cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		cdQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		cdSubtotal = cdPrice*cdQuantity;
		cdTotal = cdSubtotal*(1 + TAX_RATE);
		JOptionPane.showMessageDialog(null, "Summary pf the transaction:"
				+ "\n\n"+"CD ID:"+cdId+"\nCD Title:"+cdTitle+"\n"
						+ "CD Unit Price:$"+cdPrice+"\n"
								+ "CD Quantity:"+cdQuantity+"\n\n"
								+ "Subtotal:$"+cdSubtotal+"\n"
								+ "Tax rate:6.25%\n"
								+ "Total:$"+cdTotal
								+ "\n\nEnd of Program");
	}

}
