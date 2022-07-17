package me.revo.install;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		JButton btn3 = new JButton();
		
		JDialog dl = new JDialog();
		JDialog dl2 = new JDialog();
		
		JLabel txtinstall = new JLabel();
		
		fenetre.add(btn1);
		dl.add(btn2);
		dl2.add(btn3);
		
		btn1.setText("installer");
		btn2.setText("oui je suis sure, installer");
		btn3.setText("installation terminée, vous pouvez cliquer ici pour fermer");
		txtinstall.setText("installation en cours, veuillez patienter");
		
		fenetre.setVisible(true);
		btn1.setVisible(true);
		btn3.setVisible(true);
		txtinstall.setVisible(false);
		
		fenetre.setSize(500, 500);
		dl.setSize(300, 300);
		dl2.setSize(300, 300);
		
		fenetre.setTitle("fentre tuto");
		fenetre.setTitle("etes-vous sure");
		
		fenetre.setLocationRelativeTo(null);
		dl.setLocationRelativeTo(null);
		dl2.setLocationRelativeTo(null);
		
		fenetre.setResizable(false);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dl.setVisible(true);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dl.setVisible(false);
				btn1.setVisible(false);
				fenetre.add(txtinstall);
				txtinstall.setVisible(true);
				
				dl2.setVisible(true);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}