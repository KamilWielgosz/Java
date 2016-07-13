import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CelsiusToFahrenheit extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lCelsius, lFahrenheit;
	private JTextField tCelsius, tFahrenheit;
	private JButton bKonwertuj;
	private JCheckBox chWielkie;
	
	private Double tempCelsius, tempFahrenheit;
	
	public CelsiusToFahrenheit(){
		
		setSize(400,300);
		setTitle("Konwersja stopni Celsiusza na Fahrenheita");
		setLayout(null);
		
		lCelsius = new JLabel("Stopnie Celsiusa: ");
		lCelsius.setBounds(20, 20, 150, 20);
		add(lCelsius);
		
		tCelsius = new JTextField("");
		tCelsius.setBounds(180, 20, 100, 20);
		add(tCelsius);
		tCelsius.addActionListener(this);
		
		lFahrenheit = new JLabel("Stopnie Fahrenheita: ");
		lFahrenheit.setBounds(20, 50, 150, 20);
		add(lFahrenheit);
		
		tFahrenheit = new JTextField("");
		tFahrenheit.setBounds(180, 50, 100, 20);
		tFahrenheit.setEditable(false);
		add(tFahrenheit);
		
		bKonwertuj = new JButton("Konwertuj");
		bKonwertuj.setBounds(100, 90, 100, 20);
		add(bKonwertuj);
		
		bKonwertuj.addActionListener(this);
		

		chWielkie = new JCheckBox("Wielkie litery");
		chWielkie.setBounds(200, 90, 150, 20);
		add(chWielkie);
		chWielkie.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object zrodlo = e.getSource();
		
		if(zrodlo == bKonwertuj || zrodlo == tCelsius){
		tempCelsius = Double.parseDouble(tCelsius.getText());
		tempFahrenheit = 35.0 + ((9.0/5.0) * tempCelsius);
		tFahrenheit.setText(String.valueOf(tempFahrenheit));
		} else if(zrodlo == chWielkie){
			if(chWielkie.isSelected() == true){
				tFahrenheit.setFont( new Font("Arial", Font.BOLD, 18));
			} else {
				tFahrenheit.setFont( new Font("Arial", Font.PLAIN, 12));
			}
		}
	}

	public static void main(String[] args) {
		CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}

}
