import javax.swing.*;
import java.text.*;
import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int bank1000,bank500,bank100,bank01,bank02,bank03;
		
		
		int B_lance = Integer.parseInt(JOptionPane.showInputDialog("Your balance :"+frm.format(balance)
				+"\nInput monney to whitdraw"));
		
		bank1000 = B_lance /1000; // จพนวนแบงค์
		bank01 = B_lance % 1000; // เงินที่เหลือ
		
		bank500 = bank01 /500;
		bank02 = bank01%500;
		
		bank100= bank02/100;
		bank03 = bank02 %100;
		
		if(B_lance > balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(B_lance >= 20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else if(bank03!=0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withraw "+B_lance+" Baht","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
		JOptionPane.showMessageDialog(null, "You withdraw"+frm.format(B_lance)+
				"\n1,000 = "+bank1000+"\n500 = "+bank500+"\n100 = "+bank100);
		}
	}

}
