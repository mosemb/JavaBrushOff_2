package com.chapter12;
import javax.swing.*;


import java.awt.event.*;





public class SimpleGui implements ActionListener {
	
	JButton button;
	
	public static void main(String []args) {
		
		SimpleGui gui = new SimpleGui();
		gui.go();
	}
	
	public void go() {

		JFrame frame = new JFrame();
		button = new JButton("Click Me!");
		
		button.addActionListener(this); // Listens to the actions performed 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Program closes as soon as window is closed
		frame.getContentPane().add(button); // Add the button on the window
		frame.setSize(300,300); // set frame size 
		frame.setVisible(true); // make the window to be visible 
		
	}
	
	public void actionPerformed(ActionEvent event) {
		
		button.setText("I have been Clicked");
	}
	

}
