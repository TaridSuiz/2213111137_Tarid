
import javax.swing.*;

public class lab502 {

	static String email;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail();

	}

	public static void inputEmail() {

		email = JOptionPane.showInputDialog("Input your e-mail");

		while (checkEmail(email) == true) {
			email = JOptionPane.showInputDialog("Input your e-mail, again ");

		}
	}

	public static boolean checkEmail(String email) {
		if (email.startsWith("@") || email.contains(" ")) {
			return true;
		} else {
			return false;
		}

	}

}
