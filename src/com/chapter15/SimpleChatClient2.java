package com.chapter15;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class SimpleChatClient2 {

	JTextArea textArea;
	JTextArea outgoingJTextArea;
	Socket socket;
	PrintWriter writer;
	BufferedReader reader;

	public static void main(String[] args) {

		SimpleChatClient2 client = new SimpleChatClient2();
		client.go();

		// new SimpleChatClient2().go();

	}

	public void go() {
		JFrame frame = new JFrame("Simple Chat");
		JPanel panel = new JPanel();
		textArea = new JTextArea(20, 20);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		outgoingJTextArea = new JTextArea(10, 10);
		outgoingJTextArea.setLineWrap(true);
		outgoingJTextArea.setWrapStyleWord(true);
		outgoingJTextArea.setEditable(true);

		JButton button = new JButton("Send");
		button.addActionListener(new SendButtonListner());

		panel.add(scrollPane);
		panel.add(button);
		panel.add(outgoingJTextArea);

		networking();

		Thread rThread = new Thread(new IncomingMessages());
		rThread.start();

		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.setSize(800, 500);
		frame.setVisible(true);

	}

	public void networking() {

		try {
			socket = new Socket("127.0.0.1", 4000);
			// writer = new PrintWriter(socket.getOutputStream());
			// System.out.println("Network established ");

			InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(socket.getOutputStream());
			System.out.println("networking established");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public class SendButtonListner implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

			try {

				writer.println(outgoingJTextArea.getText());
				writer.flush();

			} catch (Exception e) {
				// TODO: handle exception
			}

			outgoingJTextArea.setText("");
			outgoingJTextArea.requestFocus();

		}

	}

	public class IncomingMessages implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			String messageString;
			try {

				while ((messageString = reader.readLine()) != null) {
					System.out.println("read " + messageString);
					textArea.append(messageString + "\n");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
