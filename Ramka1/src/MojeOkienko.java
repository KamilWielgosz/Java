import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MojeOkienko extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton bPodajDate, bWyjscie;
	JLabel lWyswietlDate;

	public MojeOkienko(){
		setSize(300, 200);
		setTitle("Moje pierwsze okienko");
		setLayout(null);
	    bPodajDate = new JButton("Podaj date");
		bPodajDate.setBounds(50, 50, 100, 20);
		add(bPodajDate);
		bPodajDate.addActionListener(this);
		
		bWyjscie = new JButton("Wyjscie");
		bWyjscie.setBounds(150,50,100,20);
		add(bWyjscie);
		bWyjscie.addActionListener(this);
		
		lWyswietlDate = new JLabel("Data");
		lWyswietlDate.setBounds(50, 100, 200, 20);
		lWyswietlDate.setForeground(Color.BLACK);
		lWyswietlDate.setFont( new Font("Arial", Font.BOLD, 12));
		add(lWyswietlDate);
	}
	
	public static void main(String[] args) {
		MojeOkienko okienko = new MojeOkienko();
		okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienko.setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object zrodlo = e.getSource();
		
		if(zrodlo == bPodajDate){
		  lWyswietlDate.setText(new Date().toString());
		} else if(zrodlo == bWyjscie){
			dispose();
		}
	}

}
