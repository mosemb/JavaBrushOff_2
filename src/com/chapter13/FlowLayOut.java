package com.chapter13;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayOut {
	
	public static void main(String []args) {
		FlowLayOut flowLayOut = new FlowLayOut();
		flowLayOut.go();
		
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Click Me");
		JButton button2 = new JButton("Button 2");
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(button);
		panel.add(button2);
		
		
		
		panel.setBackground(Color.BLUE);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}

}
