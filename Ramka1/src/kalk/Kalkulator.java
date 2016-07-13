package kalk;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Kalkulator extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton bLiczba0, bLiczba1, bLiczba2, bLiczba3, bLiczba4, bLiczba5, bLiczba6, bLiczba7, bLiczba8, bLiczba9;
	private JButton bPlus, bMinus, bMnozenie, bDzielenie, bPierwiastek;
	private JButton bCzysc, bRownaSie;
	private JTextField tWynik;
	
	private String wyrazenie = new String();
	
	public Kalkulator(){
		
		setSize(400,300);
		setTitle("Kalkulator");
		getContentPane().setLayout(null);
		
		bLiczba0 = new JButton("0");
		bLiczba0.setBounds(20, 200, 120, 30);
		getContentPane().add(bLiczba0);
		bLiczba0.addActionListener(this);
		
		bLiczba1 = new JButton("1");
		bLiczba1.setBounds(20, 170, 60, 30);
		getContentPane().add(bLiczba1);
		bLiczba1.addActionListener(this);
		
		bLiczba2 = new JButton("2");
		bLiczba2.setBounds(80, 170, 60, 30);
		getContentPane().add(bLiczba2);
		bLiczba2.addActionListener(this);
		
		bLiczba3 = new JButton("3");
		bLiczba3.setBounds(140, 170, 60, 30);
		getContentPane().add(bLiczba3);
		bLiczba3.addActionListener(this);
		
		bLiczba4 = new JButton("4");
		bLiczba4.setBounds(20, 140, 60, 30);
		getContentPane().add(bLiczba4);
		bLiczba4.addActionListener(this);
		
		bLiczba5 = new JButton("5");
		bLiczba5.setBounds(80, 140, 60, 30);
		getContentPane().add(bLiczba5);
		bLiczba5.addActionListener(this);
		
		bLiczba6 = new JButton("6");
		bLiczba6.setBounds(140, 140, 60, 30);
		getContentPane().add(bLiczba6);
		bLiczba6.addActionListener(this);
		
		bLiczba7 = new JButton("7");
		bLiczba7.setBounds(20, 110, 60, 30);
		getContentPane().add(bLiczba7);
		bLiczba7.addActionListener(this);
		
		bLiczba8 = new JButton("8");
		bLiczba8.setBounds(80, 110, 60, 30);
		getContentPane().add(bLiczba8);
		bLiczba8.addActionListener(this);
		
		bLiczba9 = new JButton("9");
		bLiczba9.setBounds(140, 110, 60, 30);
		getContentPane().add(bLiczba9);
		bLiczba9.addActionListener(this);
		
		bPlus = new JButton("+");
		bPlus.setBounds(140, 200, 60, 30);
		getContentPane().add(bPlus);
		bPlus.addActionListener(this);
		
		bMinus = new JButton("-");
		bMinus.setBounds(200, 200, 60, 30);
		getContentPane().add(bMinus);
		bMinus.addActionListener(this);
		
		bMnozenie = new JButton("*");
		bMnozenie.setBounds(200, 170, 60, 30);
		getContentPane().add(bMnozenie);
		bMnozenie.addActionListener(this);
		
		bDzielenie = new JButton("/");
		bDzielenie.setBounds(200, 140, 60, 30);
		getContentPane().add(bDzielenie);
		bDzielenie.addActionListener(this);
		
		bPierwiastek = new JButton("sqrt");
		bPierwiastek.setBounds(200, 110, 60, 30);
		getContentPane().add(bPierwiastek);
		bPierwiastek.addActionListener(this);
		
		bCzysc = new JButton("C");
		bCzysc.setBounds(260, 140, 60, 90);
		getContentPane().add(bCzysc);
		bCzysc.addActionListener(this);
		
		bRownaSie = new JButton("=");
		bRownaSie.setBounds(260, 110, 60, 30);
		getContentPane().add(bRownaSie);
		bRownaSie.addActionListener(this);
		
		
		tWynik = new JTextField("");
		tWynik.setHorizontalAlignment(SwingConstants.RIGHT);
		tWynik.setBounds(20, 50, 300, 60);
		tWynik.setEditable(false);
		getContentPane().add(tWynik);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object zrodlo = e.getSource();
		
		if(zrodlo == bLiczba0){
			wyrazenie = wyrazenie + "0";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba1){
			wyrazenie = wyrazenie + "1";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba2){
			wyrazenie = wyrazenie + "2";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba3){
			wyrazenie = wyrazenie + "3";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba4){
			wyrazenie = wyrazenie + "4";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba5){
			wyrazenie = wyrazenie + "5";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba6){
			wyrazenie = wyrazenie + "6";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba7){
			wyrazenie = wyrazenie + "7";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba8){
			wyrazenie = wyrazenie + "8";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bLiczba9){
			wyrazenie = wyrazenie + "9";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bPlus){
			wyrazenie = wyrazenie + "+";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bMinus){
			wyrazenie = wyrazenie + "-";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bMnozenie){
			wyrazenie = wyrazenie + "*";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bDzielenie){
			wyrazenie = wyrazenie + "/";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bPierwiastek){
			wyrazenie = wyrazenie + "sqrt";
			tWynik.setText(wyrazenie);
		} else if(zrodlo == bCzysc){
			wyrazenie = "";
			tWynik.setText(wyrazenie);
		}
		
	}

	public static void main(String[] args) {
		Kalkulator aplikacja = new Kalkulator();
		aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplikacja.setVisible(true);
	}

}
