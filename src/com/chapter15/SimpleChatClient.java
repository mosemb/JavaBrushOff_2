package com.chapter15;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class SimpleChatClient {
	
	JTextField textField;
	Socket socket;
	PrintWriter writer;
	
	public void go() {
		JFrame frame = new JFrame("Simple Text Field");
		JPanel panel = new JPanel();
		textField = new JTextField(20);
		
		
		JButton button = new JButton("Send");
		button.addActionListener(new SendButtonListner());
		panel.add(textField);
		panel.add(button);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		networking();
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	public void networking() {
		
		try {
			socket = new Socket("127.0.0.1",4000);
			writer = new PrintWriter(socket.getOutputStream());
			System.out.println("Network established ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public class SendButtonListner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			try {
				
				writer.println(textField.getText());
				writer.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			textField.setText("");
			textField.requestFocus();
			
		}
		
		
	}
	
	public static void main (String []args) {
		
		new SimpleChatClient().go();
		
	}

}
