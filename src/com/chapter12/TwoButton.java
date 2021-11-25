package com.chapter12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TwoButton   {
	
	JFrame frame; 
	JLabel label;
	
	public static void main (String []args) {
		TwoButton buttonsButton = new TwoButton();
		buttonsButton.go();
		
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelbutton = new JButton("Change Label");
		labelbutton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Color");
		colorButton.addActionListener(new ButtonListner());
		
		label = new JLabel("Am a label");
		
		MyDrawPanel drawPanel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
		frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
		frame.getContentPane().add(BorderLayout.EAST,labelbutton);
		frame.getContentPane().add(BorderLayout.WEST,label);
		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch");
		}
		
	}
	
	public class ButtonListner implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
			
		}
		
	}

}
