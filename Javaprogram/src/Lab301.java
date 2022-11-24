import javax.swing.*;
import java.text.*;
import java.util.*;
public class Lab301 {
	static final int pricePerson = 299;

	public static void main(String[] args) {
		int numcus = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		 DecimalFormat frm = new DecimalFormat("#,###.00");
		double totalPrice = numcus * pricePerson;
		int member;

		do {
			member = JOptionPane.showConfirmDialog(null,
					"Total Price is " + frm.format(totalPrice) + "baht." + "\nDo you have a member card ?");
		} while (member == 2);

		if (member == 0) {
			frm.format(totalPrice = totalPrice * 90 / 100);
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + "Baht");

		} else if (member == 1) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + "Baht");
		}
		

	}

}
