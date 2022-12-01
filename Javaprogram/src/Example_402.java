import javax.swing.*;
import java.text.*;
import java.util.*;

public class Example_402 {

	public static void main(String[] args) {

		String Inputmail = JOptionPane.showInputDialog("Input your E-mail : ");
		while (Inputmail.startsWith("@") || Inputmail.contains(" ")) {
			Inputmail = JOptionPane.showInputDialog("Input your E-mail, again : ");

		}
		Inputmail = Inputmail.toLowerCase();
		// if(Inputmail.endsWith("@gmail.com")||Inputmail.endsWith("@hotmail.com")) {
		// JOptionPane.showMessageDialog(null, "Your e-mail is " + Inputmail);
		// }else {
		// JOptionPane.showMessageDialog(null, "Your e-mail is not gamil or gmail dot
		// com" );

		// }

		boolean check = Inputmail.endsWith("@gmail.com") || Inputmail.endsWith("@hotmail.com");

		JOptionPane.showMessageDialog(null,
				check ? "Your e-mail is " + Inputmail : "Your e-mail is not gamil or gmail dot com");

	}

}
