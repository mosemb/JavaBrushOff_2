package com.chapter13;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayOut {
	
	public static void main(String []args) {
		BorderLayOut button1 = new BorderLayOut();
		button1.go();
		
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		JButton button2 = new JButton("Really very long text");
		JButton button3 = new JButton("Button on the North");
		JButton button4 = new JButton("Center");
		JButton button5 = new JButton("South");
		Font font = new Font("serif", Font.BOLD, 18);
		button3.setFont(font);
		
		frame.getContentPane().add(BorderLayout.EAST, button);
		frame.getContentPane().add(BorderLayout.WEST,button2);
		frame.getContentPane().add(BorderLayout.NORTH,button3);
		frame.getContentPane().add(BorderLayout.CENTER,button4);
		frame.getContentPane().add(BorderLayout.SOUTH,button5);
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
	

}
