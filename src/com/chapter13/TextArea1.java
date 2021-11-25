package com.chapter13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class TextArea1 implements ActionListener {
	
	JTextArea textArea;
	
	public static void main(String []args) {
		
		TextArea1 txArea1 = new TextArea1();
		txArea1.go();
		//txArea1.actionPerformed(arg0);
		
		
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Click this");
		button.addActionListener(this);
		
		textArea = new JTextArea(20,30);
		textArea.setLineWrap(true);
		
		// Set scroll bar
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane);
		
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		
		frame.setSize(350,350);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		textArea.append("Button clicked \n");
		
	}

}
