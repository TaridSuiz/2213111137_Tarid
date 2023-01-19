import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame{
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	public GUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width",SwingConstants.RIGHT);
		lblArea = new JLabel("Enter the area",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Enter the perimeter",SwingConstants.RIGHT);
		//TextField
		/*txtLength = new JTextField("10");
		txtWidth = new JTextField("10");
		txtArea = new JTextField("10");
		txtPerimeter = new JTextField("10");*/
		
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);//add(txtLength);
		add(lblWidth);//add(txtWidth);
		add(lblArea);//add(txtArea);
		add(lblPerimeter);//add(txtPerimeter);

		
	}
	
	
	
	public static void main(String[] args) {
		GUI gui = new GUI();
	}

}
