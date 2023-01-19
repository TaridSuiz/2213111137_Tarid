import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class TempConversion extends JFrame{
	//Component
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;
	private TextField tfCelsius;
	private TextField tfFahrenheit;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0/9.0;
	private static final double CTOF = 9.0/5.0;
	private static final int OFFSET = 32;

	
	public TempConversion() {
		
		Container C = getContentPane();
		C.setLayout(new GridLayout(1,4));
		
		setTitle("Conversion Temperature");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		lblCelsius = new JLabel("Temp in Celcius",SwingConstants.RIGHT);
		lblFahrenheit = new JLabel("Temp in Fahrenheit",SwingConstants.RIGHT);
		
		tfCelsius = new TextField(10);
		tfFahrenheit = new TextField(10);

		C.add(lblCelsius);
		C.add(tfCelsius);
		C.add(lblFahrenheit);
		C.add(tfFahrenheit);
		
		CelsHandler celsiusHandler = new CelsHandler();
		tfCelsius.addActionListener(celsiusHandler);
		FahrenheitHandler fahrenheitHandler = new FahrenheitHandler();
		tfFahrenheit.addActionListener(fahrenheitHandler);
		
	}
	private class FahrenheitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			fahrenheit = Double.parseDouble(tfFahrenheit.getText());
			celsius = (fahrenheit - OFFSET)*FTOC;
			tfCelsius.setText(String.format("%.2f",celsius));
			
		}
	}
	
	
	private class CelsHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius,fahrenheit;
			celsius = Double.parseDouble(tfCelsius.getText());
			fahrenheit = celsius * CTOF+OFFSET;
			tfFahrenheit.setText(String.format("%.2f",fahrenheit));
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConversion tempComv = new TempConversion();
	}

}
